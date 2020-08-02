package com.heller;

/**
 * 运行参数:

    java -Xbootclasspath/p:/Users/heller/study-code/design-pattern/test/target/classes com.heller.TestMyString

 */
public class TestMyString {
    public static void main(String[] args) {
        String myString = new String("test");
        System.out.println(myString);
    }
}

/**
 有个问题是，Java 中，可不可以自己写一个 String 类，覆盖掉原生的 String 类。

 类加载机制中，父类加载器委派加载原则，决定了不可以，直接回报错。

 但是，java 本事其实提供了可以替代的方案，就是上面的命令

     # 指定新的bootclasspath，替换java.*包的内部实现
        java -Xbootclasspath: your_App
     # a意味着append，将指定目录添加到bootclasspath后面
        java -Xbootclasspath/a: your_App
     # p意味着prepend，将指定目录添加到bootclasspath前面
        java -Xbootclasspath/p: your_App

 */