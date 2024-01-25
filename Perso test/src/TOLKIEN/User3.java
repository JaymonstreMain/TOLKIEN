package TOLKIEN;

public class User3 extends Group1 {
    public User3(String username, String password) {
        super(username, password);
    }

    public void afficherDetails() {
        super.afficherDetails();
    }

    public static void main(String[] args) {
        Group1 group1 = new Group1("Donald", "Duck");
        group1.afficherDetails();

//        User3 user3 = new User1("Donald", "Duck");
//        user3.afficherDetails();
    }
}
