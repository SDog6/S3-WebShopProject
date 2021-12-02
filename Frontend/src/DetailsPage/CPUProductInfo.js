import React, { useEffect, useState } from "react";
import { Button, Table } from "react-bootstrap";

function ProductInfo(props) {
  const [Product, setProduct] = useState({});

  useEffect(() => {
    setProduct(props.detail);
  }, [props.detail]);

  const addToCarthandler = () => {
    // props.addToCart(props.detail._id)
  };

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
            <td> Brand: {Product.brand}</td>
          </tr>
          <tr>
            <td colspan="1"> Warranty: {Product.warranty} years</td>
          </tr>
          <tr>
            <td colspan="1"> Brand: {Product.brand}</td>
          </tr>
          <tr>
            <td colspan="1"> Clock speed: {Product.clockspeed} Hz</td>
          </tr>
          <tr>
            <td colspan="1"> Power consumtion: {Product.powerconsum} Watt</td>
          </tr>
          <tr>
            <td colspan="1"> Socket: {Product.socket}</td>
          </tr>
          <tr>
            <td colspan="1"> Cores: {Product.cores}</td>
          </tr>
          <tr>
            <td colspan="1"> Threads: {Product.threads}</td>
          </tr>
        </tbody>
      </Table>
      <div className="buttonGroup">

<h4>{Product.price} $</h4>
        <Button
          size="large"
          shape="round"
          type="danger"
          onClick={addToCarthandler}
        >
          Add to Cart
        </Button>
      </div>
    </>
  );
}

export default ProductInfo;
