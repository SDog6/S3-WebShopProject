import "./styles/App.css";
import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Home from "./Pages/Home";
import Navbar from "./Components/Navbar";
import Login from "./Pages/Login";
import Products from "./Pages/Products";
import CPUSearch from "./DetailsPage/CPUSearch";
import CreateCPUPage from "./ProductCreationPage/CreateCPUPage";
import { DataProvider } from "./Components/Cart/Context";
import Cart from "./Components/Cart/Cart";
import Logout from "./Components/Logout";

function App() {
  return (
    <DataProvider>
    <div className="App">
      <Router>
        <Navbar />
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/products" exact component={Products} />
          <Route path="/login" exact component={Login} />
          <Route path="/logout" exact component={Logout} />
          <Route path="/CPU/:name" exact component={CPUSearch} />
          <Route path="/CPUCreation" exact component={CreateCPUPage} />
          <Route path="/Cart" exact component={Cart} />

        </Switch>
      </Router>
    </div>
    </DataProvider>
  );
}

export default App;
