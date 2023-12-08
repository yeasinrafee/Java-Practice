class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    // Parameterized constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    // Copy constructor
    Student(){};
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class BasicOOP{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Rafee";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}