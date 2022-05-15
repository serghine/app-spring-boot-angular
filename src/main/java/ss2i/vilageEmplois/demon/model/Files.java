package ss2i.vilageEmplois.demon.model;

import org.springframework.beans.factory.annotation.Autowired;
import ss2i.vilageEmplois.demon.exception.Happyxception;

public class Files extends Mere {

    private String categorie;

    public Files(String nom, String prenom, String age, String categorie) {

        super(nom, prenom, age);
        this.categorie = categorie;
    }

    @Override
    public void afficherString() throws Happyxception {

        System.out.println("waouuuu !!");
    }

    public String lookString(){
        return "hello +++";
    }

    public String returnString(){
        return  this.categorie;
    }

}
