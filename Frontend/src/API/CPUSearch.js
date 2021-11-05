import React,{Component, useEffect, useState} from "react";
import axios from "axios";
import CPUCard from "../Cards/Card";

function CPUSearch (props) {
    
    const PropsName = props.match.params.name
    const [Product,setProduct] = useState([])

    useEffect(() => {
        axios.get(`http://localhost:8080/CPU/Name/${PropsName}`)
        .then(response =>{
            setProduct(response.data)
            console.log()
        })
    },[])

        return(
            <div>
                <h1>{Product.name}</h1>
                {
                   <div className = 'wrapper'> <h1> Price: { Product.price} Brand: {Product.brand} Warranty: {Product.warranty} Cores: {Product.cores}</h1> </div> 
                }
            </div>
        )
    
}


export default CPUSearch;



