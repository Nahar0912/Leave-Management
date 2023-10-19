import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Officer> officers = new Vector<Officer>(3);
        Vector<Staff> staffs = new Vector<Staff>(3);


        System.out.println("Type of Employee: ");
        System.out.println("Enter 1 for Officer or 2 for Stuff");

        Scanner sc_emp = new Scanner(System.in);
        int choice = sc_emp.nextInt();

        System.out.println("Enter your ID: ");
        Scanner sc_id = new Scanner(System.in);
        String id = sc_id.nextLine();

        System.out.println("Enter your Name: ");
        Scanner sc_nm= new Scanner(System.in);
        String name = sc_nm.nextLine();

        System.out.println("Enter your Date of Birth");
        System.out.println("Enter Year: ");
        Scanner sc_y = new Scanner(System.in);
        int year = sc_y.nextInt();
        System.out.println("Enter Month: ");
        Scanner sc_m = new Scanner(System.in);
        int month = sc_m.nextInt();
        System.out.println("Enter Date: ");
        Scanner sc_d = new Scanner(System.in);
        int date = sc_d.nextInt();
        LocalDate dob = LocalDate.of(year,month,date);

        System.out.println("Enter your Email: ");
        Scanner sc_el = new Scanner(System.in);
        String email = sc_el.nextLine();

        System.out.println("Enter your Joining Date: ");
        System.out.println("Enter Joining Year: ");
        Scanner sc_jy = new Scanner(System.in);
        int year1 = sc_jy.nextInt();
        System.out.println("Enter Joining Month: ");
        Scanner sc_jm = new Scanner(System.in);
        int month1 = sc_jm.nextInt();
        System.out.println("Enter Joining Date: ");
        Scanner sc_jd = new Scanner(System.in);
        int date1 = sc_jd.nextInt();


    }
}