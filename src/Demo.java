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

public class Demo{
    public static void main(String[] args){
        Cat lala=new Cat("花花",3);
        lala.said();
    }
}

class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
    public void claim(){
        System.out.println("试试看");
    }
}

class Cat extends Animal{
    int age;
    public Cat(String name,int age){
        super(name);
        this.age=age;

    }
    public void said(){
        super.claim();
        System.out.println("我是一只可爱的小猫");
    }
}