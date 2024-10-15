import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = obj.next();
        System.out.print("Enter your age : ");
        int age = obj.nextInt();
        System.out.print("Enter your Gender :");
        String gender = obj.next();
        System.out.print("Enter your Admission Number :");
        String adm = obj.next();
        System.out.println("\n\nYou entered the following info:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Adm: "+adm);
        obj.close();
    }
}