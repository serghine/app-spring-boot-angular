package ss2i.vilageEmplois.demon.model;

import ss2i.vilageEmplois.demon.utliEnum.Contrat;
import ss2i.vilageEmplois.demon.utliEnum.Post;

public class Administratif extends Personnel{

    private Post post;

    public Administratif(String nom, String prenom, int age, Contrat contrat, Post post){
        super(nom,prenom,age,contrat);
        this.post=post;
    }

@Override
public void Afficher(){
    System.out.println("-----------Personnel Administratif----------");
    System.out.println("------Nom"+nom+"---prenom-"+prenom+"---age--"+age);
    System.out.println("-----------Personnel Post:----------"+post);
}


}
