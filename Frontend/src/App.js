import logo from "./logo.svg";
import "./styles/App.css";
import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Home from "./Pages/Home";
import Navbar from "./Components/Navbar";
import Login from "./Pages/Login";
import Products from "./Pages/Products";
import SearchPage from "./Pages/SearchPage";
import CPUSearch from "./DetailsPage/CPUSearch";
import inventory from "./Pages/Inventory";
import CPUCreation from "./ProductCreationPage/CPUCreation";

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/products" exact component={Products} />
          <Route path="/login" exact component={Login} />
          <Route path="/CPU/:name" exact component={CPUSearch} />
          <Route path="/Inventory" exact component={inventory} />
          <Route path="/CPUCreation" exact component={CPUCreation} />

        </Switch>
      </Router>
    </div>
  );
}

export default App;
