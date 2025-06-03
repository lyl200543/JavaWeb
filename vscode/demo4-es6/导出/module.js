// 定义一个常量
//分别导出
export const PI = 3.14
// 定义一个函数
function sum(a, b) {
  return a + b;
}
// 定义一个类
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  sayHello() {
    console.log(`Hello, my name is ${this.name}, I'm ${this.age} years old.`);
  }
}

//统一导出
export {sum,Person}

//默认导出
export default sum