import React, { useState } from "react";
import { Typography, Button, Form, message, Input, Icon } from "antd";
import Axios from "axios";


const { Title } = Typography;
const { TextArea } = Input;

function CreateStoragePage(props) {
  const [TitleValue, setTitleValue] = useState("");
  const [BrandValue, setBrandValue] = useState("");
  const [PriceValue, setPriceValue] = useState(0);
  const [WarrantyValue, setWarrantValue] = useState(0);
  const [URLValue, setURLValue] = useState("");
  const [Type, setType] = useState("");
  const [Amount, setAmount] = useState(0);
  const [WriteSpeed, setWriteSpeed] = useState(0);
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
    if (!TitleValue || !BrandValue || !PriceValue || !WarrantyValue || !URLValue || !Type || !Amount || !WriteSpeed ) {
      SetMessage("Fill all the fields first!");
    }
    else {
    let storage = {
      name: TitleValue,
      brand: BrandValue,
      price: PriceValue,
      warranty: WarrantyValue,
      url: URLValue,
      type : Type,
      amount : Amount,
      writespeed : WriteSpeed

    };

    Axios.post('http://localhost:8080/Storage', storage, 
    {headers: {"Authorization" : `${localStorage.getItem("token")}`}}).then((response) => {
        console.log(response.data)
        SetMessage("Product created!");
      },
      (error) => {
        SetMessage("Please check your fields!");
      });
    }
  };

  return (
    <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
      <div style={{ textAlign: "center", marginBottom: "2rem" }}>
        <Title level={2}>Please specify the details of the Storage you want to create</Title>
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
        <label>Type: </label>
        <Input onChange={(event) => setType(event.target.value)} value={Type} />
        <br />
        <br />  <label>Amount in GB: </label>
        <Input onChange={(event) => setAmount(event.target.value)} value={Amount} type="number"/>
        <br />
        <br />  <label>Write Speed: </label>
        <Input onChange={(event) => setWriteSpeed(event.target.value)} value={WriteSpeed} type="number"/>
        <br />
        <br />
        
        <Button onClick={onSubmit}>Save Storage</Button>
        { <p className="m"> { Message } </p> }
      </Form>
    </div>
  );
}

export default CreateStoragePage;
