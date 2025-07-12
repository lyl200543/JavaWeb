<script setup>
import {useRouter} from 'vue-router'
import {ref} from 'vue'

const router=useRouter()
let myPath=ref("")

function goMyPage(){
  router.push(myPath.value)
}
</script>

<template>
  <div>
    <h1>App顶部</h1>
    <!-- 编程式路由 -->
    <button @click="goMyPage()">Go</button>
    <input type="text" v-model="myPath">
    <hr>
      <router-view></router-view>
    <hr>
    <h1>App底部</h1>
  </div>
</template>

<style scoped>

</style>
