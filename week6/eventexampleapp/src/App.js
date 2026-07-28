import logo from './logo.svg';
import './App.css';
import Counter from "./Counter";
import Welcome from "./Welcome";
import ClickMe from "./ClickMe";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  return (
    <div>
      <Counter/>
        <Welcome/>
        <ClickMe/>
        <CurrencyConvertor/>
    </div>
  );
}

export default App;
