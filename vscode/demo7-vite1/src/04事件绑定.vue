<script setup>
import {ref} from 'vue'
//v-on:事件名称="函数名()"
//v-on:事件名可以简写 @事件名
//原生js的事件名是 on***   onclick ondbclick onblur onfocus
//vue中的事件名去掉on   click dbclick blur focus
let fun1=function(){
    alert("hi")
}

let counter=ref(0)

let fun2=function(){
    counter.value++;
}

let fun3=function(event){
    let flag=confirm("链接可能不安全，确定跳转吗？")
    if(!flag){
        event.preventDefault()
    }
}

let fun4=function(){
    alert("该链接被点击了")
}

</script>

<template>
    <div>
        <button v-on:click="fun1()">按钮</button>
        <button v-on:click.once="fun2()">+</button>
        <!-- 内联事件处理器 -->
        <button v-on:click="counter++">+</button>
        {{ counter }}
        <br>
        <a href="http://www.atguigu.com" v-on:click="fun3($event)">尚硅谷</a><br>
        <a href="http://www.atguigu.com" v-on:click.prevent="fun4()">尚硅谷2</a>
    </div>
</template>

<style scoped>

</style>
