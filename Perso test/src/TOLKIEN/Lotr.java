package TOLKIEN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lotr {
    private String[] username = {"Mickey", "Batman", "Donald", "Mario", "Wayne"};
    private String[] password = {"Mouse", "Robin", "Duck", "Lemieux", "Gretzky"};
    private String[] nom = {"Sauron", "Gandalf", "Gollum", "Bilbo", "Smaug"};
    private String[] question = {" Méchant puissant de le Seigneur des Anneaux, obsédé par l'Anneau unique.",
            "Puissant sorcier bienveillant dans Le Seigneur des Anneaux, guide et protecteur de la Terre du Milieu.",
            "Personnage tourmenté de Le Seigneur des Anneaux, obsédé par l'Anneau, autrefois appelé Sméagol.",
            "Hobbit aventurier dans Le Seigneur des Anneaux, découvreur de l'Anneau et oncle de Frodo.",
            "Dragon redoutable dans Le Hobbit de J.R.R. Tolkien, gardien du trésor d'Erebor."};
    private int compteur = 0;
    private int score = 0;
    private int indice = 0;

    private int nombreTry = 0;

    private Map<String, Integer> nombreDentrees = new HashMap<>();
    private Scanner scanner;

    public Lotr() {
        System.out.println("CONNEXION");
        gestionVerificationCompte();
        int nbPersonne = 0;
        this.scanner = new Scanner(System.in);
        //for (int i = 0; nbPersonne < 50; nbPersonne++) {
        affichageInteraction();
        this.scanner.close();
        //  }
    }

    public void gestionVerificationCompte() {
        this.scanner = new Scanner(System.in);
        //this.scanner = new Scanner(System.in);
        verificationCompte();
    }

    public void verificationCompte() {
        System.out.println("username:");
        String repUse = scanner.nextLine();
        /*if(rechercheUsername(repUse) == true){
           //System.out.println("ok");
        }*/
        interactionCompte(repUse, rechercheUsername(repUse));
        verificationPassword();
    }

    private boolean rechercheUsername(String reponse) {
        int compt = 0;
        boolean ok = false;
        for (int i = 0; i < this.username.length; i++) {
            if (this.username[i].equalsIgnoreCase(reponse)) {
                compt++;
                this.indice = i;
                ok = true;
            } else {
                compt = -1;
            }
        }
        return ok;
    }

    private String interactionCompte(String reponse, boolean boo) {
//        int nombreTry = 0;
        if ((boo) == true) {
           // System.out.println("Good!\n");


        } else {
            System.out.println("\nNom d'utilisateur innexistant!");
//                nombreTry++;
//                if (nombreTry >= 3){
//                    throw new IllegalArgumentException("Woups vous avez ess");
//                }
            gestionVerificationCompte();
        }
        //System.out.println(indice);
        //System.out.println(username[indice]);
        return reponse;
    }

    private void verificationPassword() {
        System.out.println("Password:");
        String passUse = scanner.nextLine();
        if (this.password[this.indice].

                equalsIgnoreCase(passUse)) {
            System.out.println("ok");
            affichageInteraction();
        } else {
            try {
                if (nombreTry < 2) {
                    nombreTry++;
                    verificationPassword();
                } else {
                    throw new IllegalArgumentException("Vous avez essayer trop de fois!!!");
                }
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e);
            }


//                    throw new IllegalArgumentException("Woups vous avez ess");
//                }
        }
    }


    private void affichageInteraction() {
        int compteurPersonne = 0;
        System.out.println("________________________________________________________");
        System.out.println("BIENVENUE AU QUIZ LOTR!!!");
        System.out.println("........................................................");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Question #" + (i));
            System.out.println(this.question[i - 1]);
            this.indice++;
            String reponseUse = scanner.nextLine();  // Utiliser nomUtilisateur ici
            interaction(reponseUse, i - 1);
            verificationSiPlusUneFois(reponseUse);
            compte();
        }
        System.out.println("\"Voulez-vous réessayer ?");
        nouvelleChance();
    }

    private int interaction(String reponse, int indice) {
        int compteur = 0;
        int old = 0;
        //try {
        if (reponse.equalsIgnoreCase(this.nom[indice])) {
            System.out.println("Good!\n");
            //this.score++;
            /*} else {
                // Message d'erreur plus création d'objet illégal...
                throw new IllegalArgumentException("Mauvaise réponse!");
            }*/

            //nombreDentrees.put(reponse, nombreDentrees.getOrDefault(reponse, 0) + 1);

        /*} catch (IllegalArgumentException patate) {
            throw patate;*/
        } else {
            System.out.println("Oups!\n");
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
        //System.out.println(this.compteur);

        if (this.compteur > 4) {
            if (this.score > 4) {
                System.out.println("\nINCROYABLE!!!");
            } else if (this.score > 3) {
                System.out.println("\nEXCELLENT!!");
            } else if (this.score > 2) {
                System.out.println("\nBIEN!");
            } else if (this.score > 1) {
                System.out.println("\nOUIN:(");
            } else if (this.score > 2) {
                System.out.println("\nARKKK");
            }
            System.out.println(this.score + "/" + this.indice);
        }
    }

    private void nouvelleChance() {
        String reponse = scanner.nextLine();
        if (reponse.equalsIgnoreCase("Oui")) {
            new Lotr();
        }
        if (reponse.equalsIgnoreCase("Non")) {
            System.out.println("\nMerci d'avoir participé!\n");
            this.scanner.close();
        } else {
            System.out.println("Il y a eu une erreur de frappe! Veuillez réessayer!");
            nouvelleChance();
        }
    }

    public static void main(String[] args) {
        new Lotr();
    }
}
