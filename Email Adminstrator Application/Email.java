import java.util.Scanner;

public class Email {
    private String Firstname;
    private String Lastname;
    private String password;
    private String email;
    private String Department;
    private int MailboxCapacity=500;
    private int defaultpasswordlength=10;
    private String alternateEmail;
    private String CompanySuffix="com";

    // constructor to receive the first and last name
    public Email(String Firstname, String Lastname) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
      //  System.out.println("Email Created: " + this.Firstname + " " + this.Lastname);

        // call a method asking for the department-returns the department
        this.Department=setDepartment();
       // System.out.println("Department: "+this.Department);

        //call a method that returns a random password
        this.password=RandomPassword(defaultpasswordlength);
        System.out.println("Your Password is: "+this.password);

        //combine elements to generate  email
        email=Firstname.toLowerCase()+"."+Lastname.toLowerCase()+"@"+Department+"."+CompanySuffix;
       // System.out.println("Your email is: "+email);

    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("New Worker: "+Firstname+"\nDepartment Codes:\n1 for sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code:");
        Scanner input = new Scanner(System.in);
        int DepChoice = input.nextInt();
        switch (DepChoice) {
        case 1:
            return "sales";
        case 2:
            return "Dev";
        case 3:
            return "Acct";
        default:
            return "";

        }
    }
    

    // Generate a random password
    private String  RandomPassword(int length){
        String passwordset="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!£$%1234567890";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
           int random=(int) (Math.random()*passwordset.length());
           password[i]=passwordset.charAt(random);
        }
        return new String( password);

    }

    // set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.MailboxCapacity=capacity;

    }

    // set the alternate email
    public void setalternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }

    // change the password
    public void ChangePassword(String password){
        this.password=password;
    }
    public int getMailBoxCapacity(){
        return MailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    } 
    public String Showinfo(){
        return "Display Name: "+Firstname+" "+Lastname+
        "\nCompany Email : "+email+
        "\nMailbox Capacity: "+MailboxCapacity+"mb";
    }

}
