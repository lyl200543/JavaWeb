import * as m from "./module.js"
console.log(m.PI)
console.log(m.sum(10,20))
let p=new m.Person("张三",18)
p.sayHello()

console.log(m.default(10,20));
