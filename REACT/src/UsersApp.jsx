import { useEffect, useState } from "react"
import { UserList } from "./components/userList"



export const UsersApp = () => {


    // useEffect(() => {
    //     fetchUsers()
    // },[])
    const [endPoint, setEndPoint] = useState('users')
    const handleFetch = ()=> {
        setEndPoint('comments')
        console.log();
    }


    return (
        <>
            <h1>Lista de Usuarios</h1>
            <UserList endPoint={endPoint}/>
            <button onClick={handleFetch}>Aqui se llama el api</button>

        </>
    )
}
