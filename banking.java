import java.util.Scanner;
class Bank{
    public static void balance(){
        System.out.println("You have to work hard bro your balance is not good enough");
    }
}
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Please note that Your password is a string");
	    Scanner obj= new Scanner(System.in);
	    System.out.print("Please type your password user:");
	    String password=obj.nextLine();
	    System.out.println("Thank you for typing your password");
	    Bank money=new Bank();
	    if (password.equals("praveen")){
	        System.out.println("Hello Mr.Praveen");
	        money.balance();
	    }
	    else if(password!="praveen")
	    System.out.println("You have typed an incorrect password");
	    
		
	}
}
