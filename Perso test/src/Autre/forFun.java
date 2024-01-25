package Autre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class forFun {
    private String[] nom = {"Just", "Ana", "Jay", "Anne", "Alain"};
    private int[] age = {18, 19, 20, 50, 52};
    private int compteur = 0;

    private Map<String, Integer> nombreDentrees = new HashMap<>();
    private Scanner scanner;

    public forFun() {
        int nbPersonne = 0;
        this.scanner = new Scanner(System.in);
        for (int i = 0; nbPersonne < 50; nbPersonne++) {
            affichageInteraction();
            this.scanner.close();
        }
    }

    private void affichageInteraction() {
        int compteurPersonne = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Quel est votre nom?");
            String nomUtilisateur = scanner.nextLine();  // Utiliser nomUtilisateur ici
            System.out.println(interaction(nomUtilisateur));
            verificationSiPlusUneFois(nomUtilisateur);
            compte();
        }
    }

    private int interaction(String nomUtilisateur) {
        int compteur = 0;
        int old = 0;
        try {
            if (nomUtilisateur.equalsIgnoreCase(this.nom[0]) || nomUtilisateur.equalsIgnoreCase("Justin")) {
                old = this.age[0];

            } else if (nomUtilisateur.equalsIgnoreCase((this.nom[1])) || nomUtilisateur.equalsIgnoreCase("Anais")) {
                old = this.age[1];

            } else if (nomUtilisateur.equalsIgnoreCase((this.nom[2])) || nomUtilisateur.equalsIgnoreCase("Jérémy")) {
                old = this.age[2];

            } else if (nomUtilisateur.equalsIgnoreCase((this.nom[3])) || nomUtilisateur.equalsIgnoreCase("Anne-Marie")) {
                old = this.age[3];

            } else if (nomUtilisateur.equalsIgnoreCase((this.nom[4]))) {
                old = this.age[4];

            } else {
                // Message d'erreur plus création d'objet illégal...
                throw new IllegalArgumentException("Nom d'utilisateur non valide");
            }

            nombreDentrees.put(nomUtilisateur, nombreDentrees.getOrDefault(nomUtilisateur, 0) + 1);

        } catch (IllegalArgumentException patate) {
            throw patate;
        }
        return old;
    }

    private void verificationSiPlusUneFois(String nom) {
        int nbErreur = 0;

        try {
            if (nombreDentrees.getOrDefault(nom, 0) > 1) {
                nbErreur++;
                throw new IllegalArgumentException("Erreur: " + nom + " déjà saisi plus d'une fois");
            }
        } catch (IllegalArgumentException banane) {
            throw new RuntimeException(banane);
        }
    }

    private void compte() {
        this.compteur++;
        System.out.println(this.compteur);

        if (this.compteur > 4) {
            System.out.println("FÉLICITATION!!!");
            this.scanner.close();
        }
    }

    public static void main(String[] args) {
        new forFun();
    }
}
