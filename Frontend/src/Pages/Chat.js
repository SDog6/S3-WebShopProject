import React, { useState, useEffect } from 'react';
import SockJS from 'sockjs-client';
import Stomp from 'stompjs';
import jwtDecode from 'jwt-decode';
import "../styles/Chat.css"

function Chat() {

  const [MessagesValue, setMessagesValue] = useState([]);
  const [stompClient, setStompClient] = useState(null);
  const [msgToSend, setSendMessage] = useState("");


  useEffect(() => {
    const socket = SockJS("http://localhost:8080/chat");
    const stompClient = Stomp.over(socket);
    stompClient.connect({}, () => {
      stompClient.subscribe('/topic/chat', (data) => {
        console.log(data);
        onMessageReceived(data);
      });
    });
    setStompClient(stompClient);
  }, []);

  function sendMessage() {
    const token = localStorage.getItem("token")
    var username = ''
    if(token != null){
      const decoded = jwtDecode(token)
      username = decoded.sub
    }

stompClient.send("/app/topics", {}, JSON.stringify({'name': msgToSend, 'username' : username}));
  };

  function onMessageReceived(data)
  {
    const result=  JSON.parse(data.body);
    setMessagesValue(MessagesValue => [...MessagesValue, result])
  };

  return (
    <div  id='chatborder'>
        {MessagesValue.map(Message => (
          <p>
              {Message.content}
          </p>
        ))}

    <br></br>
    <input onChange={(event) => setSendMessage(event.target.value)}></input>
    <button  onClick={sendMessage}>Send Message</button>

  </div>
  );

}

export default Chat;