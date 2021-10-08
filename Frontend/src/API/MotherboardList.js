import React,{Component} from "react";
import axios from "axios";

class MotherboardList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             products : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/Motherboard')
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
                    products.map(product => <div> {product.basicinfo.name} / {product.basicinfo.brand} / {product.basicinfo.price} / {product.basicinfo.price} / {product.basicinfo.warranty} / {product.chipset} / {product.wifi}</div>)
                }
            </div>
        )
    }
}


export default MotherboardList



