package TOLKIEN;

public class Group1{
    private String  username;
    private String  password;

    public Group1(String usernameG,String passwordG){
        this.username = usernameG;
        this.password = passwordG;
    }
    public void afficherDetails(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
    public static void main(String[] args) {

    }
}
