项目简介
Vue学习
    1.声明式渲染{{msg}}
    2.v-model双向绑定元素属性，:value可以省略；.trim去除首尾空格；v-bind:单向绑定，可省略成:value
    3.条件渲染：v-if与v-else之间不能有其他元素节点；
      条件渲染：v-show控制style属性中的disply是否展示，展示为show，不展示为none。
    4.列表迭代渲染:v-for
    5.事件驱动：v-on表示绑定点击事件，v-on可以省略成@click，相关function写在"methods":{}中。
    6.侦听函数，"watch":{}中。
    7.//Vue对象生命周期
    beforeCreate:function (){
    console.log("***对象创建之前***");
    console.log(this.msg);
    },
    created:function (){
    console.log("***对象创建之后***");
    console.log(this.msg);
    },
    //数据装载之前
    beforeMount:function (){
    console.log("***数据装载之前***");
    console.log(document.getElementById("span").innerText);
    },
    mounted:function (){
    console.log("***数据装载之后***");
    console.log(document.getElementById("span").innerText);
    },
    beforeUpdate:function (){
    console.log("***数据更新之前***");
    console.log(this.msg);
    console.log(document.getElementById("span").innerText);
    },
    updated:function (){
    console.log("***数据更新之后***");
    console.log(this.msg);
    console.log(document.getElementById("span").innerText);
    }
