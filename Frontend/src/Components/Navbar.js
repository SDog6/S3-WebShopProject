import React, { useState } from "react";
import * as FaIcons from "react-icons/fa";
import * as AiIcons from "react-icons/ai";
import * as RemixIco from "react-icons/ri";
import { Link } from "react-router-dom";
import { SidebarData } from "./SidebarData";
import "../styles/Navbar.css";
import { IconContext } from "react-icons";
import jwtDecode from "jwt-decode";
import { UserSidebarData } from "./UserSideData";
import { AdminSidebarData } from "./AdminSideData";

function Navbar() {
  const [sidebar, setSidebar] = useState(false);

  const showSidebar = () => setSidebar(!sidebar);
  var data = [];

  const token = localStorage.getItem("token")
  var decoded = {}
  var role = ''
  if(token != null){
    const decoded = jwtDecode(token)
    role = decoded.role
  }

  if(role === "USER"){
    data = UserSidebarData.map((item, index) => {
      return (
        <li key={index} className={item.cName}>
          <Link to={item.path}>
            {item.icon}
            <span>{item.title}</span>
          </Link>
        </li>
      );
    })
  }
  else if(role === "ADMIN"){
    data = AdminSidebarData.map((item, index) => {
      return (
        <li key={index} className={item.cName}>
          <Link to={item.path}>
            {item.icon}
            <span>{item.title}</span>
          </Link>
        </li>
      );
    })
  }
  else {
    data = SidebarData.map((item, index) => {
      return (
        <li key={index} className={item.cName}>
          <Link to={item.path}>
            {item.icon}
            <span>{item.title}</span>
          </Link>
        </li>
      );
    })
  }


  return (
    <>
      <IconContext.Provider value={{ color: "#fff" }}>
        <div className="navbar">
          <Link to="#" className="menu-bars">
            <FaIcons.FaBars onClick={showSidebar} />
          </Link>
          <Link to="/cart" className="topnavbutton">
            <RemixIco.RiShoppingCart2Line />
            Cart
          </Link>
          {localStorage.getItem("token") != null ? (
            <Link to="/logout" className="topnavbutton">
              <RemixIco.RiLoginBoxLine />
              Log out
            </Link>
          ) : (
            <Link to="/login" className="topnavbutton">
              <RemixIco.RiLoginBoxLine />
              Log in
            </Link>
          )}
        </div>
        <nav className={sidebar ? "nav-menu active" : "nav-menu"}>
          <ul className="nav-menu-items" onClick={showSidebar}>
            <li className="navbar-toggle">
              <Link to="#" className="menu-bars">
                <AiIcons.AiOutlineClose />
              </Link>
            </li>
            {data}
            
          </ul>
        </nav>
      </IconContext.Provider>
    </>
  );
}

export default Navbar;
