<script setup>
import {ref,reactive} from 'vue'

let pro="产品"

let items=reactive([
  {
    id:"item1",
    name:"薯片"
  },
  {
    id:"item2",
    name:"可乐"
  },
  {
    id:"item3",
    name:"炸鸡"
  }
])

let carts=reactive([
  {
    name:"薯片",
    price:8,
    number:10
  },
  {
    name:"酸奶",
    price:8,
    number:24
  },
  {
    name:"巧克力",
    price:10,
    number:100
  }
])

function deleteById(index){
  carts.splice(index,1)
}

function clear(){
  carts.splice(0,carts.length)
}

function sum(){
  let sum=0
  // for(var i=0;i<carts.length;i++){
  //   sum+=carts[i].price*carts[i].number
  // }
  for(var cart of carts){
    sum+=cart.price*cart.number
  }
  return sum
}
</script>

<template>
  <div>
    <!-- <ul>
      <li v-for="(item,index) in items" v-bind:key="item.id">
       {{pro}} {{ index+1 }} {{ item.name }}
      </li> 
    </ul> -->

    <table border="1px" v-if="carts.length>0">
      <thead>
        <tr>
          <th>序号</th>
          <th>名称</th>
          <th>单价</th>
          <th>数量</th>
          <th>金额</th>
          <th>操作</th>
        </tr>
      </thead>
        
      <tbody v-for="(cart,index) in carts">
        <td>{{ index+1 }}</td>
        <td>{{ cart.name }}</td>
        <td>{{ cart.price }}</td>
        <td>{{ cart.number }}</td>
        <td>{{ cart.price*cart.number }}</td>
        <button @click="deleteById(index)">删除</button>
      </tbody>

      <tfoot>
        <th colspan="3">总金额为：</th>
        <th colspan="2">{{ sum() }}</th>
        <button @click="clear()">清空</button>
      </tfoot>
    </table>

    <table border="1px" v-else>
      <th>购物车为空，快去选购商品吧！</th>
    </table>
  </div>
</template>

<style scoped>

</style>
