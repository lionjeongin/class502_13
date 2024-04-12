const App = () => {
  const name = "js";

  const style = {
    backgroundColor : 'orange', //background-color와 같다. - 를 없애고 앞에 소문자를 대문자로 바꾸면 된다.
    color: 'white' ,
    height: '100px',
  };

  return (
  <>
    {/* 주석 .... -> 중괄호 안에 꼭 넣어야한다! */}

    <div className="subject" style={style}>
      첫번째 컴포넌트!
    </div>
    <div style={{ color: 'blue' }}>신나는, {name && null} 공부</div>  {/* style 적용할 때 중괄호가 있어야 인식한다 / $$ 많이 쓴다.*/}
    {name === 'React' && <h1>아! 재미있다!</h1>} {/* === 쓰기! ==은 경고 뜨고 오류 발생 가능성이 있다. */}
    <input 
      // 주석 ... -> 태그 안에서는 다음칸 개행한 다음에 // 으로 주석 달기!
      type="text" />
    </>
  );
};

export default App;