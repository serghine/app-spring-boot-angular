package ss2i.vilageEmplois.demon.model;


import ss2i.vilageEmplois.demon.utliEnum.TypeContrat;

public class ContratExt extends Personne {

    protected TypeContrat typeContract;

    public ContratExt(String nom, String prenom, int age, TypeContrat typeContract) {
        super(nom, prenom, age);
        this.typeContract = typeContract;
    }

    @Override
    public void Afficher(){
       System.out.println("----------- Contrat exterieur !! --------------");
        System.out.println("***Nom***"+nom+"***Prenom***"+prenom+"****Age***"+age);
        System.out.println("--------------Type de Contrat -----------------");
        System.out.println("Type de contrat"+typeContract.toString());
    }
}
