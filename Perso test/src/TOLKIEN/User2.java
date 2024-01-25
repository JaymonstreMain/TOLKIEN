package TOLKIEN;

public class User2 extends Group1 {
    public User2(String username, String password) {
        super(username, password);
    }

    public void afficherDetails() {
        super.afficherDetails();
    }

    public static void main(String[] args) {
        Group1 group1 = new Group1("Batman", "Robin");
        group1.afficherDetails();

//        User1 user2 = new User1("Batman", "Robin");
//        user2.afficherDetails();
    }
}
