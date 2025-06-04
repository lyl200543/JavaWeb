<script setup>
import {ref} from "vue"

let counter=ref(1)
function counterIncr(){
  counter.value++
}

function counterdecr(){
  counter.value--
}

function showCounter(){
  alert(counter.value)
}
</script>

<template>
  <div>
    <button @click="counterIncr()">+</button>
    <span v-text="counter"></span>
    <button @click="counterdecr()">-</button>
    <button @click="showCounter()">showCounter</button>
  </div>
</template>

<style scoped>

</style>
