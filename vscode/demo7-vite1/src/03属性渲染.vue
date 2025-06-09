<script setup>
//要渲染元素的属性应该使用v-bind
const data={
    logo:"http://www.atguigu.com/images/index_new/logo.png",
    name:"尚硅谷",
    url:"http://www.atguigu.com"
}

</script>

<template>
    <div>
        <a v-bind:href="data.url">{{ data.name }}</a>
        <img v-bind:src="data.logo" v-bind:title="data.name">
    </div>
</template>

<style scoped>

</style>

