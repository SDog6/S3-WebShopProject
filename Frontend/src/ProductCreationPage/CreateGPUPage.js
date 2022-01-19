import React, { useState } from "react";
import { Typography, Button, Form, message, Input, Icon } from "antd";
import Axios from "axios";


const { Title } = Typography;
const { TextArea } = Input;

function CreateGPUPage(props) {
  const [TitleValue, setTitleValue] = useState("");
  const [BrandValue, setBrandValue] = useState("");
  const [PriceValue, setPriceValue] = useState(0);
  const [WarrantyValue, setWarrantValue] = useState(0);
  const [URLValue, setURLValue] = useState("");
  const [ClockSpeedValue, setClockSpeedValue] = useState(0);
  const [PowerConsumValue, setPowerConsumValue] = useState(0);
  const [Vram, setVramValue] = useState("");
  const [lenghtValue, setlenghtValue] = useState(0);
  const [WidthsValue, setWidthsValue] = useState(0);
  const [HeightValue, setHeightValue] = useState(1);
  const [HDMIProtsValue, setHDMIPortsValue] = useState(1);
  const [DisplayPortsValue, setDisplayPortsValue] = useState(1);
  const [FansValue, setFansValue] = useState(1);
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

  const onClockSpeedChange = (event) => {
    setClockSpeedValue(event.currentTarget.value);
  };

  const onVramChange = (event) => {
    setVramValue(event.currentTarget.value);
  };

  const onLenghtChange = (event) => {
    setlenghtValue(event.currentTarget.value);
  };

  const onWidthChange = (event) => {
    setWidthsValue(event.currentTarget.value);
  };

  const onHeightChange = (event) => {
    setHeightValue(event.currentTarget.value);
  };

  const onHDMIChange = (event) => {
    setHDMIPortsValue(event.currentTarget.value);
  };
    const onDisplayChange = (event) => {
    setDisplayPortsValue(event.currentTarget.value);
  }; 
   const onFansChange = (event) => {
    setFansValue(event.currentTarget.value);
  };

  const onSubmit = (event) => {
    event.preventDefault();

    if (!TitleValue || !BrandValue || !PriceValue || !WarrantyValue || !URLValue || !ClockSpeedValue|| !Vram ||!lenghtValue ||!WidthsValue ||!HeightValue|| !HDMIProtsValue || !DisplayPortsValue || !FansValue) {
      SetMessage("Fill all the fields first!");
    }
    else {

    let gpu = {
      name: TitleValue,
      brand: BrandValue,
      price: PriceValue,
      warranty: WarrantyValue,
      url: URLValue,
      clockspeed: ClockSpeedValue,
      vram : Vram,
      lenght: lenghtValue,
      width: WidthsValue,
      height : HeightValue,
      hdmiports : HDMIProtsValue,
      displayports : DisplayPortsValue,
      fans : FansValue

    };

    Axios.post('http://localhost:8080/GPU', gpu, 
    {headers: {"Authorization" : `${localStorage.getItem("token")}`}}).then((response) => {
        console.log(response.data)
        SetMessage("Product created!");
      },
      (error) => {
          console.log(error);
          SetMessage("Please check your fields !");
        });
      }
  };

  return (
    <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
      <div style={{ textAlign: "center", marginBottom: "2rem" }}>
        <Title level={2}>Please specify the details of the GPU you want to create</Title>
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
        <label>VRAM</label>
        <Input onChange={onVramChange} value={Vram} type="number" />
        <br />
        <br />
        <label>Lenght</label>
        <Input onChange={onLenghtChange} value={lenghtValue} type="number"/>
        <br />
        <br />
        <label>Width</label>
        <Input onChange={onWidthChange} value={WidthsValue} type="number" />
        <br />
        <br />
        <label>Height</label>
        <Input onChange={onHeightChange} value={HeightValue} type="number" />
        <br />
        <br />
        <label>HDMI Prots</label>
        <Input onChange={onHDMIChange} value={HDMIProtsValue} type="number" />
        <br />
        <br />
        <label>Display ports</label>
        <Input onChange={onDisplayChange} value={DisplayPortsValue} type="number" />
        <br />
        <br />
        <label>Fans</label>
        <Input onChange={onFansChange} value={FansValue} type="number" />
        <br />
        <br />
        <Button onClick={onSubmit}>Save GPU</Button>
        { <p className="m"> { Message } </p> }

      </Form>
    </div>
  );
}

export default CreateGPUPage;
