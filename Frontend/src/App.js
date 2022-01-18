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
import CreateCPUCoolerPage from "./ProductCreationPage/CreateCPUCoolingPage";
import CreateMotherboardPage from "./ProductCreationPage/CreateMotherboardPage";
import CreatePowerSupplyPage from "./ProductCreationPage/CreatePowerSupplyPage";
import CreateRAMPage from "./ProductCreationPage/CreateRAMPage";
import CreateStoragePage from "./ProductCreationPage/CreateStoragePage";
import GPUSearch from "./DetailsPage/GPUSearch";
import CPUCoolingSearch from "./DetailsPage/CPUCoolingSearch";
import MotherboardSearch from "./DetailsPage/MotherboardSearch";
import PowerSupplySearch from "./DetailsPage/PowerSupplySearch";
import RAMSearch from "./DetailsPage/RAMSearch";
import StorageSearch from "./DetailsPage/StorageSearch";
import About from "./Pages/About";
import CheckUser from "./Components/CheckUser";
import CheckAdmin from "./Components/CheckAdmin";
import CheckLogin from "./Components/CheckLogin";

function App() {
  return (
    <DataProvider>
    <div className="App">
      <Router>
        <Navbar />
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/products" exact component={Products} />
          <Route path="/login" exact component={CheckLogin(Login)} />
          <Route path="/logout" exact component={Logout} />
          
          <Route path="/CPU/:name" exact component={CPUSearch} />
          <Route path="/GPU/:name" exact component={GPUSearch} />
          <Route path="/CPUCooling/:name" exact component={CPUCoolingSearch} />
          <Route path="/Motherboard/:name" exact component={MotherboardSearch} />
          <Route path="/Powersupply/:name" exact component={PowerSupplySearch} />
          <Route path="/RAM/:name" exact component={RAMSearch} />
          <Route path="/Storage/:name" exact component={StorageSearch} />

          <Route path="/CPUCreation" exact component={CheckAdmin(CreateCPUPage)} />
          <Route path="/GPUCreation" exact component={CheckAdmin(CreateGPUPage)} />
          <Route path="/CPUCoolingCreation" exact component={CheckAdmin(CreateCPUCoolerPage)} />
          <Route path="/MotherboardCreation" exact component={CheckAdmin(CreateMotherboardPage)} />
          <Route path="/PowerSupplyCreation" exact component={CheckAdmin(CreatePowerSupplyPage)} />
          <Route path="/RAMCreation" exact component={CheckAdmin(CreateRAMPage)} />
          <Route path="/StorageCreation" exact component={CheckAdmin(CreateStoragePage)} />

          <Route path="/Cart" exact component={Cart} />
          <Route path="/payment" exact component={Payment} />
          <Route path="/Inventory" exact component={CheckAdmin(Inventory)} />
          <Route path="/account" exact component={CheckUser(Account)} />
          <Route path="/about" exact component={About} />

          <Route path="/Chat" exact component={CheckUser(Chat)} />

        </Switch>
      </Router>
    </div>
    </DataProvider>
  );
}

export default App;
