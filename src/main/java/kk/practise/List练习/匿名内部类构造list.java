package kk.practise.List练习;import java.util.ArrayList;import java.util.List;/** * @author kangkai on 2018/4/11. * https://www.cnblogs.com/dengyungao/p/7524981.html * 第一层花括号定义了一个继承于ArrayList的匿名内部类 (Anonymous Inner Class)： * 第二层花括号实际上是这个匿名内部类实例初始化块 (Instance Initializer Block) */public class 匿名内部类构造list {    public static void main(String[] args) {        List<String> list = new ArrayList<>(10){{            this.add("1");        }};    }}