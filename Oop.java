import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        System.out.println("oops starting ");

                Scanner sc =  new Scanner(System.in);

        // Student s1 = new Student();
        // Student s2 = new Student();


  


        // System.out.println("enter your id : ");
        // s1.id = sc.nextInt();

        // sc.nextLine();
        
        // System.out.println("enter your name");
        // s1.name = sc.nextLine();

        // System.out.println("enter your age ");
        // s1.age = sc.nextInt();
        // s1.display();

        //  sc.close();

        // s1.id = 101;
        // s1.name = "suman";
        // s1.age = 12;

        // s1.display();


        // s2.id = 102;
        // s2.name = "riya";
        // s2.age = 14;

        // s2.display();



        // Student s1 = new Student();
        // Student s2 = new Student(102);
        // Student s3 = new Student(103 , "suman");
        // Student s4 = new Student(104 , "riya" , 88.8);

        // s1.display();
        // s2.display();
        // s3.display();
        // s4.display();



        // Student s1 = new Student(101 , "suman");
        // Student s2 = new Student(s1);

        // s1.display();
        // s2.display();



        Student s1 = new Student();
        // Student s2 = new Student();


        // s1.setData(101, "suman");
        // s1.display();


        // s2.setData(102, "rahul");
        // s2.display();
    }
}


// class Student {
//     int id ;
//     String name ;


//     void setData(int id , String name) {
//         this.id = id ;
//         this.name = name;
//     }


//     void display () {
//         System.out.println(id);
//         System.out.println(name);
//     }
// }



class Student {
    Student() {
        this(101 , "suman");
        System.out.println("default constructor");
    }

    Student(int id , String name ) {
        System.out.println("ID = " + id);
    }
}















// class Student {
//     int id ;
//     String name ;
//     int age;

//     void display() {
//         System.out.println("student ID : " + id );
//         System.out.println("Name : " + name);
//         System.out.println("age : " + age );
//     }
// }




// class Student {
//     int id ;
//     String name;
    
//     Student() {
//         id = 101;
//         name = "suman";
//     }


//     void display () {
//         System.out.println("ID : " + id);
//         System.out.println("Name : " + name);
//     }
// }





// class Student {
//     int id;
//     String name ;
//     double marks;


//     Student() {
//         id = 0;
//         name = "unknown";
//         marks = 0.0;
//     }

//     Student(int i) {
//         id = i;
//         name = "not assigned";
//         marks = 0.0;
//     }

//     Student(int i , String n){
//         id = i;
//         name = n;
//         marks = 0.0;
//     }

//     Student(int i , String n , double m) {
//         id = i;
//         name = n;
//         marks = m;
//     }

//     void display() {
//         System.out.println("ID : " + id);
//         System.out.println("Name : " + name);
//         System.out.println("Marks : " + marks);
//     }
// }



// class Student {
//     int id;
//     String name;


//     Student(int id , String name){
//         id = id;
//         name = name;
//     }

//     Student (Student s) {
//         id = s.id;
//         name = s.name;
//     }

//     void  display() {
//         System.out.println(id + " " + name);
//     }
// }









