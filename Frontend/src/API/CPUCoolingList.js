import React, { Component } from "react";
import axios from "axios";
import CPUCoolingCard from "../Cards/CPUCoolingCard";

class CPUCoolingList extends Component {
  constructor(props) {
    super(props);

    this.state = {
      products: [],
    };
  }

  componentDidMount() {
    axios.get("http://localhost:8080/CPUCooler").then((response) => {
      this.setState({
        products: response.data,
      });
      console.log(response.data);
    });
  }

  render() {
    const { products } = this.state;
    return (
      <div>
        <h1>CPU Coolings</h1>
        {products.map((product) => (
          <div className="wrapper">
            <CPUCoolingCard
              img={product.url}
              title={product.name}
              price={product.price}
              brand={product.brand}
              warranty={product.warranty}
              id={product.id}
            />{" "}
          </div>
        ))}
      </div>
    );
  }
}

export default CPUCoolingList;
