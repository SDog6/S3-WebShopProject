import React, { useEffect, useState } from "react";
import axios from "axios";
import { Card } from "react-bootstrap";
import "../styles/SearchCard.css";
import { Component } from "react";
import { DataContext } from "../Components/Cart/Context";
import { Button, Table } from "react-bootstrap";


export class GPUSearch extends Component {

   static contextType = DataContext;

  constructor(props) {
    super(props)
    this.state = {
      PropsName : this.props.match.params.name,
      Product : ""
    }
  }

  componentDidMount(){
    axios
    .get(`http://localhost:8080/BasicProduct/Name/${this.state.PropsName}`)
    .then((response) => {
      console.log(response.data)
      this.setState({Product : response.data})
    });}
 
    render(){
  const {addCart} = this.context;

    
  return (
    <>
      <Card className="productPage">
        <Card.Img src={this.state.Product.url}></Card.Img>
        <div className="card-options">
          <div className="titleCard2">
            <h1>{this.state.Product.name}</h1>
          </div>

          <Card.Body>
          <Table striped bordered hover size="sm" className="table">
        <thead>
          <tr>
            <th>Description</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td> Brand: {this.state.Product.brand}</td>
          </tr>
          <tr>
            <td colspan="1"> Warranty: {this.state.Product.warranty} years</td>
          </tr>
          <tr>
            <td colspan="1"> Clock speed: {this.state.Product.clockspeed}</td>
          </tr>
          <tr>
            <td colspan="1"> VRAM: {this.state.Product.vram}</td>
          </tr>
          <tr>
            <td colspan="1"> Lenght: {this.state.Product.lenght}</td>
          </tr>
          <tr>
            <td colspan="1"> Width: {this.state.Product.width}</td>
          </tr>
          <tr>
            <td colspan="1"> Height: {this.state.Product.height}</td>
          </tr>
          <tr>
            <td colspan="1"> HDMI ports: {this.state.Product.hdmiports}</td>
          </tr>
          <tr>
            <td colspan="1"> Display ports: {this.state.Product.displayports}</td>
          </tr>
          <tr>
            <td colspan="1"> Fans: {this.state.Product.fans}</td>
          </tr>
        </tbody>
      </Table>

<h4>{this.state.Product.price} $</h4>
        <Button
          size="large"
          shape="round"
          type="danger"
          onClick={()=> addCart(this.state.Product.id)}
        >
          Add to Cart
        </Button>
          </Card.Body>
        </div>
      </Card>
    </>
  );

    }

}

export default GPUSearch;
