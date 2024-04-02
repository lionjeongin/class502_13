import React from 'react'; // = react/index.js  index.js는 모듈마다 있는 파일이라 생략 가능 / from 뒤엔 모듈 경로
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';  // ./ 가 있으면 외부에서 다운 받은 것이다. / import App에 App은 변수명이다.
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
