public class Signup{
    private String Username;
    private String Password;
    //Constructors
  public Signup(String Username,String Password) {
    this.Username = Username ;
    this.Password = Password ;
  }
  //Getters
  public String getUsername(){
    return Username ;
  }
  public String getPassword(){
    return Password ;
  }
  public static void main(String[] args) {
    Signup signup  = new Signup("Mahesh12","@Mahesh");
    System.out.println("Remember this Credentials: Username = " + signup.getUsername() + ", Password = " + signup.getPassword());
}

 }
