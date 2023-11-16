import React from 'react'
import ReactDOM from 'react-dom/client'
// import { PrimerComponente } from './PrimerComponente'
import './styles.css'
import { ListadoApp } from './ListadoApp'
import { UsersApp } from './UsersApp'
// import { ContadorApp } from './ContadorApp'


ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    {/* <ListadoApp/> */}
    <UsersApp/>
    {/* <ContadorApp value={0}/> */}
    {/* <PrimerComponente /> */}
  </React.StrictMode>,
)
