import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Worker-1: ");
        String str1=input.nextLine();
        String str2=input.nextLine();
        Email em1=new Email(str1,str2);
        System.out.println(em1.Showinfo()); 
        System.out.println("Enter Worker-2: ");
        String str3=input.nextLine();
        String str4=input.nextLine();
        Email em2=new Email(str3,str4);
        System.out.println(em2.Showinfo()); 


    }
    
}
