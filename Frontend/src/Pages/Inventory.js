import React, { useState } from "react";
import { Typography, Button, Form, message, Input, Icon } from "antd";
import Axios from "axios";
import { InputGroup, FormControl } from "react-bootstrap";
import AddingNav from "../Components/AddingNav";
import CPUCreation from "../ProductCreationPage/CPUCreation"

const { Title } = Typography;
const { TextArea } = Input;

const Products = [
  { key: 1, value: "CPU" },
  { key: 2, value: "CPU Cooling" },
  { key: 3, value: "GPU" },
  { key: 4, value: "Motherboard" },
  { key: 5, value: "Power supply" },
  { key: 6, value: "RAM" },
  { key: 7, value: "Storage" },
];

function UploadProductPage(props) {
  const [TitleValue, setTitleValue] = useState("");
  const [BrandValue, setBrandValue] = useState("");
  const [PriceValue, setPriceValue] = useState(0);
  const [WarrantyValue, setWarrantValue] = useState(0);
  const [URLValue, setURLValue] = useState("");
  const [ClockSpeedValue, setClockSpeedValue] = useState(0);
  const [PowerConsumValue, setPowerConsumValue] = useState(0);
  const [SocketValue, setSocketValue] = useState("");
  const [CoresValue, setCoresValue] = useState(0);
  const [ThreadsValue, setThreadsValue] = useState(0);
  const [ProductValue, setProductValue] = useState(1);


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

  const onClockSpeedChange = (event) => {
    setClockSpeedValue(event.currentTarget.value);
  };

  const onPowerConsumChange = (event) => {
    setPowerConsumValue(event.currentTarget.value);
  };

  const onSocketChange = (event) => {
    setSocketValue(event.currentTarget.value);
  };

  const onCoresChange = (event) => {
    setCoresValue(event.currentTarget.value);
  };

  const onThreadsChange = (event) => {
    setThreadsValue(event.currentTarget.value);
  };

  const onProductsSelectChange = (event) => {
    setProductValue(event.currentTarget.value);
  };

  const onSubmit = (event) => {
    event.preventDefault();

    if (!TitleValue || !BrandValue || !PriceValue || !WarrantyValue || !URLValue || !ProductValue) {
      return alert("fill all the fields first!");
    }

    let cpu = {
      name: TitleValue,
      brand: BrandValue,
      price: PriceValue,
      warranty: WarrantyValue,
      url: URLValue,
      clockspeed: ClockSpeedValue,
      powerconsum : PowerConsumValue,
      socket: SocketValue,
      cores: CoresValue,
      threads : ThreadsValue,
    };

    Axios.post('http://localhost:8080/CPU', cpu).then((response) => {
        console.log(response.data)
         
          alert("Product Successfully Uploaded");
        
      });


  };

  return (
    <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
      <div style={{ textAlign: "center", marginBottom: "2rem" }}>
        <Title level={2}>Please specify the details of the CPU you want to create</Title>
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
        <label>Clock speed</label>
        <Input onChange={onClockSpeedChange} value={ClockSpeedValue} type="number" />
        <br />
        <br />
        <label>Power consumtion</label>
        <Input onChange={onPowerConsumChange} value={PowerConsumValue} type="number" />
        <br />
        <br />
        <label>Socket</label>
        <Input onChange={onSocketChange} value={SocketValue} />
        <br />
        <br />
        <label>Cores</label>
        <Input onChange={onCoresChange} value={CoresValue} type="number" />
        <br />
        <br />
        <label>Threads</label>
        <Input onChange={onThreadsChange} value={ThreadsValue} type="number" />
        <br />
        <br />
        {/* <select onChange={onProductsSelectChange} value={ProductValue}>
          {Products.map((item) => (
            <option key={item.key} value={item.key}>
              {item.value}{" "}
            </option>
          ))}
        </select> */}

        <Button onClick={onSubmit}>Save CPU</Button>
      </Form>
    </div>
  );
}

export default UploadProductPage;
