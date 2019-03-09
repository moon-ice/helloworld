//import java.util.*;
//public class helloworld {
//    /*这里是list1
//    */
//    public static void main(String[] args) {
////        System.out.println("Hello,World!");
////        //字符型
////        char webName1='微';
////        char webName2='园';
////        char webName3='苑';
////        System.out.println("Welcome to "+webName1+webName2+webName3);
////        //整型
////        short x=22;
////        short y=022;
////        short z=0x22;
////        System.out.println("转化成十进制：x="+x+" y="+y+" z="+z);
////        //浮点型
////        float m=22.45f;
////        double n=10;
////        System.out.println(""+m+"*"+n+"="+m*n);
////        //错误写法：System.out.println(m+'*'+n+'='+m*n);
////        //原因：println()里首位必须为字符串否则内容会混乱
//
//        //布尔型
//        //在C语言里的0和1拥有自己的数据类型了
////        boolean a=100>10;
////        boolean b=100<10;
////        System.out.println("100 > 10 = "+a);
////        System.out.println("100 < 10 = "+b);
//
//        //好久没打过这些运算符了复习一下
////        int a=10;
////        int b=10;
////
////        int x=10;
////        int y=21;
////        int z=10;
////
////        System.out.println("后自加a"+(a++));
////        System.out.println("a的值："+a);
////        System.out.println("前自加 b="+(++b));
////
////        System.out.println("----------------");
////        System.out.println("说s>y对吗？"+ (x>y));
////        System.out.println("认为x>y 并且x<y 对吗？"+((x>y) && (x<y)));
////        System.out.println("认为x>=y 或者 x=y 对吗？"+(x>=y|| x==y));
////        System.out.println("认为 x<y 或者 x=z 对吗？"+((x<y)||(x==z)));
////
////        System.out.println("-----------------");
////        System.out.println("a&x的结果是"+(a&x));
//
//        //打印99乘法表
//        //printf用来控制格式（形如C语言中的printf
//        //print输出不换行println输出换行都是输出字符串可用+连接
////        int i,j;
////
////        for(i=1;i<=9;i++){
////            for(j=1;j<=i;j++){
////                System.out.printf("%d+%d=%d",i,j,i*j);
////                if(j!=i){
////                    System.out.print(" ");
////                }
////            }
////            System.out.print("\n");
////        }
//
////        int days=0;
////        Scanner sc=new Scanner(System.in);
////        System.out.print("输入年份：");
////        int year=sc.nextInt();
////        System.out.print("输入月份：");
////        int month=sc.nextInt();
////
////        switch(month){
////            case 1:
////            case 3:
////            case 5:
////            case 7:
////            case 8:
////            case 10:
////            case 12:
////                days=31;
////                break;
////            case 4:
////            case 6:
////            case 9:
////            case 11:
////                days=30;
////                break;
////            case 2:
////                //判断闰年
////                if (year%4==0 && year%100!=0 || year%400==0){
////                    days=29;
////                }
////                else
////                    days=28;
////                break;
////                default:
////                    System.out.println("月份输入错误！");
////                    System.exit(0);//强制结束程序
////        }
////        System.out.printf("天数：%d\n",days);
///*这里是list2
//
// */
//        //定义数组的两种方法
//        //没有定义数组长度语法正确但不能访问
////        int demoArray[];
////        int[] demoArray1;
////
////        //定义了数组长度就分配了空间可以访问
////        demoArray=new int[3];
////
////        //同时定义数组并分配空间
////        int array[]=new int[3];
////
////        //初始化
////        int intArray[]={1,2,3,4};
////        String stringArray[]={"为学员","啦啦啦"};
////        float floatArray[]=new float[3];
////        floatArray[0]=1.0f;
////        floatArray[1]=123.1f;
////        floatArray[2]=100f;
//
////        int intArray[]=new int[5];
////        long total=0;
////        int len=intArray.length;
////        System.out.print("请输入"+len+"个整数，以空格为分格：");
////        Scanner sc=new Scanner(System.in);
////        int i;
////        for(i=0;i<len;i++){
////            intArray[i]=sc.nextInt();
////        }
////        for (i=0;i<len;i++){
////            total+=intArray[i];
////        }
////        System.out.print("这五个整数的和为："+total);
//
//        //数组的遍历
////        int demoArray[]={1,2,3,4,5,6};
////        for (int i=0,len=demoArray.length;i<len;i++){
////            System.out.print(demoArray[i]+", ");
////        }
////        for(int x:demoArray){
////            System.out.print(x+",");
////        }
//
////        int intArray[][]={{1,2},{2,3},{4,5}};
////        int a[][]=new int[2][3];
////
////        int Arrayb[][]=new int[2][];
////        a[0]=new int[3];
////        a[1]=new int[5];
//
//        //求矩阵乘积
////        int a[][]=new int[2][3];
////        int b[][]={{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
////        int c[][]=new int[2][4];
////
////        for(int i=0;i<2;i++){
////            for (int j=0;j<3;j++){
////                a[i][j]=(i+1)*(j+2);
////            }
////        }
////
////        for (int i=0;i<2;i++){
////            for(int j=0;j<4;j++) {
////                c[i][j]=0;
////                for (int k=0;k<3;k++){
////                    c[i][j] += a[i][k] * b[k][j];
////                }
////
////            }
////        }
////        for (int i=0;i<2;i++){
////            for(int j=0;j<4;j++){
////                System.out.print(c[i][j]);
////                if (j<3)System.out.print(" ");
////            }
////            System.out.print("\n");
////        }
//
//        //字符串操作
//        //数组有属性.length 而字符串有方法.length()
////        String str1="123";
////        String str2=new String("啦啦啦");
////        String str3="呵呵呵";
////        System.out.println("The length of the str1 is "+str1.length());
////        System.out.println("The length of the str2 is "+str2.length());
////
////        //charAt()方法：索引字符串指定字符
////        String number="123456789";
////        System.out.println(number.charAt(0)+" "+number.charAt(5)+" "+number.charAt(8));
////
////        //contains()方法:检验字符串是否包含某个字符(返回一个布尔值)
////        String str="weixueyuan";
////        System.out.println(str.contains("yuan"));
////
////        //replace()方法：用来替换字符串中所有指定的字符
////        //注意：replace() 方法不会改变原来的字符串，而是生成一个新的字符串
////        String aile="python";
////        System.out.println(aile);
////        String buaile=aile.replace("python","JAVA");
////        System.out.println(buaile);
////
////        //split()方法：对字符串进行分割生成一个数组
////        String str="wei_xue_yuan_is_good";
////        String strarray[]=str.split("_");
////        System.out.println(Arrays.toString(strarray));
//
//        //String 的值是不可变的，每次对String的操作都会生成新的String对象，不仅效率低，而且耗费大量内存空间。
//        //
//        //StringBuffer类和String类一样，也用来表示字符串，但是StringBuffer的内部实现方式和String不同，在进行字符串处理时，不生成新的对象，在内存使用上要优于String。
//        //
//        //StringBuffer 默认分配16字节长度的缓冲区，当字符串超过该大小时，会自动增加缓冲区长度，而不是生成新的对象。
////        StringBuffer str1=new StringBuffer();
////        StringBuffer str2=new StringBuffer(512);
////        StringBuffer str3=new StringBuffer("123");
////
////        //字符串的”+“操作实际上也是先创建一个StringBuffer对象，然后调用append()方法将字符串片段拼接起来
////        StringBuffer str=new StringBuffer("biancheng100");
////        str.append(true);
//
//        //deleteCharAt() 方法用来删除指定位置的字符，并将剩余的字符形成新的字符串。
//        //delete(0,3)删除第1、2、3个字符
////        StringBuffer str=new StringBuffer("abcdef");
////        str.deleteCharAt(0);
////        System.out.println("删除第一个字母后:"+str);
////        str=new StringBuffer("a"+str);
////        System.out.println("回复一下不懂对不对："+str);
////        str.delete(0,1);
////        System.out.println("删除前两个字母鸭："+str);
//
//        //insert()方法：用来在指定位置插入字符串，可以认为是append()的升级版。
////        StringBuffer str=new StringBuffer("abcdf");
////        System.out.println("原来滴："+str);
////        str.insert(4,"ghi");
////        System.out.println("后来哒："+str);
//
//        //setCharAt() 方法用来修改指定位置的字符(只能改一个字符so要用单引号
////        StringBuffer str=new StringBuffer("兄弟啊！你已经不是我认识的小兄弟了！");
////        str.setCharAt(4,',');
////        System.out.println(str);
////        System.out.println("快把之前的兄弟还给我！！");
////        System.out.println("我就在这里活生生看着你们玩洛奇,..");
//
//        //String和StringBuffer的效率对比
////        String fragment="abcdefghijklmnopqrstuvwxyz";
////        int times=10000;
////
////        //通过String对象
////        long timeStart1=System.currentTimeMillis();
////        String str1="";
////        //相同的字符串相加可以引用第三方的空白字符串
////        for (int i=0;i<times;i++){
////            str1+=fragment;
////        }
////        long timeEndl=System.currentTimeMillis();
////        System.out.println("String:"+(timeEndl-timeStart1)+"ms");
////
////        //通过StringBuffer
////        long timeStart2=System.currentTimeMillis();
////        StringBuffer str2=new StringBuffer();
////        for (int i=0;i<times;i++){
////            str2.append(fragment);
////        }
////        long timeEnd2=System.currentTimeMillis();
////        System.out.println("StringBuffer:"+(timeEnd2-timeStart2)+"ms");
//
////        操作少量的数据使用 String；
////        单线程操作大量数据使用 StringBuilder；
////        多线程操作大量数据使用 StringBuffer；
//
//
//    }
//}
//import java.util.Scanner;
//public class helloworld{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int numbers=s.nextInt();
//        if (numbers%2==0)
//            System.out.println("这个数是整数");
//        else
//            System.out.println("这个数是奇数");
//        }
//}
//public class helloworld{
//    public static void main(String[] args){
//        long sum=1;
//        for (int i=1;i<=20;i++){
//            sum*=i;
//        }
//        System.out.println("20!="+sum);
//    }
//}
//public class helloworld{
//    public static void main(String[] args){
//        long sum=1,j=1;
//
//        for (int i=1;i<=20;i++){
//            j*=i;
//            sum+=j;
//        }
//        System.out.println(sum);
//    }
//}
//import java.util.Scanner;
////public class helloworld{
////    public static void main(String[] args){
////        Scanner s=new Scanner(System.in);
////        int temp;
////        int a=s.nextInt();
////        int b=s.nextInt();
////        int c=s.nextInt();
////        if (a>b){
////            temp=a;
////            a=b;
////            b=temp;
////        }
////        if (a>c){
////            temp=a;
////            a=c;
////            c=temp;
////        }
////        if (b>c){
////            temp=b;
////            b=c;
////            c=temp;
////        }
////        System.out.println(a+" "+b+" "+c);
////    }
////}

