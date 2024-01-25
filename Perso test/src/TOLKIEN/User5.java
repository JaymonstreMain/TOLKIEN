package TOLKIEN;

public class User5 extends Group1 {
    public User5(String username, String password) {
        super(username, password);
    }

    public void afficherDetails() {
        super.afficherDetails();
    }

    public static void main(String[] args) {
        Group1 group1 = new Group1("Wayne", "Gretzky");
        group1.afficherDetails();

//        User5 user5 = new User1("Wayne", "Gretzky");
//        user5.afficherDetails();
    }
}
