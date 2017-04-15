import React from 'react'

import { render } from 'react-dom'
import { Provider } from 'react-redux'
import { createStore } from 'redux'
import reducers from './reducers/reducers'
import App from './components/App'

let store = createStore(reducers)

if (typeof document !== 'undefined') {
  render(
    <Provider store={store}>
      <App />
    </Provider>,
    document.getElementById('root')
  )
} else {
  console.log("No document");
}