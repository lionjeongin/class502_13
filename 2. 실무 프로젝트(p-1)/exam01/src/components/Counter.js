import { useState } from 'react';

const Counter = () => {
  let num = 10;
  console.log('렌더링!', 'num', num);

  const [number, setNumber] = useState(0); // 비구조화 할당 / 함수형 컴포넌트

  const plus = () => {
    num++; //매번 렌더링이 다시 되기 때문에(매번 함수가 호출되기 때문에 초기화 돼서) 증가 안된다. 지역 변수 못 쓴다.
    setNumber(number + 1);
  };
  const minus = () => setNumber(number - 1);
  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={plus}>
        +1
      </button>
      <button type="button" onClick={minus}>
        -1
      </button>
    </>
  );
};

export default Counter; // 모듈 내보내기
