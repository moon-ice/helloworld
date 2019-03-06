//这里也是list2
//java包的第二种方法调用：import导入
//import java.util.Date;
public class Dog {
    String name;
    int age;

    //这里的Dog是类的构造方法，有了它就能创建对象，并且能够自动执行使它的实例初始化！~啊哈
    Dog(String name1, int age1) {
        System.out.println("感谢主任领养了我");
        name =name1;
        age =age1;
    }


    void bark() {
        System.out.println("汪汪，不要过来！");
    }

    void hungry() {
        System.out.println("主人，我饿了！");
    }

    public static void main(String arg[]){

        //包的调用第一种方法：用完整的包名
//        java.util.Date today=new java.util.Date();
//        System.out.println(today);

//        Dog myDog =new Dog("花花",3);
//        //访问成员变量
//        String name =myDog.name;
//        int age =myDog.age;
//        System.out.println("我是一只小狗，我的名字叫"+name+",我"+age+"岁了");
//        //访问方法
//        myDog.bark();
//        myDog.hungry();
    }
    //public对所有类可见 protected对自己的类以及子类可见 private仅自身类可见
//    父类中声明为public的方法在子类中也必须为public。
//
//    父类中声明为protected的方法在子类中要么声明为protected，要么声明为public。不能声明为private。
//
//    父类中默认修饰符声明的方法，能够在子类中声明为private。
//
//    父类中声明为private的方法，不能够被继承。
}