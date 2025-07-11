<script setup>
import {ref} from 'vue'
import Header from './components/Header.vue'
import Navigator from './components/Navigator.vue'
import Content from './components/Content.vue'

let msg=ref("")

function receiver(data){
  msg.value=data
}
</script>

<template>
  <div>
    <Header class="header"></Header>
    <Navigator @sendMessage="receiver" class="navigator"></Navigator>
    <Content v-bind:message="msg" class="content"></Content>
  </div>
</template>

<style scoped>
  .header{
    height: 80px;
    background-color: rgb(212, 100, 100);
    border: 1px solid red;
    margin-bottom: 4px;
  }
  .navigator{
    width: 24%;
    height: 500px;
    background-color: rgb(135, 218, 135);
    border: 1px solid green;
    float: left;
  }
  .content{
    width: 75%;
    height: 500px;
    background-color: rgb(128, 128, 207);
    border: 1px solid blue;
    float: right;
  }
</style>
