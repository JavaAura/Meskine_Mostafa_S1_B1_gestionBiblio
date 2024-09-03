package presentation;

import metier.Bibliotheque;
import metier.Livre;
import metier.Magazine;
import utilitaire.Validation;

import java.util.Scanner;
import java.util.UUID;

public class ConsoleUI {
    public ConsoleUI() {
        while (true) {
            this.mainMenu();
            Bibliotheque biblio = new Bibliotheque();
            Scanner input = new Scanner(System.in);
            int choix = input.nextInt();
            switch (choix) {
                case 1:
                    this.typeMenu("Ajouter");
                    int ajouterType = input.nextInt();
                    this.documentType(ajouterType, "ajouter");
                    break;
                case 2:
                    this.typeMenu("Emprunter");
                    int emprunterType = input.nextInt();
                    this.documentType(emprunterType, "emprunter");
                    break;
                case 3:
                    this.typeMenu("Retourner");
                    int retournerType = input.nextInt();
                    this.documentType(retournerType, "retourner");
                    break;
                case 4:
                    biblio.afficherTout();
                    break;
                case 5:
                    System.out.print("donner le titre du document a rechercher: ");
                    input.nextLine();
                    String titre = input.nextLine();
                    biblio.rechercher(titre);
                    break;
                case 6:
                    return;
            }
        }
    }

    public void mainMenu() {
        System.out.println("1.Ajouter un document");
        System.out.println("2.Emprunter un document");
        System.out.println("3.Retourner un document");
        System.out.println("4.Afficher tous les documents");
        System.out.println("5.Rechercher un document");
        System.out.println("6.Quitter");
        System.out.print("=> ");
    }

    public void typeMenu(String action) {
        System.out.println("1." + action + " un Livre");
        System.out.println("2." + action + " un Magazine");
        System.out.print("=> ");
    }

    public void addMenu(String type) {
        Scanner input = new Scanner(System.in);
        Bibliotheque biblio = new Bibliotheque();
        Validation check = new Validation();
        if (type.equals("livre")) {
            Livre livre = new Livre();

            System.out.print("1.titre du livre: ");
            String titre = input.nextLine();
            if (!check.isValidTitle(titre)){
                System.out.println("titre du livre invalid!");
                return;
            }
            livre.setTitre(titre);

            System.out.print("2.ISBN: ");
            int isbn = input.nextInt();
            livre.setISBN(isbn);
            input.nextLine();

            System.out.print("3.nom de l'auteur: ");
            String auteur = input.nextLine();
            if (!check.isValidName(auteur)){
                System.out.println("nom de l'auteur invalid!");
                return;
            }
            livre.setAuteur(auteur);

            System.out.print("4.date de publication: ");
            String date = input.nextLine();
            livre.setDatePublication(date);

            System.out.print("5.nombre de pages: ");
            int nombreDePages = input.nextInt();
            livre.setNombreDePages(nombreDePages);
            livre.setBorrowed(false);
            livre.setId(UUID.randomUUID());


            biblio.ajouter(livre);
        } else {
            Magazine magazine = new Magazine();

            System.out.print("1.titre du magazine: ");
            String titre = input.nextLine();
            if (!check.isValidTitle(titre)){
                System.out.println("nom du magazine invalid!");
                return;
            }
            magazine.setTitre(titre);

            System.out.print("2.numero du magazine: ");
            int numero = input.nextInt();
            magazine.setNumero(numero);
            input.nextLine();

            System.out.print("3.nom de l'auteur: ");
            String auteur = input.nextLine();
            if (!check.isValidName(auteur)){
                System.out.println("nom du magazine invalid!");
                return;
            }
            magazine.setAuteur(auteur);

            System.out.print("4.date de publication: ");
            String date = input.nextLine();
            magazine.setDatePublication(date);

            System.out.print("5.nombre de pages: ");
            int nombreDePages = input.nextInt();
            magazine.setNombreDePages(nombreDePages);
            magazine.setBorrowed(false);
            magazine.setId(UUID.randomUUID());

            biblio.ajouter(magazine);
        }
    }

    public void documentType(int docType, String operation) {
        Scanner input = new Scanner(System.in);
        Bibliotheque biblio = new Bibliotheque();
        if (operation.equals("ajouter")) {
            switch (docType) {
                case 1:
                    this.addMenu("livre");
                    break;
                case 2:
                    this.addMenu("magazine");
                    break;
            }
        } else if (operation.equals("emprunter")) {
            switch (docType) {
                case 1:
                    System.out.print("donner le titre du livre a emprunter: ");
                    String livreTitre = input.nextLine();
                    biblio.emprunter(livreTitre, "livre");
                    break;
                case 2:
                    System.out.print("donner le titre du magazine a emprunter: ");
                    String magTitre = input.nextLine();
                    biblio.emprunter(magTitre, "magazine");
                    break;
            }
        } else {
            switch (docType) {
                case 1:
                    System.out.print("donner le titre du livre a retourner: ");
                    String livreTitre = input.nextLine();
                    biblio.retourner(livreTitre, "livre");
                    break;
                case 2:
                    System.out.print("donner le titre du magazine a retourner: ");
                    String magTitre = input.nextLine();
                    biblio.retourner(magTitre, "magazine");
                    break;
            }
        }
    }

}
