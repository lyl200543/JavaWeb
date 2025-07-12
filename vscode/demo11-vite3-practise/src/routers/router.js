import {createRouter,createWebHashHistory} from 'vue-router'
import Login from '../components/Login.vue'
import Home from '../components/Home.vue'

const router=createRouter({
    history:createWebHashHistory(),
    routes:[
        {
            path:"/",
            component:Home
        },
        {
            path:"/login",
            component:Login
        },
        {
            path:"/home",
            component:Home
        },
    ]
})

//路由前置守卫
//防止未登录的情况下进入home页
router.beforeEach((to,from,next)=>{
    //to 是目标地包装对象  .path属性可以获取地址
    //from 是来源地包装对象 .path属性可以获取地址
    //next是方法，不调用默认拦截！ next() 放行,直接到达目标组件
    //next('/地址')可以转发到其他地址,到达目标组件前会再次经过前置路由守卫
    if(to.path=="/login"){
        next()
    }
    if(to.path=="/home"){
        if(!window.sessionStorage.getItem("username"))
            next("/login")
        else
            next()

    }
})

export default router 