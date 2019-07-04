import java.math.*;
import java.util.*;

public class GeneratorClass {

	static Scanner sc= new Scanner(System.in);
	private static int counter=100;
	static int option;
	private static String acc_type;
	public static void main(String[] args) {
		System.out.println("Welcome!");
		final int userid= (int) Math.round((counter+Math.random())*100);
		System.out.println("User id is: "+userid);
		Address address = new Address("aditi","904","ruturang","411009");
		BaseClass user= new BaseClass(userid);
		user.checkAccountType(acc_type);
		
		int opt=1;
		do {
			System.out.println("Menu \n 1. Add money \n 2. Withdraw money \n 3. Check balance \n 4. Add address \n 5. Display address");
			System.out.println("Your option: ");
			option= sc.nextInt();
			switch(option) {
				case 1:
					System.out.println("Enter amount to be added: ");
					int amt= sc.nextInt();
					user.addMoney(amt);
					break;
				case 2:
					System.out.println("Enter amount to be removed: ");
					int amt1= sc.nextInt();
					user.removeMoney(amt1);
					break;
				case 3:
					user.checkBalance();
					break;
				case 4:
					String name;
					String hno;
					String society;
					String pincode;
					System.out.println("Enter name: ");
					name= sc.next();
					address.setName(name);
					System.out.println("Enter housing no: ");
					hno= sc.next();
					address.setHno(hno);
					System.out.println("Enter society: ");
					society= sc.next();
					address.setSociety(society);
					System.out.println("Enter pincode: ");
					pincode= sc.next();
					address.setPincode(pincode);
					break;
				case 5:
					System.out.println("The address is: ");
					address.displayAddress();
					break;
			}
			System.out.println("Do you want to continue?(1-yes,0-no)");
			opt= sc.nextInt();
		} while (opt==1);
	}
}
