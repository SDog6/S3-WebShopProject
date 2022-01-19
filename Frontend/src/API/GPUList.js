import React, { Component } from "react";
import axios from "axios";
import Card from "../Cards/Card";
import GPUCard from "../Cards/GPUCard";

class GPUList extends Component {
  constructor(props) {
    super(props);

    this.state = {
      products: [],
    };
  }

  componentDidMount() {
    axios.get("http://localhost:8080/GPU", 
    {headers: {"Authorization" : `${localStorage.getItem("token")}`}}).then((response) => {
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
        <h1>GPUs</h1>
        {products.map((product) => (
          <div className="wrapper">
            <GPUCard
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

export default GPUList;
