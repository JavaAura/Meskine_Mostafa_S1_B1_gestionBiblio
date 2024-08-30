package presentation;

import java.util.Scanner;

public class ConsoleUI {
    public ConsoleUI(){
        while (true){
            this.mainMenu();
            Scanner input = new Scanner(System.in);
            int choix = input.nextInt();
            switch (choix){
                case 1: this.typeMenu();
                    int choixType = input.nextInt();
                    this.documentType(choixType);
                    break;
                case 2: this.typeMenu();
                    break;
                case 3: this.typeMenu();
                    break;
                case 4:
                    System.out.println("toute est affiche!");
                    break;
                case 5:
                    System.out.println("search");
                    break;
                case 6: return;
            }
        }
    }

    public void mainMenu(){
        System.out.println("1.Ajouter un document");
        System.out.println("2.Emprunter un document");
        System.out.println("3.Retourner un document");
        System.out.println("4.Afficher tous les documents");
        System.out.println("5.Rechercher un document");
        System.out.println("6.Quitter");
        System.out.print("=> ");
    }

    public void typeMenu(){
        System.out.println("1.Ajouter un Livre");
        System.out.println("2.Ajouter un Magazine");
        System.out.print("=> ");
    }

    public void documentType(int a){

    }

}
