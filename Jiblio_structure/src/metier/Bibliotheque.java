package metier;

import java.util.ArrayList;

public class Bibliotheque {
    private static ArrayList<Livre> livres = new ArrayList<Livre>();
    private static ArrayList<Magazine> magazines = new ArrayList<Magazine>();

    public void ajouter(Livre livre) {
        livres.add(livre);
        System.out.println("livre ajoutee!");
    }

    public void ajouter(Magazine magazine) {
        magazines.add(magazine);
        System.out.println("magazine ajoutee!");
    }

    public void emprunter(String titre, String type) {
        if (type.equals("livre")) {
            if (!livres.isEmpty()) {
                for (int i = 0; i < livres.size(); i++) {
                    if ((livres.get(i)).getTitre().equals(titre)) {
                        if ((livres.get(i)).isBorrowed()) {
                            System.out.println("this book is already borrowed!");
                        } else {
                            (livres.get(i)).setBorrowed(true);
                            System.out.println("book borrowed successfully!");
                        }
                        break;
                    }
                    if (i == (livres.size() - 1)) {
                        System.out.println("no book found by this title!");
                    }
                }
            } else {
                System.out.println("add some books first!");
            }
        } else {
            if (!magazines.isEmpty()) {
                for (int i = 0; i < magazines.size(); i++) {
                    if ((magazines.get(i)).getTitre().equals(titre)) {
                        if ((magazines.get(i)).isBorrowed()) {
                            System.out.println("this magazine is already borrowed!");
                        } else {
                            (magazines.get(i)).setBorrowed(true);
                            System.out.println("magazine borrowed successfully!");
                        }
                        break;
                    }
                    if (i == (magazines.size() - 1)) {
                        System.out.println("no magazine found by this title!");
                    }
                }
            } else {
                System.out.println("add some magazines first!");
            }
        }
    }

    public void afficherTout() {
        for (int i = 0; i < livres.size(); i++) {
            System.out.println(livres.get(i));
        }
        for (int i = 0; i < magazines.size(); i++) {
            System.out.println(magazines.get(i));
        }
    }

    public void rechercher() {

    }
}
