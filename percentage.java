import java.util.*;  

public class percentage {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);  

        System.out.print("Enter the 1 subject no : ");
        int sub1 = sc.nextInt();

        System.out.print("Enter the 2 subject no : ");
        int sub2 = sc.nextInt();

        System.out.print("Enter the 3 subject no : ");
        int sub3 = sc.nextInt();

        System.out.print("Enter the 4 subject no : ");
        int sub4 = sc.nextInt();

        System.out.print("Enter the 5 subject no : ");
        int sub5 = sc.nextInt();

        int avg = (sub1 + sub2 + sub3 + sub4 + sub5)/5;

        System.out.print("Your percentage is : " + avg);

    }
}
