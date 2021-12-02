import React,{Component} from "react";
import axios from "axios";
import Card from "../Cards/Card";
import { DataContext } from "../Components/Cart/Context";

class CPUList extends Component{
    
    static contextType = DataContext;
    

    render() { 
        const {addCart,products} = this.context;
        return(
            <div>
                <h1>CPUs</h1>
                {
                    products.map(product => <div className = 'wrapper'><Card  img = {product.url} title = {product.name} price = {product.price} brand = {product.brand} warranty = {product.warranty} id = {product.id}/> </div> )
                }
            </div>
        )
    }
}


export default CPUList



