// import { Component } from "react";
// import React, { useEffect, useState } from "react";
// import { Button, Table } from "react-bootstrap";
// import { DataContext } from "../Components/Cart/Context";

// export class ProductInfo extends Component {
 
//   static contextType = DataContext;

//   constructor(props) {
//     super(props)
//     this.state = {
//       Product : ""
//     }
//   }


// render(){
//   const {addCart} = this.context;
//   this.setState({Product : this.props.detail})
//   return (
//     <>
//       <Table striped bordered hover size="sm" className="table">
//         <thead>
//           <tr>
//             <th>Description</th>
//             <th></th>
//           </tr>
//         </thead>
//         <tbody>
//           <tr>
//             <td> Brand: {this.state.Product.brand}</td>
//           </tr>
//           <tr>
//             <td colspan="1"> Warranty: {this.state.Product.warranty} years</td>
//           </tr>
//           <tr>
//             <td colspan="1"> Brand: {this.state.Product.brand}</td>
//           </tr>
//           <tr>
//             <td colspan="1"> Clock speed: {this.state.Product.clockspeed} Hz</td>
//           </tr>
//           <tr>
//             <td colspan="1"> Power consumtion: {this.state.Product.powerconsum} Watt</td>
//           </tr>
//           <tr>
//             <td colspan="1"> Socket: {this.state.Product.socket}</td>
//           </tr>
//           <tr>
//             <td colspan="1"> Cores: {this.state.Product.cores}</td>
//           </tr>
//           <tr>
//             <td colspan="1"> Threads: {this.state.Product.threads}</td>
//           </tr>
//         </tbody>
//       </Table>
//       <div className="buttonGroup">

// <h4>{this.state.Product.price} $</h4>
//         <Button
//           size="large"
//           shape="round"
//           type="danger"
//           onClick={()=> addCart(this.state.Product.id)}
//         >
//           Add to Cart
//         </Button>
//       </div>
//     </>
//   );
// }
 
// }

// export default ProductInfo;
