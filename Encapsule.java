public class Encapsule {
    public static void main(String[] args) {
        System.out.println("encapsulation");

    //     Student s1 = new Student();
    //    s1.setId(101);
    //    s1.setName("suman");


    //    System.out.println(s1.getId());
    //    System.out.println(s1.getName());




    BankAccount acc = new BankAccount();

    acc.deposite(10000);
    acc.withdraw(3000);

    System.out.println("Available balance  = "+ acc.getBalance());
    
    }
}



// class Student {
//     private  int id ;
//    private  String name;



//    // setter method 

//    public void setId(int id) {
//     this.id = id ;
//    }
//    public  void setName(String name ) {
//     this.name = name;
//    }

//    // getter method 

//    public int getId() {
//     return id;
//    }

//    public String getName() {
//     return name;
//    }
// }



class BankAccount {
    private double balance ;

    public void deposite(double amount) {
        if (amount >0) {
            balance = balance + amount;
            System.out.println("deposite successfully");
        } else {
            System.out.println("invalid deposite amount");
        }
    }


    public  void withdraw (double amount) {
        if (amount >0 && amount <=balance) {
            balance = balance-amount;
            System.out.println("withdraw successfully");
            // System.out.println("remaining balance = " + balance);
        } else {
            System.out.println("invalid withdraw");
        }
    }


    public double getBalance () {
        return balance; 
    }
}


