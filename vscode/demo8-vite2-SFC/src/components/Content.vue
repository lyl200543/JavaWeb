<script setup>
import { defineProps } from 'vue';
defineProps({
    message:String
})
</script>

<template>
  <div>
    {{ message }}
  </div>
</template>

<style scoped>

</style>