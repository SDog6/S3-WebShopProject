import React, { Component } from "react";
import axios from "axios";
import {
  Card,
  CardImg,
  CardText,
  CardBody,
  CardTitle,
  CardSubtitle,
  Button,
} from "reactstrap";
import jwtDecode from "jwt-decode";
import "../styles/Account.css"

class Account extends Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [],
    };
  }

  componentDidMount() {
    const token = localStorage.getItem("token");
    var role = "";
    var sub = "";
    if (token != null) {
      const decoded = jwtDecode(token);
      role = decoded.role;
      sub = decoded.sub;
    }

    if (role === "USER") {
      axios.get(`http://localhost:8080/Order/ByUser/${sub}`, 
      {headers: {"Authorization" : `${localStorage.getItem("token")}`}}).then((response) => {
        this.setState({
          items: response.data,
        });
        console.log(this.state.items);
      });
    } else {
        axios.get(`http://localhost:8080/Order`, 
        {headers: {"Authorization" : `${localStorage.getItem("token")}`}}).then((response) => {
            this.setState({
              items: response.data,
            });
            console.log(this.state.items);
            console.log(this.state.items.username);
          });
    }
  }

  render() {
    if (this.state.items.length === 0) {
        return (
          <h2 className={`NoOrders`} style={{ textAlign: "center" }}>
            You have not ordered anything yet!
          </h2>
        );
      } else {
    return (
      <div className="vehicle">
        <label htmlFor="vehicle" style={{ fontSize: "40px" }}>
          Orders
        </label>
        <div className="grid-container">
          {this.state.items.map((order) => (
            <div>
              <div className="wrapper">
                <Card>
                  <CardBody>
                    <CardTitle
                      className="lpate"
                      style={{ fontWeight: "bolder" }}
                    >
                      {order.username}'s Order
                    </CardTitle>
                    <CardSubtitle>
                      Will be delivered to :{order.address}
                    </CardSubtitle>
                    
                    <CardSubtitle>
                      Total Price Of Order :{order.price}
                    </CardSubtitle>
                    --------------------------- Items Ordered:
                    {order.productsnr.map((products) => (
                      <CardSubtitle>{products.product.name} X {products.amount}</CardSubtitle>
                    ))}
                  </CardBody>
                </Card>
                <br></br>
              </div>
            </div>
          ))}
        </div>
      </div>
    );}
  }
}
export default Account;
