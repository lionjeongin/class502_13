import { Component } from "react";
import PropTypes from 'prop-types';

class MyComponent extends Component {
    static defaultProps = {
        name: '기본 이름',
    };

    static propTypes = {
        name: PropTypes.string,
        num: PropTypes.number.isRequired,
    
    }
    
    render() {  //render 함수, 필수 함수다.
        const {name, num, children} = this.props; //비구조화 할당

        return (
            <>
                <div>안녕하세요, 제 이름은 {name}입니다.</div>
                <div>좋아하는 숫자는 {num}입니다.</div>
                {children}
            </>
        );
    }
}

export default MyComponent; //모듈 내보내기