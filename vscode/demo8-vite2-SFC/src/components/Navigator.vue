<script setup>
import { defineEmits } from 'vue';
const emits=defineEmits(["sendMessage"])

function send(data){
    emits("sendMessage",data)
}
</script>

<template>
  <div>
    <ul>
        <li @click="send('学员管理')">学员管理</li>
        <li @click="send('教师管理')">教师管理</li>
        <li @click="send('班级管理')">班级管理</li>
        <li @click="send('宿舍管理')">宿舍管理</li>
        <li @click="send('社团管理')">社团管理</li>
    </ul>
  </div>
</template>

<style scoped>

</style>