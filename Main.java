import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Profile prof [] = new Profile[6];	
		Scanner in = new Scanner(System.in);
		File file = new File("AdminDetails.txt");
		Console console = System.console();
		
		try{

			if(file.exists()){
				prof[0]=new Profile();
				BufferedReader br = new BufferedReader(new FileReader("AdminDetails.txt"));
				
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line,",");

				if(st.hasMoreTokens()){
					prof[0].setName(st.nextToken());
					prof[0].setUserName(st.nextToken());
					prof[0].setPassword(st.nextToken());
				}
				else{
					AddAdmin add = new AddAdmin();
					add.AddAdmin();
				}
				br.close();
			}
			else{
				AddAdmin add = new AddAdmin();
				add.AddAdmin();
			}
		}catch(IOException e){}

		int choice = 0;
				
		do{
			System.out.println("\nRailway Reservation System\n");
			System.out.println("Menu");
			System.out.println("1. Adminstrator \n2. User\n3. Exit");
			System.out.println("\nEnter your choice : ");
			
			choice = in.nextInt();
			
			switch(choice){
				
				case 1:
				{	
					boolean authorized = true;
					do{
					System.out.print("User Name : ");
					String UName = in.next();
					System.out.print("Password : ");
					char[] passwordChars = console.readPassword();
					String passwd = new String(passwordChars);
					
					boolean cond1 = UName.equals(prof[0].getUserName());
					boolean cond2 = passwd.equals(prof[0].getPassword());

					authorized = cond1 && cond2;
					if(!authorized)
						System.out.println("\nThe username or password is incorrect, try again..!\n");
					else
						System.out.println("You've successfully logged in. ");
					}while(!authorized);
						AdminMenu AMenu = new AdminMenu();
						AMenu.AdminMenu();
					break;
				}
				case 2:
				{
					break;
				}
				case 3:
				{
					System.out.println("\nThanks for using this program...\n");
					break;
				}
				default :
					System.out.println("\nInvalid choice, try again....");
			}
		}while(choice!=3);
	}
}
