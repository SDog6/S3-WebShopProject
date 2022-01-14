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
import Payment from "./Pages/Payment";
import Inventory from "./Pages/Inventory";
import Account from "./Pages/Account";
import CreateGPUPage from "./ProductCreationPage/CreateGPUPage";
import Chat from "./Pages/Chat";

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
          <Route path="/GPU/:name" exact component={CPUSearch} />
          <Route path="/CPUCooling/:name" exact component={CPUSearch} />
          <Route path="/Motherboard/:name" exact component={CPUSearch} />
          <Route path="/Powersupply/:name" exact component={CPUSearch} />
          <Route path="/RAM/:name" exact component={CPUSearch} />
          <Route path="/Storage/:name" exact component={CPUSearch} />

          <Route path="/CPUCreation" exact component={CreateCPUPage} />
          <Route path="/GPUCreation" exact component={CreateGPUPage} />
          <Route path="/Cart" exact component={Cart} />
          <Route path="/payment" exact component={Payment} />
          <Route path="/Inventory" exact component={Inventory} />
          <Route path="/account" exact component={Account} />
          <Route path="/Chat" exact component={Chat} />

        </Switch>
      </Router>
    </div>
    </DataProvider>
  );
}

export default App;
