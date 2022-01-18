import React, { Component } from 'react'
import axios from 'axios';
import jwtDecode from 'jwt-decode';
import Home from '../Pages/Home';


  function CheckAdmin (data){
    var token = localStorage.getItem("token");
    if (token != null) {
        var decoded = jwtDecode(token);
        if(decoded.role === "ADMIN"){
            return data;
        }
        else {
            return Home;
    
        }
    }
    return Home;
}



  export default CheckAdmin