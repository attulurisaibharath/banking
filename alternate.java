import java.util.Scanner;
class Bank{
    public static void balance(){
        System.out.println("You have to work hard bro your balance is not good enough");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to boda bank");
	    System.out.println("Please note that Your password is a single digit integer");
	    Scanner obj= new Scanner(System.in);
	    System.out.print("Please type your password user:");
	    byte password=obj.nextByte();
	    System.out.println("Thank you for typing your password");
	    Bank money=new Bank();
	    if (password==10){
	        System.out.println("Hello Mr.Praveen");
	        money.balance();
	    }
	    else if(password>10 || password<10)
	    System.out.println("You have typed an incorrect password");
	    
		
	}
}
