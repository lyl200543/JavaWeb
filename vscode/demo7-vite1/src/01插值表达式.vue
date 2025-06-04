<script setup>
//插值表达式{{}}
let msg="hello vue"

let getMsg=()=>{
  return "massage=hello vue"
}

let carts=[{name:"可乐",price:5},{name:"薯片",price:8}]

</script>

<template>
  <div>
    {{ msg }}<br>
    {{ getMsg() }}<br>
    {{ carts[0].price+carts[1].price }}

  </div>
</template>

<style scoped>

</style>
