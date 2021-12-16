import React from 'react';
import jwtDecode from 'jwt-decode';


function Home() {

  var tokens = localStorage.getItem("token")
  if(tokens != null){
    var decoded = jwtDecode(tokens);
    console.log(decoded)
  }

  return (
    <div className='home'>
      <h1>Home</h1>
    </div>
  );
}

export default Home;
