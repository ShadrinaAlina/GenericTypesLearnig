package customgenerictypes;

public class Main {
 public static void main (String[] args){
    Account acc1 = new Account(12345, 5000);
    System.out.println(acc1.getId());

    Account acc2 = new Account("sid12456", 5000);
    System.out.println(acc2.getId());
 }
}
