package p1;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    //Employee构造方法
    public Employee(String name) {
        this.name = name;
    }
    //设置age的值
    public  void empAge(int empAge){
        this.age=empAge;
    }
    //设置designation的值
    public void empDesignation(String empDesig){
        this.designation=empDesig;
    }
    //设置salary的值
    public void empSalary(double empSalary){
        this.salary=empSalary;
    }
    //输出信息
    public void printEmployee(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Designation:"+designation);
        System.out.println("Salary:"+salary);
    }

}
