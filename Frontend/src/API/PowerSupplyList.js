import React,{Component} from "react";
import axios from "axios";

class PowerSupplyList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/PowerSupply')
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
                    products.map(product => <div> {product.basicinfo.name} / {product.basicinfo.brand} / {product.basicinfo.price} / {product.basicinfo.price} / {product.basicinfo.warranty} / {product.capacity} </div>)
                }
            </div>
        )
    }
}


export default PowerSupplyList



