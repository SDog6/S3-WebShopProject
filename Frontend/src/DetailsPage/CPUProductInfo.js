import { Component } from "react";
import React, { useEffect, useState } from "react";
import { Button, Table } from "react-bootstrap";
import { DataContext } from "../Components/Cart/Context";

export class ProductInfo extends Component {
 
  static contextType = DataContext;


  constructor(props) {
    super(props)
    this.state = {
     
    }
  }


render(){
  const {addCart,products} = this.context;

  return (
    <>
      <Table striped bordered hover size="sm" className="table">
        <thead>
          <tr>
            <th>Description</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td> Brand: {this.props.Product.brand}</td>
          </tr>
          <tr>
            <td colspan="1"> Warranty: {this.Product.warranty} years</td>
          </tr>
          <tr>
            <td colspan="1"> Brand: {this.Product.brand}</td>
          </tr>
          <tr>
            <td colspan="1"> Clock speed: {this.Product.clockspeed} Hz</td>
          </tr>
          <tr>
            <td colspan="1"> Power consumtion: {this.Product.powerconsum} Watt</td>
          </tr>
          <tr>
            <td colspan="1"> Socket: {this.Product.socket}</td>
          </tr>
          <tr>
            <td colspan="1"> Cores: {this.Product.cores}</td>
          </tr>
          <tr>
            <td colspan="1"> Threads: {this.Product.threads}</td>
          </tr>
        </tbody>
      </Table>
      <div className="buttonGroup">

<h4>{this.Product.price} $</h4>
        <Button
          size="large"
          shape="round"
          type="danger"
          onClick={()=> addCart(this.props.id)}
        >
          Add to Cart
        </Button>
      </div>
    </>
  );
}
 
}

export default ProductInfo;
