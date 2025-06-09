<script setup>
import {ref,reactive} from 'vue'
//让一个普通数据转换为响应式数据 两种方式
//1 ref函数        更适合单个变量
//2 reactive函数   更适合对象
let counter=ref(0)
function incre(){
  counter.value++
}

let person=reactive({
  name:"张三",
  age:18
})

function increAge(){
  person.age++
}
</script>

<template>
  <div>
    <button @click="incre()">+</button>
    {{ counter }}
    <hr>
    <button @click="increAge()">+</button>
    {{ person.age }}
  </div>
</template>

<style scoped>

</style>
