<script setup>
import { useRouter } from 'vue-router';

const router=useRouter()
let username=window.sessionStorage.getItem("username")
function logout(){
  window.sessionStorage.removeItem("username")
  router.push("/login")
}
</script>

<template>
  <div>
    欢迎 {{ username }} 登录<br>
    <button @click="logout()">退出登录</button>

  </div>
</template>

<style scoped>

</style>
