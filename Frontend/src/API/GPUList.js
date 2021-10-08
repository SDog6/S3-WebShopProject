import React,{Component} from "react";
import axios from "axios";

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
                    products.map(product => <div> {product.basicinfo.name} / {product.basicinfo.brand} / {product.basicinfo.price} / {product.basicinfo.price} / {product.basicinfo.warranty} / {product.clockspeed} / {product.vram} / {product.lenght} / {product.width} / {product.height} / {product.hdmiports} / {product.displayports} / {product.fans} </div>)
                }
            </div>
        )
    }
}


export default GPUList



