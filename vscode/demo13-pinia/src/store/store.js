import {defineStore} from 'pinia'

export const definedPerson=defineStore("personPinia",//全局唯一值
    {
        state:()=>{  //state中用于定义响应式数据
            return {
                username:"zhangshan",
                age:20,
                hobbies:["唱歌","跳舞","阅读"]
            }
        },
        getters:{
            getAge(){
                return this.age
            },
            getHobbyLength(){
                return this.hobbies.length
            }
        },
        actions:{
            doubleAge(){
                this.age=this.age*2
            }
        }
})

