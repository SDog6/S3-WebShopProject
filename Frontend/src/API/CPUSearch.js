import React,{Component, useEffect, useState} from "react";
import axios from "axios";
import CPUCard from "../Cards/CPUCard";

function CPUSearch (props) {
    
    const PropsName = props.match.params.name
    const [Product,setProduct] = useState([])

    useEffect(() => {
        axios.get(`http://localhost:8080/CPU/Name?name=${PropsName}`)
        .then(response =>{
            setProduct(response.data)
        })
    },[])

        return(
            <div>
                <h1>CPUs</h1>
                {
                    Product.map(product => <div className = 'wrapper'> <CPUCard title = {Product.basicinfo.name} price = {Product.basicinfo.price} brand = {Product.basicinfo.brand} warranty = {Product.basicinfo.warranty}/> </div> )
                }
            </div>
        )
    
}


export default CPUSearch;



