<script setup>
import axios from './axios.js'
import {ref,onMounted} from 'vue'

let message=ref("土味情话")

function getWords(){
  return axios.get(
    "/api/rand.qinghua?format=json",
    {}
  )
}

async function getMessage(){
  let {data} =await getWords()
  message.value=data.content
}

onMounted(
  ()=>{
    getMessage()
  }
)
</script>

<template>
  <div>
    <h3 v-text="message"></h3>
    <hr>
    <button @click="getMessage()">获取土味情话</button>
  </div>
</template>

<style scoped>

</style>
