<script setup>
import {ref,reactive} from 'vue'
//v-model专门用于双向绑定表单标签的value属性,语法为 v-model:value='',可以简写为 v-model=''
//v-model还可以用于各种不同类型的输入，<textarea>、<select> 元素
let user=reactive({
  username:"",
  userpwd:"",
  hobbies:[],
  intro:"",
  pro:""
})

function clearForm(){
  user.username=""
  user.userpwd=""
  user.hobbies=[]
  user.intro=""
  user.pro=""
}
</script>

<template>
  <div>
    用户名：<input type="text" v-model="user.username"><br>
    密码：<input type="password" v-model="user.userpwd"><br>
    爱好：
      唱<input type="checkbox" v-model="user.hobbies" value="sing">
      跳<input type="checkbox" v-model="user.hobbies" value="dance">
      rap<input type="checkbox" v-model="user.hobbies" value="rap"><br>
    简介：<textarea v-model="user.intro"></textarea><br>
    省份：<select v-model="user.pro">
      <option>江</option>
      <option>浙</option>
      <option>沪</option>
    </select><br>
    <button @click="clearForm()">清空</button><br>
    {{ user }}
    
  </div>
</template>

<style scoped>

</style>
