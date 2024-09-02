package metier;

import java.util.ArrayList;

public class Livre extends Document {
    private int ISBN;

    public void emprunter(String titre){

    }
    public void retourner(){

    }
    public void afficherDetails(){

    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }


    @Override
    public String toString() {
        return "Livre{" +
                "ISBN=" + ISBN +
                "} " + super.toString();
    }
}
