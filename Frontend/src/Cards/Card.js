import React from "react";
import { Card } from "react-bootstrap";
import { ListGroup } from "react-bootstrap";
import { ListGroupItem } from "react-bootstrap";
import "../styles/CPUCard.css";
import { Component } from "react";
import { DataContext } from "../Components/Cart/Context";

export class CPUCard extends Component {

  static contextType = DataContext;


  constructor(props) {
    super(props)
    this.state = {
    }
  }

  render(){
    const {addCart} = this.context;
    return (
      <Card>
        <Card.Img variant="top" src={this.props.img} />
        <Card.Body>
          <Card.Title>{this.props.title}</Card.Title>
          <Card.Text>Price: {this.props.price} $</Card.Text>
        </Card.Body>
        <ListGroup className="list-group-flush">
          <ListGroupItem>Brand: {this.props.brand} </ListGroupItem>
          <ListGroupItem>Warranty: {this.props.warranty} years </ListGroupItem>
        </ListGroup>
        <Card.Body classname="cardbuttons">
          <Card.Link href={"/CPU/" + this.props.title}>View product</Card.Link>
          <Card.Link onClick={()=> addCart(this.props.id)} >Add to cart</Card.Link>
        </Card.Body>
      </Card>
    );

  }
  
}

export default CPUCard;
