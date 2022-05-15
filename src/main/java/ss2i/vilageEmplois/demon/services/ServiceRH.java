package ss2i.vilageEmplois.demon.services;

import lombok.Data;
import ss2i.vilageEmplois.demon.model.Administratif;
import ss2i.vilageEmplois.demon.model.ContratExt;
import ss2i.vilageEmplois.demon.model.Ensignant;
import ss2i.vilageEmplois.demon.model.Personne;

import java.util.ArrayList;


@Data
public class ServiceRH {

    private String nomUniv;
    private ArrayList<Personne> listPersonnes;

    public ServiceRH(String nomUniv) {
        this.nomUniv = nomUniv;
        this.listPersonnes = new ArrayList<>();
    }

    public void AjoutterPersonne(Personne p) {
        listPersonnes.add(p);
    }

    public int nbrPersonnes() {
        return listPersonnes.size();
    }

    public void AfficherPersonnes() {
        System.out.println("--------------- La liste des personnes gerer par se service -----------------");
        for (Personne p : listPersonnes) {
            p.Afficher();
            System.out.println("----------------------End-----------------------");
        }
    }

    public String typePersonne(Personne p) {
        String message = "";
        if (p instanceof ContratExt) {
            System.out.println("-------c'ette personne a un contrat exterieur----- !!");

        }
        if (p instanceof Ensignant) {
            System.out.println("-------c'ette personne a un  contrat Enseignant----- !!");

        }
        if (p instanceof Administratif) {
            System.out.println("-------c'ette personne a un contrat Administratif----- !!");

        }


        return message;
    }

    //afficher le type d'une personne par son nom
    public Personne afficherTypePersonneParSonNom(String nom, String prenom) {
        boolean trouve = false;
        for (Personne p : listPersonnes) {
            if (p.nom.equals(nom) && p.prenom.equals(prenom)) {
                typePersonne(p);
                trouve = true;
                return p;
            }
        }
        if (trouve == false) {
            System.out.println("--------- personne non trouver !!! ------");
        }
        return null;
    }

    //supprimer une personne
    public void supprimerUnePersonne(Personne personneASuspprimer){
        int i =0;
        boolean trouver=false;
        if(this.nbrPersonnes()>0){
            while (i<this.nbrPersonnes()){
                if(listPersonnes.get(i).equals(personneASuspprimer)){
                    System.out.println("------- personne trouvé -----"+listPersonnes.get(i).toString());
                    listPersonnes.remove(i);
                    System.out.println("------- personne supprimer avec success -----");
                    trouver=true;
                    break;
                }
                i+=1;
            }
            if(trouver=false){
                System.out.println("-----personne nom trouver !! ---");
            }else {
            System.err.println("-----------la liste des personnes est vide-----------");
            }
            }
        }
    }



