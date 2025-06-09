<script setup>
import {ref} from 'vue'
//v-if ="表达式/数据" 数据为true 则当前元素会渲染进入dom树
//v-else 自动和前一个v-if做取反操作
//V-show=" " 数据为true 元素则展示在页面上，否则不展示
//v-if 数据为false时，元素则不再dom树中了
//v-show 数据为false是,元素仍在dom树中,通过display的css样式控制元素隐藏

let flag=ref(true)

function fun(){
  flag.value=!flag.value
}
</script>

<template>
  <div>
    <h1 v-if="flag">vue is awesome!</h1>
    <h1 v-else>oh no</h1>
    <!-- <button @click="flag=!flag">按钮</button> -->
    <button @click="fun()">按钮</button><hr>

    <h1 v-show="flag">vue</h1>
  </div>
</template>

<style scoped>

</style>
