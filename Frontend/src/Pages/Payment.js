import React, { Component } from "react";
import "../styles/Cart.css";
import { Button } from "reactstrap";
import { Link } from "react-router-dom";
import "../styles/Payment.css";
import jwtDecode from "jwt-decode";
import axios from "axios";
import Cart from "../Components/Cart/Cart";

class Payment extends Component {
  orderItems = (hndl) => {
    hndl.preventDefault();
    var CartItems = localStorage.getItem("dataCart");
    var CartTotal = localStorage.getItem("dataTotal");
    var username = null;

    const token = localStorage.getItem("token");
    if (token != null) {
      const decoded = jwtDecode(token);
      username = decoded.sub;
    }

    var pls = JSON.parse(CartItems)

    console.log(pls)
    console.log(CartItems)

    axios
      .post(`http://localhost:8080/Order`,{ products : pls,username:username,price:CartTotal})
      .then((response) => {
        console.log(response.data);
        localStorage.removeItem("dataCart")
        localStorage.removeItem("dataTotal")
        alert("Order created");
      }, (error) => {
        alert("We do not have enough of that item in stock right now !");
      });
  };

  render() {
    return (
      <div>
        <div className="radio-buttons">
          Pay by card
          <input
            disabled="true"
            id="windows"
            value="windows"
            name="platform"
            type="radio"
            onChange={this.handleChange}
          />
        </div>
        <div className="radio-buttons">
          Pay with cash on arrival
          <input
            id="mac"
            value="mac"
            name="platform"
            type="radio"
            checked="true"
            onChange={this.handleChange}
          />
        </div>
        <div className="order">
          <Button color="secondary" onClick={this.orderItems}>
            Order
          </Button>{" "}
        </div>
      </div>
    );
  }
}
export default Payment;
