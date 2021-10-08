import React,{Component} from "react";
import axios from "axios";
import CPUCard from "../Cards/CPUCard";

class CPUSearch extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/CPU/' + this.props.name)
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
                <h1>CPUs</h1>
                {
                    products.map(product => <div className = 'wrapper'> <CPUCard title = {product.basicinfo.name} price = {product.basicinfo.price} brand = {product.basicinfo.brand} warranty = {product.basicinfo.warranty}/> </div> )
                }
            </div>
        )
    }
}


export default CPUSearch;



