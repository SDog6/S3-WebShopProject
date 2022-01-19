import React, { useState } from "react";
import { Typography, Button, Form, message, Input, Icon } from "antd";
import Axios from "axios";


const { Title } = Typography;
const { TextArea } = Input;

function CreateMotherboardPage(props) {
  const [TitleValue, setTitleValue] = useState("");
  const [BrandValue, setBrandValue] = useState("");
  const [PriceValue, setPriceValue] = useState(0);
  const [WarrantyValue, setWarrantValue] = useState(0);
  const [URLValue, setURLValue] = useState("");
  const [Chipset, setChipset] = useState("");
  const [Wifi, setWifi] = useState(false);
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

    if (!TitleValue || !BrandValue || !PriceValue || !WarrantyValue || !URLValue || !Chipset || !thewifi ) {
      SetMessage("Fill all the fields first!");
    }
    else {

    var thewifi;

    if(Wifi === "yes"){
      thewifi = true;
    }
    else {
      thewifi = false
    }

    let mo = {
      name: TitleValue,
      brand: BrandValue,
      price: PriceValue,
      warranty: WarrantyValue,
      url: URLValue,
      chipset : Chipset,
      wifi : thewifi
    };

    Axios.post('http://localhost:8080/Motherboard', mo, 
    {headers: {"Authorization" : `${localStorage.getItem("token")}`}}).then((response) => {
        console.log(response.data)
        SetMessage("Product created!");
      },
      (error) => {
          console.log(error);
          SetMessage("Please check your fields fields!");
        });
      }
  };

  return (
    <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
      <div style={{ textAlign: "center", marginBottom: "2rem" }}>
        <Title level={2}>Please specify the details of the Motherboard you want to create</Title>
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
        <label>Chipset</label>
        <Input onChange={(event) => setChipset(event.target.value)} value={Chipset} type="number" />
        <br />
        <br />
        <label>Wifi</label>
        <br />
        <div onChange={(event) => setWifi(event.target.value)}>
        <input type="radio" value="yes" name="gender" /> Yes
<br />
<input type="radio" value="no" name="gender" /> No
</div>


        <br />
        <br />
        <Button onClick={onSubmit}>Save Motherboard</Button>
        { <p className="m"> { Message } </p> }

      </Form>
    </div>
  );
}

export default CreateMotherboardPage;
