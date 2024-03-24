import java.util.*;


class oopsstart{

    
    public static void main(String[] args) {
     Student[] s = new Student[5];
        Student m = new Student();
        // System.out.println(m.rollno);
        m.change_name();
        // m.greeting();
        Student x = new Student(m);
        x.greeting();
        System.out.println(x.marks);
        // using constructor
        Student r2 = new Student();
        r2.greeting();
        Student r3 = r2;
        r2.name ="mal";
        System.out.println(r3.name);

        // wrapper classes
        Integer x2 = 445;
        System.out.println(x2.byteValue());
        final int v =10;
        System.out.println(v);
        final A a1 = new A();
        a1.a= 878;
        System.out.println(a1.a);
        // a1 = new A(); cannot be done 

    }
}
class Student{
    int rollno ;
    String name ;
    int marks =15;
    Student (){
        // this.rollno = 12;
        // this.name = "vishnu";
        // this.marks = 13;
        this (13,"vishnu", 98);

    }
    Student(Student k){
        this.name=k.name;
        this.rollno = k.rollno;
        this.marks = k.marks;
    }
    Student(int roll, String name ,int marks)
    {
        this.marks = marks;
        this.rollno = roll;
        this.name = name;
    }
    void greeting(){
        System.out.println("hi may name is "+ this.name);
        System.out.println(this.rollno);
        System.out.println(this.marks);
    }
    void change_name(){
        this.name="vm";
    }
   
}
class A{
    int a ;
    int b;
    A(){
        this.a = 5;
        this.b = 10;
    }
}
