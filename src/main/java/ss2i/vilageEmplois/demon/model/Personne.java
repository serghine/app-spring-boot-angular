package ss2i.vilageEmplois.demon.model;

public abstract class Personne {

    public String nom;
    public String prenom;
    protected int age;

    protected Personne(String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }


    protected String getNom() {
        return nom;
    }

    protected String getPrenom() {
        return prenom;
    }

    protected int getAge() {
        return age;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public abstract void Afficher();
}
