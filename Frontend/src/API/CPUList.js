import React,{Component} from "react";
import axios from "axios";
import Card from "../Cards/Card";
import { DataContext } from "../Components/Cart/Context";

class CPUList extends Component{
    
        
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/CPU')
        .then(response =>{
            this.setState({
                products: response.data
                
            })
            console.log(response.data)
        })
    }

    render() { 
        return(
            <div>
                <h1>CPUs</h1>
                {
                    this.state.products.map(product => <div className = 'wrapper'><Card  img = {product.url} title = {product.name} price = {product.price} brand = {product.brand} warranty = {product.warranty} id = {product.id}/> </div> )
                }
            </div>
        )
    }
}


export default CPUList



