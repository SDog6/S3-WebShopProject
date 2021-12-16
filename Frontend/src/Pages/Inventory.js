import React, { Component } from "react";
import { Table } from "reactstrap";
import { Button } from "reactstrap";
import { DataContext } from "../Components/Cart/Context";
import "../styles/Inventory.css"

class Inventory extends Component {
  static contextType = DataContext;

  render() {
    const { products } = this.context;
    return (
      <div>
        <br></br>
        <Button className = "InventoryButton" variant="primary" href={"/"}>
          View all CPUs
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/"}>
          View all CPU Coolingss
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/"}>
          View all GPUs
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/"}>
          View all MotherBoards
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/" }>
          View all Power supplies
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/"}>
          View all RAMs
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/"}>
          View all Storages
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/"}>
          View all CPUs
        </Button>
        <br></br>

        <Table>
          <thead>
            <tr>
              <th>Name</th>
              <th>Brand</th>
              <th>Price</th>
              <th>Warranty</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {products.map((product) => (
              <tr>
                <td>{product.name}</td>
                <td>{product.brand}</td>
                <td>{product.price}</td>
                <td>{product.warranty}</td>
                <td>
                  <Button variant="primary" href={"/" + product.name}>
                    UPDATE
                  </Button>
                </td>
                <td>
                  <Button variant="primary" href={"/" + product.name}>
                    DELETE
                  </Button>
                </td>
              </tr>
            ))}
          </tbody>
        </Table>
      </div>
    );
  }
}
export default Inventory;
