import React from "react";
import { Card } from "react-bootstrap";
import { ListGroup } from "react-bootstrap";
import { ListGroupItem } from "react-bootstrap";
import '../styles/CPUCard.css'

function CPUCard(props){
    return(
        <div className="card">
        <Card>
  <Card.Img variant="top" src={"https://images-na.ssl-images-amazon.com/images/I/61NqeCC8A6L._AC_SL1200_.jpg"} />
  <Card.Body>
    <Card.Title>{props.title}</Card.Title>
    <Card.Text>
        Price: {props.price} $
    </Card.Text>
  </Card.Body>
  <ListGroup className="list-group-flush">
    <ListGroupItem>Brand: {props.brand} </ListGroupItem>
    <ListGroupItem>Warranty: {props.warranty} years </ListGroupItem>
  </ListGroup>
  <Card.Body classname = 'cardbuttons'>
    <Card.Link href={"/CPU/" + props.title}>View product</Card.Link>
    <Card.Link href="#">Add to cart</Card.Link>
  </Card.Body>
</Card>
</div>
    )
}

export default CPUCard