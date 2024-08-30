package metier;

abstract class Document {
    protected int id;
    protected String titre;
    protected String auteur;
    protected String datePublication;
    protected int nombreDePages;

    abstract void ajouter();
    abstract void emprunter();
    abstract void retourner();
    abstract void afficherDetails();

}
