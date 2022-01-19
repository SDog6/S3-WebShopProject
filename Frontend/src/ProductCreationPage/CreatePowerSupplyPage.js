import React, { useState } from "react";
import { Typography, Button, Form, message, Input, Icon } from "antd";
import Axios from "axios";


const { Title } = Typography;
const { TextArea } = Input;

function CreatePowerSupplyPage(props) {
  const [TitleValue, setTitleValue] = useState("");
  const [BrandValue, setBrandValue] = useState("");
  const [PriceValue, setPriceValue] = useState(0);
  const [WarrantyValue, setWarrantValue] = useState(0);
  const [URLValue, setURLValue] = useState("");
  const [Capacity, setCapacity] = useState(0);
  const [Message, SetMessage] = useState("");


 

  const onTitleChange = (event) => {
    setTitleValue(event.currentTarget.value);
  };

  const onBrandChange = (event) => {
    setBrandValue(event.currentTarget.value);
  };

  const onPriceChange = (event) => {
    setPriceValue(event.currentTarget.value);
  };

  const onWarrantyChange = (event) => {
    setWarrantValue(event.currentTarget.value);
  };

  const onURLChange = (event) => {
    setURLValue(event.currentTarget.value);
  };

  const onSubmit = (event) => {
    event.preventDefault();
    if (!TitleValue || !BrandValue || !PriceValue || !WarrantyValue || !URLValue || !Capacity ) {
      SetMessage("Fill all the fields first!");
    }
    else {

    let power = {
      name: TitleValue,
      brand: BrandValue,
      price: PriceValue,
      warranty: WarrantyValue,
      url: URLValue,
      capacity : Capacity

    };

    Axios.post('http://localhost:8080/PowerSupply', power, 
    {headers: {"Authorization" : `${localStorage.getItem("token")}`}}).then((response) => {
        console.log(response.data)
        SetMessage("Product created!");
      },
      (error) => {
          console.log(error);
          SetMessage("Please check your fields!");
        });}
  };

  return (
    <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
      <div style={{ textAlign: "center", marginBottom: "2rem" }}>
        <Title level={2}>Please specify the details of the Power Supply you want to create</Title>
      </div>
      <Form onSubmit={onSubmit}>
        <br />
        <br />
        <label>Title: </label>
        <Input onChange={onTitleChange} value={TitleValue} />
        <br />
        <br />
        <label>Brand: </label>
        <Input onChange={onBrandChange} value={BrandValue} />
        <br />
        <br />
        <label>Price($)</label>
        <Input onChange={onPriceChange} value={PriceValue} type="number" />
        <br />
        <br />
        <label>Warranty</label>
        <Input onChange={onWarrantyChange} value={WarrantyValue} type="number" />
        <br />
        <br />
        <label>Image URL: </label>
        <Input onChange={onURLChange} value={URLValue} />
        <br />
        <br />
        <label>Capacity: </label>
        <Input onChange={(event) => setCapacity(event.target.value)} value={Capacity} type="number"/>
        <br />
        <br />
        <Button onClick={onSubmit}>Save Power Supply</Button>
        { <p className="m"> { Message } </p> }

      </Form>
    </div>
  );
}

export default CreatePowerSupplyPage;
