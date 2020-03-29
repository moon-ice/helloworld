//这里还是list2
//public class Demo {
//    public String name;
//    public int age;
//
//    //在这里this指他本身的类
//    public  Demo(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//
//    public void say(){
//        System.out.println("网站的名字是："+name+"，已经成了"+age+"年");
//    }
//    public static void main(String[] args){
//        Demo obj=new Demo("为学原",3);
//        obj.say();
//    }
//}
//
//可实例化的类的创建：
//1.先创建一个类
//2.构造它的方法
//3.用this给它默认值（可有可无
//public class Demo{
//
//    //首先给它属性
//    String name;
//    int age;
//
//    //①其次构造方法
//    public Demo(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//
//    //②这里只能用this来给它默认值
//    public Demo(){
//        this("为学员",3);
//    }
//
//      //上面的①②假如不需要形参的话也可以直接这样写
////        public Demo(){
////            name="为学员";
////            age=3;
////        }
//
//    //以下就可以是它的方法、函数了
//    public void say(){
//        System.out.println("网站的名字是："+name+",已经成立"+age+"年了。");
//    }
//
//    //在其他程序调用这个类的时候形如这样~
//    public static void main(String[] args){
//        //我们写的构造方法只有两个参数，因此我们传递参数时也只能传递两个参数，想只传递一个的话就方法重写咯
//        Demo myDemo=new Demo("啊哈",2);
//        myDemo.say();
//    }
//}

//方法重载:在Java中，同一个类中的多个方法可以有相同的名字，只要它们的参数列表不同就可以。
//重载分辨：方法名称相同时，编译器会根据调用方法的参数个数、参数类型等去逐个匹配，以选择对应的方法，如果匹配失败，则编译器报错。
//跟成员方法一样，构造方法也可以重载。
//声明为final的方法不能被重载。
//声明为static的方法不能被重载，但是能够被再次声明。

//public class Demo{
//    //一个普通的方法，不带参数
//    void test(){
//        System.out.println("No parameters");
//    }
//
//    //重载上面的方法，并且带了一个参数
//    void test(int a){
//        System.out.println("a:"+a);
//    }
//
//    //重载上面的方法，并且带了两个参数
//    void test(int a,int b){
//        System.out.println("a:"+a+" b:"+b);
//    }
//
//    //重载上面的方法，并且带了一个双精度参数
//    double test(double a){
//        System.out.println("double a:"+a);
//        return a;
//    }
//
//    public static void main(String args[]){
//        Demo myDemo=new Demo();
//        myDemo.test();
//        myDemo.test(2);
//        myDemo.test(2.3);
//        myDemo.test(2.0);
//    }
//}

//public class Demo{
//    public static void main(String[] args){
//        Cat obj=new Cat();
//        obj.move();
//    }
//}
//
//class Animal{
//    private String desc="Animals are human's good friends";
//    public String getDesc(){return desc;}
//
//    public void move(){
//        System.out.println("Animals can move");
//    }
//}
//class Cat extends Animal{
//    public void move(){
//        super.move();
//        System.out.println("Cat can walk and run");
//        System.out.println("Please remember:"+super.getDesc());
//    }
//}
//
//public class Demo{
//    public static void main(String[] args){
//        Cat lala=new Cat("花花",3);
//        lala.said();
//    }
//}
//
//class Animal{
//    String name;
//    public Animal(String name){
//        this.name=name;
//    }
//    public void claim(){
//        System.out.println("试试看");
//    }
//}
//
//class Cat extends Animal{
//    int age;
//    public Cat(String name,int age){
//        super(name);
//        this.age=age;
//
//    }
//    public void said(){
//        super.claim();
//        System.out.println("我是一只可爱的小猫");
//    }
//}
//
//public final class Demo{
//    public static void main(String[] args){
//        //引用people实例
//        People1 obj=new People1();
//        if (obj instanceof Object){
//            System.out.println("我是一个对象");
//        }
//        if (obj instanceof People1) {
//            System.out.println("我是人类");
//        }
//        if (obj instanceof President){
//            System.out.println("我是校长");
//        }
//
//        System.out.println("--------------------");
//
//
//    }
//}
//
//class People1{}
//class Teacher1 extends People1{}
//class President extends Teacher1{}
//
//public class Demo{
//    public static void main(String[] args){
//        Outer outer=new Outer();
//        Outer.Inner inner=outer.new Inner();
//        inner.dostuff();
//    }
//}
//class Outer{
//    private int size;
//    class Inner{
//        public void dostuff(){
//            size++;
//        }
//    }
//}
//public class Demo{
//    public static void main(String[] args){
//        test123 test345=new test123();
//        test123.Inner test789=test345.new Inner();
//        test789.tttt();
//    }
//}
//class test123{
//    private int a;
//    class Inner{
//        public void tttt(){
//            a++;
//        }
//    }
//}
//import static java.lang.System.*;
//
//public final class Demo{
//    public static void main(String[] args){
//        Teacher t=new Teacher();
//        t.setName("王明");
//        t.work();
//
//        Driver d=new Driver();
//        d.setName("小陈");
//        d.work();
//    }
//}
//
//abstract class People{
//    private String name;
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public  abstract void work();
//}
//
//class Teacher extends People{
//    public void work(){
//        out.println("我的名字叫"+this.getName()+"，我正在讲课额，请大家不要东张西望");
//    }
//}
//
//class Driver extends People{
//    public void work(){
//        out.println("我的名字叫："+this.getName()+",我正在开车，不能接听电话。。");
//    }
//}

