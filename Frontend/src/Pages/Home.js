import React from 'react';
import jwtDecode from 'jwt-decode';
import img from "../Images/computer-shop-various-parts-on-260nw-569212921.jpg"


function Home() {

  return (
    <div className='home'>
      <h1>Wellcome</h1>
      <br/>
      <img src={img} alt="Img" />;
    </div>
  );
}

export default Home;
