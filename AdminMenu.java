import java.util.*;
import java.io.*;
public class AdminMenu{
	public void AdminMenu(){
		Console console = System.console();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Administrator");
		System.out.println("\n1. Add New User \n2. Display all user Details \n3. Add new train \n4. Display all trains \n5. Scheduled trains \n6. Display Schedule \n7. Logout\n");
		int choice = 0;
		choice = in.nextInt();
		
		switch(choice){
			case 1:
				{
					try{	
						BufferedWriter bw = new BufferedWriter(new FileWriter("UserDetails.txt", true));
		
							System.out.println("1. Add New User\n");
					
							System.out.print("Enter your name : ");
							bw.write(console.readLine()+",");
							System.out.print("Enter UserName : ");
							bw.write(in.next()+",");
							boolean ok = false;
		
							do{
			
								console.printf("Enter new password : ");
								char[] passwordChars1 = console.readPassword();
								String passwd1 = new String(passwordChars1);
			
								console.printf("Verity your password : ");
								char[] passwordChars2 = console.readPassword();
								String passwd2 = new String(passwordChars2);
			
								if(passwd1.equals(passwd2)){
									ok = true;
									bw.write(passwd1+",");
								}
								else
									System.out.println("Password not matched. Try again...");
								}while(!ok);
		
							System.out.print("Age : ");
							bw.write(in.nextInt()+",");
							System.out.println("Gender(M/F) : ");
							bw.write(in.next()+",");
							System.out.print("Address : ");
							bw.write(console.readLine());
							bw.newLine();
							bw.close();	
					}catch(IOException e){}
					break;
				}
			case 2:
				{
					System.out.println("Users");
				try{
						BufferedReader br = new BufferedReader(new FileReader("UserDetails.txt"));
						String line = null;
					while((line = br.readLine()) != null){
						StringTokenizer st = new StringTokenizer(line,",");

						while(st.hasMoreTokens()){
							System.out.print(st.nextToken()+"\t");
						}
						System.out.println();
					}
						br.close();
					}catch(IOException e){}
					break;
				}
		}
	}
}
