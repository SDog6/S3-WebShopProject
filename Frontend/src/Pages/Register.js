import { message } from 'antd';
import axios from 'axios'
import React, { Component } from 'react'


class Register extends Component {
    constructor(props) {
        super(props)
        this.state = {         
            username: '',
            password: '',
            message : ""
        }
        this.changeUsernameHandler = this.changeUsernameHandler.bind(this);
        this.changePasswordHandler = this.changePasswordHandler.bind(this);
        this.registerUser = this.registerUser.bind(this);
    }


    registerUser = (hndl) => {
        hndl.preventDefault();
        if (!this.state.username || !this.state.password) {
            this.setState({message : "Fill all the fields first!"});
          }
          else {
        let user = { username: this.state.username,  password: this.state.password , role : "USER"};
        axios.post('http://localhost:8080/register', user)
        .then(response => {
            if(response.data === "CONFLICT"){
                this.setState({ message: "Username already taken!" });
            }
            else {
                console.log(response)
                window.location.href = '/login';
            }
          

        },
        (error) => {
          console.log(error);
          this.setState({ errorMessage: "Please check username or password" });
        }
      );
  }; 
    }


    changeUsernameHandler = (event) => {
        this.setState({ username: event.target.value });
    }
    changePasswordHandler = (event) => {
        this.setState({ password: event.target.value });
    }


    render() {
        return (
            <div>
                <div className="container">
                    <div className="row">
                        <div className="card col-md-6 offset-md-3 offset-md-3">
                            <h3 className="text-center">REGISTER</h3>
                            <div className="card-body">
                                <form onSubmit = {this.hndlSubmit} style = {{ marginBottom: '30mm' }}>

                                    <div className="form=group">
                                        <label> Username : </label>
                                        <input placeholder="Username" name="usrname" className="form-control"
                                            value={this.state.username} onChange={this.changeUsernameHandler} />
                                    </div>
                                    <div className="form=group">
                                        <label> Password : </label>
                                        <input placeholder="Password" name="password" className="form-control"
                                            value={this.state.password} onChange={this.changePasswordHandler} />
                                    </div>
                                    <br></br>
                                    <button className="btn btn-success" onClick={this.registerUser}>REGISTER</button>
                                    { <p className="error"> { this.state.message } </p> }

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}
export default Register
