import React,{Component} from "react";
import axios from "axios";

class CPUCoolingList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/CPUCooler')
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
                <h1>CPU Coolings</h1>
                {
                    products.map(product => <div> {product.basicinfo.name} / {product.basicinfo.brand} / {product.basicinfo.price} / {product.basicinfo.price} / {product.basicinfo.warranty} / {product.voltage}</div>)
                }
            </div>
        )
    }
}


export default CPUCoolingList



