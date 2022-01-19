import React,{Component} from "react";
import axios from "axios";
import Card from "../Cards/Card";
import MotherboardCard from "../Cards/MotherboardCard";


class MotherboardList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/Motherboard', 
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
                <h1>Motherboards</h1>
                {
                    products.map(product => <div className = 'wrapper'><MotherboardCard  img = {product.url} title = {product.name} price = {product.price} brand = {product.brand} warranty = {product.warranty} id = {product.id}/> </div> )
                }
            </div>
        )
    }
}


export default MotherboardList



