import React, { Component } from "react";
import axios from "axios";
import { DataContext } from "../Components/Cart/Context";
import { ListGroup } from "react-bootstrap";
import { ListGroupItem } from "react-bootstrap";
import { Card } from "react-bootstrap";


class CPUList extends Component {
  static contextType = DataContext;

  render() {
    const { addCart, products } = this.context;
    return (
      <div>
        <h1>CPUs</h1>
        {products.map((product) => (
          <div className="wrapper">
            {" "}
            <Card>
              <Card.Img variant="top" src={product.url} />
              <Card.Body>
                <Card.Title>{product.name}</Card.Title>
                <Card.Text>Price: {product.price} $</Card.Text>
              </Card.Body>
              <ListGroup className="list-group-flush">
                <ListGroupItem>Brand: {product.brand} </ListGroupItem>
                <ListGroupItem>
                  Warranty: {product.warranty} years{" "}
                </ListGroupItem>
              </ListGroup>
              <Card.Body classname="cardbuttons">
                <Card.Link href={"/CPU/" + product.name}>
                  View product
                </Card.Link>
                <Card.Link onClick={() => addCart(product.id)}>
                  Add to cart
                </Card.Link>
              </Card.Body>
            </Card>{" "}
          </div>
        ))}
      </div>
    );
  }
}

export default CPUList;
