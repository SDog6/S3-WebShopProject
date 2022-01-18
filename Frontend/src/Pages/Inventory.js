import React, { Component } from "react";
import { Table } from "reactstrap";
import { Button } from "reactstrap";
import { DataContext } from "../Components/Cart/Context";
import "../styles/Inventory.css"
import axios from "axios";

class Inventory extends Component {
  constructor(props) {
    super(props);
    this.state = {
      inventory: [],
    };
  }

  componentDidMount() {
      axios.get(`http://localhost:8080/Inventory`).then((response) => {
        this.setState({
          inventory: response.data,
        });
        console.log(this.state.inventory);
      });
  }
  
  update(){
    axios.get(`http://localhost:8080/Inventory`).then((response) => {
      this.setState({
        inventory: response.data,
      });
      console.log(this.state.inventory);
    });
  }

  increaseInv(e,id) {
    e.preventDefault();
    console.log(id)
    axios.post(`http://localhost:8080/Inventory/IncreaseAmount/${id}/5`)
    .then((response) => { 
        console.log(response);
        this.update();
      });
   }


  render() {
    return (
      <div>
        <br></br>
        <Button className = "InventoryButton" variant="primary" href={"/CPUCreation"}>
          Create new CPU
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/CPUCoolingCreation"}>
          Create new CPU Cooling
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/GPUCreation"}>
        Create new GPU
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/MotherboardCreation"}>
          Create new MotherBoard
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/PowerSupplyCreation" }>
        Create new Powersupply
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/RAMCreation"}>
        Create new RAM
        </Button>
        <Button className = "InventoryButton" variant="primary" href={"/StorageCreation"}>
        Create new Storage
        </Button>
     
        <br></br>

        <Table>
          <thead>
            <tr>
              <th>Name</th>
              <th>Brand</th>
              <th>Price</th>
              <th>Warranty</th>
              <th>Amount</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {this.state.inventory.map((item) => (
              <tr>
                <td>{item.product.name}</td>
                <td>{item.product.brand}</td>
                <td>{item.product.price}</td>
                <td>{item.product.warranty}</td>
                <td>{item.amount}</td>
                <td>
                  <Button variant="primary" onClick={(e) => {this.increaseInv(e,item.product.id)}}>
                    Increase amount by 5
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