////实现接口的格式如下：
////        修饰符 class 类名 extends 父类 implements 多个接口
//import static java.lang.System.*;
//
//public class Demo{
//    public static void main(String[] args){
//        SataHdd sh1=new SeagateHdd();
//        SataHdd sh2=new SeagateHdd();
//    }
//}
////串行硬盘接口
//interface SataHdd{
//    //连接线数量
//    public static final int CONNECT_LINE=4;
//    //写数据
//    public void writeData(String data);
//    //读数据
//    public String readData();
//}
//
////维修硬盘接口
//interface fixHdd{
//    //维修地址
//    String address="北京市海淀区";
//    //开始维修
//    boolean doFix();
//}
//
////希捷硬盘(这里实现接口
//class SeagateHdd implements SataHdd,fixHdd{
//    //希捷硬盘读取数据
//    public String readData(){
//        return "数据";
//    }
//    //希捷硬盘写入数据
//    public void writeData(String data){
//        out.println("写入成功");
//    }
//    //维修希捷键盘
//    public boolean doFix(){
//        return true;
//    }
//}
//
////三星硬盘
//class SamsunHdd implements SataHdd{
//    //三星硬盘读取数据
//    public String readData(){
//        return "数据";
//    }
//    //三星硬盘写入数据
//    public void writeData(String data){
//        out.println("写入成功");
//    }
//}
//
////某劣质硬盘，不能写数据
//abstract class XXHdd implements SataHdd{
//    //硬盘读取数据
//    public String readData(){
//        return "数据";
//    }
//}
//通过构造方法来使用接口
//public class Demo{
//    //构造一个方法来使用B类中a接口里的方法
//    public void test1(A a){
//        a.doSth();
//    }
//    public static void main(String[] args){
//        Demo d=new Demo();
//        //B类将自己的a接口实例化
//        A a=new B();
//        //那么Demo类中，可以使用B类中的a接口
//        d.test1(a);
//    }
//}
//
//interface A {
//    public int doSth();
//}
//class B implements A{
//    public int doSth(){
//        System.out.println("now in B");
//        return 123;
//    }
//}
//public class Demo{
//    public static void main(String[] args){
//        //实例化泛型
//        Point<Integer,Integer> p1=new Point<Integer, Integer>();
//        p1.setX(10);
//        p1.setY(20);
//        int x=p1.getX();
//        int y=p1.getX();
//        System.out.println("This point is:"+x+","+y);
//
//        Point<Double,String> p2=new Point<Double, String>();
//        p2.setX(25.4);
//        p2.setY("东京180度");
//        double m=p2.getX();
//        String n=p2.getY();
//        System.out.println("This point is:"+m+","+n);
//    }
//}
//
////定义泛型
//class Point<T1,T2>{
//    T1 x;
//    T2 y;
//    public T1 getX(){
//        return x;
//    }
//    public void setX(T1 x){
//        this.x=x;
//    }
//    public T2 getY(){
//        return y;
//    }
//    public void setY(T2 y){
//        this.y=y;
//    }
//}

//public class Demo{
//    public static void main(String[] args){
//        Point<Integer,Integer> p1=new Point<Integer, Integer>();
//        p1.setX(10);
//        p1.setY(20);
//        p1.printPoint(p1.getX(),p1.getY());
//
//        Point<Double,String> p2=new Point<Double, String>();
//        p2.setX(14.5);
//        p2.setY("洗吧洗撒");
//        p2.printPoint(p2.getX(),p2.getY());
//
//    }
//
//}
//
////定义泛型
//class Point<T1,T2>{
//    T1 x;
//    T2 y;
//    public T1 getX(){
//        return x;
//    }
//    public void setX(T1 x){
//        this.x=x;
//    }
//    public T2 getY(){
//        return y;
//    }
//    public void setY(T2 y){
//        this.y=y;
//    }
//    public <T1,T2> void printPoint(T1 x,T2 y){
//        System.out.println("This point is"+x+y);
//    }
//}
//public class Demo{
//    public static void main(String[] args){
//        InfoImp<String> obj=new InfoImp<String>("www.weixueyuan.net");
//        System.out.println("Length Of String:"+obj.getVar().length());
//    }
//}
//
////定义泛型接口
//interface Into<T>{
//    public T getVar();
//}
//
////实现接口
//class InfoImp<T> implements Into<T>{
//    private T var;
//    //定义泛型构造方法
//    public InfoImp(T var){
//        this.setVar(var);
//    }
//    public void setVar(T var){
//        this.var=var;
//    }
//    public T getVar(){
//        return this.var;
//    }
//}
//
//
//public class Demo{
//    public static void main(String[] args){
//        Point p=new Point();
//        p.setX(10);
//        p.setY(20.8);
//        int x=(Integer)p.getX();
//        double y=(Double)p.getY();
//        System.out.println("This point is: "+x+" "+y);
//    }
//}
//
//class Point<T1,T2>{
//    T1 x;
//    T2 y;
//    public T1 getX(){
//        return x;
//    }
//    public void setX(T1 x){
//        this.x=x;
//    }
//    public T2 getY(){
//        return y;
//    }
//    public void setY(T2 y){
//        this.y=y;
//    }
//}

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Demo {
    public static void main(String args[]) {

        int num = 2147483647;
        long temp = num + 2L;
        System.out.println(num);
    }
}