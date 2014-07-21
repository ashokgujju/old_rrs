import java.io.*;
import java.util.Scanner;
public class AddAdmin{
	public void AddAdmin(){
	        Console console = System.console();
	        Scanner in = new Scanner(System.in);
		try{	
			BufferedWriter bw = new BufferedWriter(new FileWriter("AdminDetails.txt"));
				
				System.out.println("You're using this program for the firt time.\n Please SignUp as Administrator.");
				
				System.out.println("Enter your name : ");
				bw.write(in.nextLine()+",");
				System.out.println("Enter UserName : ");
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
				
				System.out.println("Age : ");
				bw.write(in.nextInt()+",");
				System.out.println("Gender(M/F) : ");
				bw.write(getChar()+",");
				System.out.println("Address : ");
				bw.write(console.readLine());
				bw.close();	
		}catch(IOException e){}
	}
	
  static public char getChar() throws IOException{
	  char ch = (char) System.in.read();
	  input(); 
	  return ch;
  }
  static public void input() throws IOException{

	  while ( (char) System.in.read() != '\n' ); 
  }
}
