import React, { Component } from 'react'
import axios from 'axios';
import Home from '../Pages/Home';


  function CheckLogin (data){
    var token = localStorage.getItem("token");
    if (token != null) {
            return Home;
        
    }
    return data;
}



  export default CheckLogin