import React, { useState } from "react";
import { Typography, Button, Form, message, Input, Icon } from "antd";
import Axios from "axios";


const { Title } = Typography;
const { TextArea } = Input;

function CreateRAMPage(props) {
  const [TitleValue, setTitleValue] = useState("");
  const [BrandValue, setBrandValue] = useState("");
  const [PriceValue, setPriceValue] = useState(0);
  const [WarrantyValue, setWarrantValue] = useState(0);
  const [URLValue, setURLValue] = useState("");
  const [Amount, setAmont] = useState("");
  const [Voltage, setVoltage] = useState("");





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

    let ram = {
      name: TitleValue,
      brand: BrandValue,
      price: PriceValue,
      warranty: WarrantyValue,
      url: URLValue,
      amount : Amount,
      voltage : Voltage

    };

    Axios.post('http://localhost:8080/RAM', ram).then((response) => {
        console.log(response.data)
        alert("Product Successfully Uploaded");
      });
  };

  return (
    <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
      <div style={{ textAlign: "center", marginBottom: "2rem" }}>
        <Title level={2}>Please specify the details of the RAM you want to create</Title>
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
        <label>Amount: </label>
        <Input onChange={(event) => setAmont(event.target.value)} value={Amount} type="number" />
        <br />
        <br />
        <label>Voltage: </label>
        <Input onChange={(event) => setVoltage(event.target.value)} value={Voltage} type="number"/>
        <br />
        <br />
        <Button onClick={onSubmit}>Save RAM</Button>
      </Form>
    </div>
  );
}

export default CreateRAMPage;
