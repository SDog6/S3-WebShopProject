import React,{Component} from "react";
import axios from "axios";
import Card from "../Cards/Card";
import PowerSupplyCard from "../Cards/PowerSupplyCard";


class PowerSupplyList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/PowerSupply', 
        {headers: {"Authorization" : `${localStorage.getItem("token")}`}})
        .then(response =>{
            this.setState({
                products: response.data
                
            })
            console.log(response.data)
        })
    }

    render() { 
        const {products} = this.state
        return(
            <div>
                <h1>Power Supplies</h1>
                {
                    products.map(product => <div className = 'wrapper'><PowerSupplyCard  img = {product.url} title = {product.name} price = {product.price} brand = {product.brand} warranty = {product.warranty} id = {product.id}/> </div> )
                }
            </div>
        )
    }
}


export default PowerSupplyList



