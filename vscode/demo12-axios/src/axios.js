import axios from 'axios'

const instance=axios.create({
    // baseURL:'https://api.uomg.com',
    //timeout:10000
})

instance.interceptors.request.use(
    config=>{
        console.log("before request");
        return config  
    },
    error=>{
        console.log("request error");
        return Promise.reject(error)
        
    }
)

instance.interceptors.response.use(
    response=>{
        console.log("after success response");
        console.log((response));
        return response
        
    },
    error=>{
        console.log("after fail response");
        console.log(error);
        return Promise.reject(error)
    }
)

export default instance