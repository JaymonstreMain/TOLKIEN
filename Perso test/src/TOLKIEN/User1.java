package TOLKIEN;

public class User1 extends Group1 {
    public User1(String username, String password) {
        super(username, password);
    }

    public void afficherDetails() {
        super.afficherDetails();
    }

    public static void main(String[] args) {
        Group1 group1 = new Group1("Mickey", "Mouse");
        group1.afficherDetails();

//        User1 user1 = new User1("Mickey", "Mouse");
//        user1.afficherDetails();
    }
}
