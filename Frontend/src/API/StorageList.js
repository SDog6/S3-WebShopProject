import React,{Component} from "react";
import axios from "axios";

class StorageList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/Storage')
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
                <h1>Storage</h1>
                {
                    products.map(product => <div> {product.basicinfo.name} / {product.basicinfo.brand} / {product.basicinfo.price} / {product.basicinfo.price} / {product.basicinfo.warranty} / {product.type} / {product.amount} / {product.writespeed} </div>)
                }
            </div>
        )
    }
}


export default StorageList



