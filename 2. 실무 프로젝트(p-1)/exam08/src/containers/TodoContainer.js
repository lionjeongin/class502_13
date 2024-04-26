import Todo from "../components/Todo";
import { connect } from "react-redux";
import { insert, remove } from "../modules/todo";

const TodoContainer = ({ todos, insert, remove }) => {
  return <Todo />;
};

export default connect(
  ({ todo }) => ({})
    todos : todo,
  })

)(TodoContainer);