//import java.util.Scanner;
//public class helloworld{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int  mark=s.nextInt();
//        if (mark>=0 && mark<=59)
//            System.out.println("不及格");
//        else if (mark>=60 && mark<=69)
//            System.out.println("及格");
//        else if (mark>=70 && mark<=79)
//            System.out.println("中等");
//        else if (mark>=80 && mark<=89)
//            System.out.println("良好");
//        else if (mark>=90 && mark<=100)
//            System.out.println("优秀");
//    }
//}

//public class helloworld{
//    public static void main(String[] args){
//        int sum=0;
//        for (int i=1;i<=200;i++){
//            if (i%3==0)sum+=i;
//        }
//        System.out.println(sum);
//    }
//}

//public class helloworld{
//    public static void main(String[] args){
//        int count=0;
//        int i;
//        boolean issushu;
//        for (i=200;i<500;i++){
//            issushu=true;
//            for(int j=2;j<=i/2;j++){
//                if (i%j==0){
//                    issushu=false;
//                    break;
//                }
//            }
//            if (issushu==true){
//                System.out.println(i);
//                count++;
//            }
//        }
//
//    }
//
//}

//public class helloworld{
//    public static void main(String[] args){
//        for(int i=0;i<=20;i++){
//            for(int j=0;j<=(100-i*5)/3;j++){
//                int number=(100-i*5-j*3)*3;
//                int count=i+j+number;
//                if (count==100){
//                    System.out.println("公鸡："+i+" 母鸡："+j+" 小鸡："+number);
//                }
//            }
//        }
//    }
//}