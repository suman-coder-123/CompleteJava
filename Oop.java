import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        System.out.println("oops starting ");

                Scanner sc =  new Scanner(System.in);

        Student s1 = new Student();
        // Student s2 = new Student();


  


        System.out.println("enter your id : ");
        s1.id = sc.nextInt();

        sc.nextLine();
        
        System.out.println("enter your name");
        s1.name = sc.nextLine();

        System.out.println("enter your age ");
        s1.age = sc.nextInt();
        s1.display();

         sc.close();

        // s1.id = 101;
        // s1.name = "suman";
        // s1.age = 12;

        // s1.display();


        // s2.id = 102;
        // s2.name = "riya";
        // s2.age = 14;

        // s2.display();

    }
}


class Student {
    int id ;
    String name ;
    int age;

    void display() {
        System.out.println("student ID : " + id );
        System.out.println("Name : " + name);
        System.out.println("age : " + age );
    }
}








