import React, { Component } from "react";
import axios from "axios";
import { Redirect } from "react-router";
import "../styles/Login.css";
import { FaWindows } from "react-icons/fa";
import {NavLink, NavItem} from 'reactstrap'

class Login extends Component {
  constructor(props) {
    super(props);
    this.state = {
      email: "",
      password: "",
      errorMessage: "",
    };
    this.changeEmailHandler = this.changeEmailHandler.bind(this);
    this.changePasswordHandler = this.changePasswordHandler.bind(this);
    this.checkUser = this.checkUser.bind(this);
  }

  checkUser = (hndl) => {
    hndl.preventDefault();
    axios
      .post("http://localhost:8080/login", {
        username: this.state.email,
        password: this.state.password,
      })
      .then(
        (response) => {
          console.log(response);
          const token = response.data.Authorization;
          localStorage.setItem("token", token);
          window.location.href = "/";
        },
        (error) => {
          console.log(error);
          this.setState({ errorMessage: "Please check username or password" });
        }
      );
  };

  changeEmailHandler = (event) => {
    this.setState({ email: event.target.value });
  };
  changePasswordHandler = (event) => {
    this.setState({ password: event.target.value });
  };

  render() {
    return (
      <div>
        <div className="container">
          <div className="row">
            <div className="card col-md-6 offset-md-3 offset-md-3">
              <h3 className="text-center">Sign In</h3>
              <div className="card-body">
                <form>
                  <div className="form=group">
                    <label> Username : </label>
                    <input
                      placeholder="Username"
                      name="email"
                      className="form-control"
                      value={this.state.email}
                      onChange={this.changeEmailHandler}
                    />
                  </div>
                  <div className="form=group">
                    <label> Password : </label>
                    <input
                      placeholder="Password"
                      name="password"
                      className="form-control"
                      value={this.state.password}
                      onChange={this.changePasswordHandler}
                    />
                  </div>

                  <br></br>
                  <button
                    name="btn"
                    className="btn btn-success"
                    onClick={this.checkUser}
                  >
                    SignIn
                  </button>
                </form>
               
                <NavItem>
                <NavLink href="/register">Register?</NavLink>
              </NavItem>

              </div>
            </div>
          </div>
        </div>
        {this.state.errorMessage && (
          <p className="error"> {"Username or password incorrect"} </p>
        )}
      </div>
    );
  }
}
export default Login;
