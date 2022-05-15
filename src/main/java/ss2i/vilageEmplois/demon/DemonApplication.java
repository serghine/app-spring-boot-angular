package ss2i.vilageEmplois.demon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ss2i.vilageEmplois.demon.model.Administratif;
import ss2i.vilageEmplois.demon.model.ContratExt;
import ss2i.vilageEmplois.demon.model.Ensignant;
import ss2i.vilageEmplois.demon.model.Personne;
import ss2i.vilageEmplois.demon.services.ServiceRH;
import ss2i.vilageEmplois.demon.utliEnum.Contrat;
import ss2i.vilageEmplois.demon.utliEnum.Grade;
import ss2i.vilageEmplois.demon.utliEnum.Post;
import ss2i.vilageEmplois.demon.utliEnum.TypeContrat;

import java.util.Scanner;

@SpringBootApplication
public class DemonApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //creation service RH du vilage
		ServiceRH serviceRH=new ServiceRH("Vilage Emp");
        //creation de personne
        Ensignant enseignant=new Ensignant("SMITH","William",55,
                                                           Contrat.CDD, Grade.ASD);
        Ensignant enseignant1=new Ensignant("BROUKS","Harry",70,
                Contrat.CDI, Grade.MAA);
        Ensignant enseignan2=new Ensignant("TOTO","Rinna",33,
                Contrat.CDI, Grade.MBA);
        Administratif administratif1=new Administratif("HUGO","Boss",33,
                                                               Contrat.CDD, Post.LOGISTIQUE);
        Administratif administratif2=new Administratif("POISSE","Pascale",22,
                Contrat.CDI, Post.MAINTENANCE);
        Administratif administratif3=new Administratif("HUGO","Boss",33,
                Contrat.CDD, Post.SECURITY);
        ContratExt contratExt1=new ContratExt("Alma","Toto",25, TypeContrat.CHEF);
        ContratExt contratExt2=new ContratExt("MAMADOU","Elise",22, TypeContrat.SALARIER);
        ContratExt contratExt3=new ContratExt("MAMA","Tata",44, TypeContrat.SALARIER);

        //ajouter les personnes au service concerner
        serviceRH.AjoutterPersonne(enseignant);
        serviceRH.AjoutterPersonne(enseignant1);
        serviceRH.AjoutterPersonne(enseignan2);
        serviceRH.AjoutterPersonne(administratif1);
        serviceRH.AjoutterPersonne(administratif2);
        serviceRH.AjoutterPersonne(administratif3);
        serviceRH.AjoutterPersonne(contratExt1);
        serviceRH.AjoutterPersonne(contratExt2);
        serviceRH.AjoutterPersonne(contratExt3);

        serviceRH.AfficherPersonnes();
        System.out.println("Donner le nom de la personne a touver");
        String nomTemp=sc.nextLine();
        System.out.println("Donner le pernom de la personne a touver");
        String prenomTemp=sc.nextLine();
        Personne personne=serviceRH.afficherTypePersonneParSonNom(nomTemp,prenomTemp);
        System.out.println("-----------------------------------------");
        //supprimer une personne
        if(personne!=null){
            serviceRH.supprimerUnePersonne(personne);
        }
        serviceRH.AfficherPersonnes();
        sc.close();
        System.out.println("-------------------------------------------");
        SpringApplication.run(DemonApplication.class, args);
    }

}
