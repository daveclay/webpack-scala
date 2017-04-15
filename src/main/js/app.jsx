import React from 'react';
import ReactDOM from 'react-dom';

class Hello extends React.Component {
  render() {
    return <h1>Hello</h1>
  }
}

if (typeof document !== 'undefined') {
  ReactDOM.render(
    <Hello />,
    document.getElementById('root')
  );
} else {
  console.log(greeting);
}