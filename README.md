# tutorial-groovy

# 概述

- 基于 Java 平台的面向对象语言
- 特点 
  - todo
- 官网 http://www.groovy-lang.org/

# 环境

- 安装 http://www.groovy-lang.org/download.html
- 验证 `groovy -v`

# 语法

## 数据类型

- 保留字

  | as     | assert  | break      | case       |
  | ------ | ------- | ---------- | ---------- |
  | catch  | class   | const      | continue   |
  | def    | default | do         | else       |
  | enum   | extends | false      | Finally    |
  | for    | goto    | if         | implements |
  | import | in      | instanceof | interface  |
  | new    | pull    | package    | return     |
  | super  | switch  | this       | throw      |
  | throws | trait   | true       | try        |
  | while  |         |            |            |

- 内置数据类型

  - **byte** -这是用来表示字节值。例如 2。
  - **short** -这是用来表示一个短整型。例如 10。
  - **int** -这是用来表示整数。例如 1234。
  - **long** -这是用来表示一个长整型。例如 10000090。
  - **float** -这是用来表示 32 位浮点数。例如 12.34。
  - **double** -这是用来表示 64 位浮点数，这些数字是有时可能需要的更长的十进制数表示。例如 12.3456565。
  - **char** -这定义了单个字符文字。例如“A”。
  - **Boolean** -这表示一个布尔值，可以是 true 或 false。
  - **String** -这些是以字符串的形式表示的文本。例如，“Hello World”。

- 绑定值

  | byte   | -128到127                                                |
  | ------ | -------------------------------------------------------- |
  | short  | -32,768 到 32,767                                        |
  | int    | 2,147,483,648 到 147,483,647                             |
  | long   | -9,223,372,036,854,775,808 到 +9,223,372,036,854,775,807 |
  | float  | 1.40129846432481707e-45 到 3.40282346638528860e + 38     |
  | double | 4.94065645841246544e-324d 到 1.79769313486231570e + 308d |

- 数字类
  - java.lang.Byte
  - java.lang.Short
  - java.lang.Integer
  - java.lang.Long
  - java.lang.Float
  - java.lang.Double
  - java.math.BigInteger 高精度计算
  - java.math.BigDecimal 高精度计算

## 变量

- 变量的名称可以由字母，数字和下划线字符组成

-  必须以字母或下划线开头。
- 区分大小写

## 运算符

- 算数运算符
- 关系运算符
- 逻辑运算符
- 位运算符
- 赋值运算符
- *范围运算符*
  - 示例，定义简单的整数范围，`def range = 0..5`

## 控制逻辑

### 循环

- while
- for
- for-in
- break
- continue

### 条件

- if
- if / else
- 嵌套 if
- switch
- 嵌套 switch

## 方法

- Groovy 中的方法是使用返回类型或使用def关键字定义的，默认情况下，方法为 public
- 方法有多个参数时，名称必须彼此不同
- Groovy 中还有一个规定来指定方法中的参数的默认值。 如果没有值传递给参数的方法，则使用缺省值。 如果使用非默认和默认参数，则必须注意，默认参数应在参数列表的末尾定义

## 文件 I/O

- todo

## 数字

- 方法参考 Java

## 字符串

- String字面量可以使用单引号(`)、双引号(")、三引号(""")括起来。其中，三重引号内字符串可跨行
- 字符串是字符的有序序列，字符串中的单个字符可以通过其位置访问
- 字符串方法 https://tech.souyunku.com/?p=8527

## 列表

- [11，12，13，14] – 整数值列表
- [’Angular’，’Groovy’，’Java’] – 字符串列表
- [1，2，[3，4]，5] – 嵌套列表
- [’Groovy’，21，2.11] – 异构的对象引用列表
- [] – 一个空列表

## 映射

- [’TopicName’：’Lists’，’TopicName’：’Maps’] – 具有 TopicName 作为键的键值对的集合及其相应的值
- [：] – 空映射

## 日期和时间

- todo

## 正则表达式

- todo

## 异常处理

- todo

## 面向对象

- 参考 Java

## 泛型

- 参考 Java

## 闭包

- 闭包是一个短的匿名代码块，可以使用形参，可以在定义闭包时引用变量
- 闭包也可以用作方法的参数
- 所有的闭包都有返回值；没有 return 语句；默认返回 null
- 常用方法
  - find() 查找集合中与某个条件匹配的第一个值
  - findAll() 找到接收对象中与闭合条件匹配的所有值
  - any() & every() 迭代集合的每个元素，检查布尔谓词是否对至少一个元素有效
  - collect() 通过集合收集迭代，使用闭包作为变换器将每个元素转换为新值

## 注释

- todo

# 其它

- XML
- JMX
- JSON
- DSL
- 数据库
- 构建器
- 命令行
- 单元测试
- 模板引擎
- 元对象编程

# 参考

- https://tech.souyunku.com/?p=8587

