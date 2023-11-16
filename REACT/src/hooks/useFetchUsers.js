import { useEffect } from "react"
import { useState } from "react"
import { fetchData } from "../helpers/fetchData"

const useFetchUsers = (endPoint) => {

    const [data, setData] = useState([])
    const [isLoading, setIsLoading] = useState(true)


    useEffect(() => {

        fetchData(endPoint)
            .then(res => {
                setIsLoading(res.isLoading)
                setData(res.data)
            })
    }, [endPoint])

    return {

        data,
        isLoading

    }
}

export default useFetchUsers
