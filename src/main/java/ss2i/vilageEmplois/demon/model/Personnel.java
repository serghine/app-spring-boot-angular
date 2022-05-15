package ss2i.vilageEmplois.demon.model;

import ss2i.vilageEmplois.demon.utliEnum.Contrat;

abstract class Personnel extends Personne{

    protected Contrat contrat;
   protected Personnel(String nom,String prenom,int age, Contrat contrat){
       super(nom,prenom,age);
       this.contrat=contrat;
   }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public abstract void Afficher();
}
