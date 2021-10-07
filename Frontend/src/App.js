import logo from './logo.svg';
import './App.css';
import React from 'react';
import axios from 'axios';
import CPUList from './API/CPUList';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";



function App() {
  return (
    <div className="App">

             <CPUList />

    </div>
  );
}

export default App;
