package ss2i.vilageEmplois.demon.model;

public class PetiteFille extends Files {

    private String color;

    public PetiteFille(String nom, String prenom, String age, String categorie, String color) {
        super(nom, prenom, age, categorie);
        this.color = color;
    }

}
