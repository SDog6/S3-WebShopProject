import React,{Component} from "react";
import axios from "axios";
import Card from "../Cards/Card";

class GPUList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/GPU')
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
                <h1>GPUs</h1>
                {
                    products.map(product => <div className = 'wrapper'><Card title = {product.name} price = {product.price} brand = {product.brand} warranty = {product.warranty}/>  </div>)
                }
            </div>
        )
    }
}


export default GPUList



