package com.example.groovy

/**
 *
 * @author chenpenghui* @date 2020/7/18
 *
 */
println 'hello groovy'

//def是在Groovy用来定义标识符的关键字
def name = '张三'
println name

for (String str : name) {
    println(str + '111')
}

for (str in name) {
    println(str + '222')
}

def rep = 'asdfg'
println(rep.length())

//闭包
def clos = { param -> println "Hello ${param}" }
clos.call('closure')

//映射闭包
def mp = ["TopicName": "Maps", "TopicDescription": "Methods in Maps"]
mp.each { println it }
mp.each { println "${it.key} maps to: ${it.value}" }

println('-----------------------------------------')
def var = '123qwe'
var.each {
    item ->
        println ' ' + item.find {
            if (item.isNumber()) print item
        }
}

def list = var.findAll {
    item -> item.isNumber()
}
println list

println var.any(item -> item.isNumber())

println var.collect()