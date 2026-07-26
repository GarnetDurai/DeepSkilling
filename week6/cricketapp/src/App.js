import logo from './logo.svg';
import './App.css';
import ListOfPlayers from "./ListOfPlayers";
import ScoreBelow70 from "./ScoreBelow70";
import {useState} from "react";
import ListOfIndianPlayers from "./ListOfIndianPlayers";
const players = [
  { name: "Jack", score: 50 },
  { name: "Michael", score: 70 },
  { name: "John", score: 40 },
  { name: "Ann", score: 61 },
  { name: "Elizabeth", score: 61 },
  { name: "Sachin", score: 95 },
  { name: "Dhoni", score: 100 },
  { name: "Virat", score: 84 },
  { name: "Jadeja", score: 64 },
  { name: "Raina", score: 75 },
  { name: "Rohit", score: 80 }
];
function App() {
  const [flag, setFlag] = useState(true);
  if(flag){
    return (
        <div>
          <button onClick={() => setFlag(!flag)}>
            Toggle
          </button>
          <h1>List Of All Players</h1>
          <ListOfPlayers players={players} />
          <h1>Players Score below 70</h1>
          <ScoreBelow70 players={players}/>
        </div>

    )
  }else{
    return(
        <div>
          <button onClick={() => setFlag(!flag)}>
            Toggle
          </button>
          <ListOfIndianPlayers players={players}/>
        </div>
    );
  }
}

export default App;
