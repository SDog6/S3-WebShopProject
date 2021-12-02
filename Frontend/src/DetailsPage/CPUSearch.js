import React, { useEffect, useState } from "react";
import axios from "axios";
import { Row, Col } from "antd";
import ProductInfo from "./CPUProductInfo";
import { Card } from "react-bootstrap";
import "../styles/SearchCard.css"

function CPUSearch(props) {
  const PropsName = props.match.params.name;
  const [Product, setProduct] = useState([]);

  useEffect(() => {
    axios
      .get(`http://localhost:8080/CPU/Name/${PropsName}`)
      .then((response) => {
        setProduct(response.data);
        console.log();
      });
  }, []);

  return (
    <>
      {/* <div className="postPage" style={{ width: "100%", padding: "3rem 4rem" }}> */}
      <Card className="productPage">
        <Card.Img src={Product.url}></Card.Img>
        <div className="card-options">
          <div className="titleCard2">
            <h1>{Product.name}</h1>
          </div>

          <Card.Body>
            <ProductInfo detail={Product} />
          </Card.Body>
        </div>
      </Card>
      {/* </div> */}
    </>
  );
}

export default CPUSearch;
