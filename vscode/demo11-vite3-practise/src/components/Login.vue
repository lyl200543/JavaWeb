<script setup>
import {ref} from 'vue'
import {useRouter} from 'vue-router'

const router=useRouter()

let username=ref("")
let password=ref("")

function login(){
  if(username.value=="root" && password.value=="123456"){
    window.sessionStorage.setItem("username",username.value)
    router.push("/home")
  }else{
    alert("账号或密码错误")
  }
}

</script>

<template>
  <div>
    账号：<input type="text" v-model="username"><br>
    密码：<input type="password" v-model="password"><br>
    <button @click="login()">登录</button>
  </div>
</template>

<style scoped>

</style>
