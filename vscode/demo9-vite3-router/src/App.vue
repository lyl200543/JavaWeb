<script setup>
</script>

<template>
  <div>
    <h1>App页面顶部</h1><br>
    <router-link to="/home">home</router-link><br>
    <router-link to="/list">list</router-link><br>
    <router-link to="/add">add</router-link><br>
    <router-link to="/update">update</router-link><br>
    <hr>
    <router-view></router-view>
    <hr>
    <h1>App页面底部</h1>

  </div>
</template>

<style scoped>

</style>
