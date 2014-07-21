public class Profile {
	private String Name;
	private String UserName;
	private String Password;
	private int Age;
	private char Gender;
	private String Address;
	
	public void setName(String Name){
		this.Name = Name;
	}
	public String getName(){
		return this.Name;
	}
	
	public void setUserName(String UserName){
		this.UserName = UserName;
	}
	public String getUserName(){
		return this.UserName;
	}
	
	public void setPassword(String Password){
		this.Password = Password;
	}
	public String getPassword(){
		return this.Password;
	}
	
	public void setAge(int Age){
		this.Age = Age;
	}
	public int getAge(){
		return this.Age;
	}
	
	public void setGender(char Gender){
		this.Gender = Gender;
	}
	public char getGender(){
		return this.Gender;
	}
	
	public void setAddress(String Address){
		this.Address = Address;
	}
	public String getAddress(){
		return this.Address;
	}
}
