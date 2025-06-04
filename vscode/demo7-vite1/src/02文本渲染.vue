<script setup>
//v-*** 这种写法的方式使用的是vue的命令
//v-***的命令必须依赖元素,并且要写在元素的开始标签中
//v-***指令支持ES6中的字符串模板
//插值表达式中支持javascript的运算表达式
//插值表达式中也支持函数的调用
//v-text可以将数据渲染成双标签中间的文本,但是不识别html元素结构的文本
//v-html可以将数据渲染成双标签中间的文本,识别html元素结构的文本

let msg="hello vue"

let age=10

let fun=()=>{
    return "i love you"
}

let hehe="hehe"
let text=`hello ${hehe}`

let html="<h3>haha</h3>"
</script>

<template>
  <div>
    <h1 v-text="msg"></h1>
    <h1 v-text="age > 18?'成年':'未成年'"></h1>
    <h1 v-text="fun()"></h1>
    <h1 v-text="text"></h1>
    <h1 v-text="`hello  ${hehe}`"></h1>
    <h1 v-text="html"></h1>
    <h1 v-html="html"></h1>
  </div>
</template>

<style scoped>

</style>
