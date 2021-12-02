import React, { useState } from "react";
import { Typography, Button, Form, message, Input, Icon } from "antd";
import Axios from "axios";

const { Title } = Typography;
const { TextArea } = Input;

function CPUCreation(props){

    const [TitleValue, setTitleValue] = useState("");
    const [BrandValue, setBrandValue] = useState("");
    const [PriceValue, setPriceValue] = useState(0);
    const [WarrantyValue, setWarrantValue] = useState(0);
    const [URLValue, setURLValue] = useState("");
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
  
    const onProductsSelectChange = (event) => {
      setProductValue(event.currentTarget.value);
    };
  
    const onSubmit = (event) => {
      event.preventDefault();
  
      if (!TitleValue || !BrandValue || !PriceValue || !WarrantyValue || !URLValue || !ProductValue) {
        return alert("fill all the fields first!");
      }
  
      const variables = {
        title: props.title,
        brand: props.brand,
        price: props.price,
        warranty: props.warranty,
        url: props.url,
        products: ProductValue,
      };
  
      if (ProductValue == 1) {
        Axios.post("/api/product/uploadProduct", variables).then((response) => {
          if (response.data.success) {
            alert("Product Successfully Uploaded");
            props.history.push("/");
          } else {
            alert("Failed to upload Product");
          }
        });
      } else {
      }
    };
  
    return (
      <div style={{ maxWidth: "700px", margin: "2rem auto" }}>
        <div style={{ textAlign: "center", marginBottom: "2rem" }}>
          <Title level={2}>Specify the details of the CPU product</Title>
        </div>
        <Form onSubmit={onSubmit}>
          <br />
          <br />
          <label>Title: </label>
          <Input value={props.title} placeholder={props.title}/>
          <br />
          <br />
          <label>Brand: </label>
          <Input value={props.brand} />
          <br />
          <br />
          <label>Price($)</label>
          <Input value={props.price} type="number" />
          <br />
          <br />
          <label>Warranty</label>
          <Input value={props.warranty} type="number" />
          <br />
          <br />
          <label>Image URL: </label>
          <Input  value={props.url} />
          <br />
          <br />

  
          <Button onClick={onSubmit}>Next</Button>
        </Form>
      </div>
    );
}

export default CPUCreation