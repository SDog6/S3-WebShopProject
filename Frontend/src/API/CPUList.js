import React,{Component} from "react";
import axios from "axios";

class CPUList extends Component{
    
    
    constructor(props) {
        super(props)
    
        this.state = { 
             cpus : []
        }
    }


    
    
    
    componentDidMount() { 
        axios.get('http://localhost:8080/CPU')
        .then(response =>{
            this.setState({
                cpus: response.data
                
            })
            console.log(response.data)
        })
    }

    render() { 
        const {cpus} = this.state
        return(
            <div>
                <h1>List Of CPUs</h1>
                {
                    cpus.map(cpu => <div> {cpu.basicinfo.name} / {cpu.basicinfo.brand} / {cpu.basicinfo.price} / {cpu.basicinfo.price} / {cpu.basicinfo.warranty} / {cpu.clockspeed} / {cpu.powerconsum} / {cpu.socket} / {cpu.cores} / {cpu.threads} </div>)
                }
            </div>
        )
    }
}


export default CPUList



