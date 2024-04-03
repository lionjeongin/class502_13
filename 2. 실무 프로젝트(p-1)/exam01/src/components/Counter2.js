import { Component } from "react";

class Counter extends Component {
    state = {
        number: 0,
    };

    render() {
        const {number} = this.state;  // 비구조화 할당
        const plus = () => this.setState({number: number + 1});  //클래스형 컴포넌트
        const minus = () => this.setState({number: number -1});

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
    }
}

export default Counter; // 모듈 내보내기