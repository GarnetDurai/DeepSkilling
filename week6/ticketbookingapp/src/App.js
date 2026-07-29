import logo from './logo.svg';
import './App.css';
import {useState} from "react";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";
import GuestGreeting from "./GuestGreeting";
import UserGreating from "./UserGreating";
function App() {
  const [isLoggedIn, SetIsLoggedIn] = useState(false);
  function handleLogin(){
      SetIsLoggedIn(true);
  }
  function  handleLogout(){
      SetIsLoggedIn(false);
  }
  return (
    <div>
      {isLoggedIn?<UserGreating/>:<GuestGreeting/>}
        {
            isLoggedIn
            ?
                <LogoutButton onClick={handleLogout}/>
                :
                <LoginButton onClick={handleLogin}/>

        }

    </div>
  );
}

export default App;
