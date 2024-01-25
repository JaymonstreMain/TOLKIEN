package TOLKIEN;

public class User4 extends Group1 {
    public User4(String username, String password) {
        super(username, password);
    }

    public void afficherDetails() {
        super.afficherDetails();
    }

    public static void main(String[] args) {
        Group1 group1 = new Group1("Mario", "Lemieux");
        group1.afficherDetails();

//        User4 user4 = new User1("Mario", "Lemieux");
//        user4.afficherDetails();
    }
}
