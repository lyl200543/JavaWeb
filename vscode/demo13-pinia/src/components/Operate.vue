<script setup>
import {definedPerson} from '../store/store'
let person=definedPerson()

</script>

<template>
  <div>
    <h1>修改pinia数据</h1><br>
    姓名：<input type="text" v-model="person.username"><br>
    年龄：<input type="text" v-model="person.age"><br>
    爱好：
      唱歌<input type="checkbox" v-model="person.hobbies" value="唱歌">
      跳舞<input type="checkbox" v-model="person.hobbies" value="跳舞">
      阅读<input type="checkbox" v-model="person.hobbies" value="阅读"><br>
      <button @click="person.doubleAge()">年龄增加2倍</button><br>
      <button @click="person.$reset()">恢复默认</button><br>

    {{ person }}
  </div>
</template>

<style scoped>

</style>
