import React, { Component } from "react";
import "../styles/Cart.css";
import { Button } from "reactstrap";
import "../styles/Payment.css";
import jwtDecode from "jwt-decode";
import axios from "axios";
import { Input,Label } from "reactstrap";
import { DataContext } from "../Components/Cart/Context";

class Payment extends Component {
  constructor(props) {
    super(props);
    this.state = {
      address: "",
      message: ""
    };
  }

  static contextType = DataContext;

  orderItems = (hndl) => {
    hndl.preventDefault();
    if (!this.state.address) {
      this.setState({message :"Please select an address for delivery"});
    }
    else{
      const {emptryCart} = this.context;
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
      .post(`http://localhost:8080/Order`,{ id : 1,products : pls,username:username,price:CartTotal,address : this.state.address}, 
      {headers: {"Authorization" : `${localStorage.getItem("token")}`}})
      .then((response) => {
        console.log(response.data);
        if(response.data === "BAD_REQUEST"){
          this.setState({message :"We do not have enough of that item in stock right now !"});
        }
        else {
          localStorage.removeItem("dataCart")
          localStorage.removeItem("dataTotal")
          emptryCart();
          this.setState({message : "Order created"});
        }
       
      }, (error) => {
        this.setState({message : "We do not have enough of that item in stock right now !"});
      });
    }
    
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
        <Label for="Name">Address:</Label>
        <Input
         type = "name"
            name="name"
            id = "name"
            placeholder="Address"
            value={this.state.address}
            onChange={(event) => this.setState({address : event.target.value})}
          />



      

        </div>
        <Button color="secondary" onClick={this.orderItems}>
            Order
          </Button>{" "}
          <br/>
        { <p className="m"> { this.state.message } </p> }

      </div>
    );
  }
}
export default Payment;
