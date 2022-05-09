package ss2i.vilageEmplois.demon.services;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ss2i.vilageEmplois.demon.model.Categorie;
import ss2i.vilageEmplois.demon.model.Produit;

import java.util.ArrayList;
import java.util.List;



@Service
@RequiredArgsConstructor
@EnableCaching
public class ServiceProduit {


    private final ServiceCategorie serviceCategorie;
     List<Categorie> categories = new ArrayList<>();
     List<Produit> produits = new ArrayList<>();

      //  System.out.print("rrrrrrr=====>"+produits);




    public List<Produit> returnProduitAfficher(){
        categories = serviceCategorie.returnListCategorie();
        System.out.println("============================>"+categories);
        Produit produit1 = new Produit(1,"Orange",12,"Orange du maroc",categories.get(0));
        Produit produit2 = new Produit(2,"Banane",34,"Banane fraiche tout droit des Iles mourisse",categories.get(0));
        Produit produit3 = new Produit(3,"Fraise",23,"Produit en france et mis en saque durant la ceuillette",categories.get(0));
        Produit produit4 = new Produit(4,"Pain au Chocolat",14,"Boulangerie du Centre a bretigy sur orge",categories.get(4));
        Produit produit5 = new Produit(5,"Tomate",13,"Produit francais et espagnole",categories.get(2));
        Produit produit6 = new Produit(6,"Pomme de terre",45.34,"Pomme de terre  du maroc",categories.get(2));
        Produit produit7 = new Produit(7,"Croisson",22.3,"Boulangerie du Centre a Bretigny sur orge",categories.get(4));
        Produit produit8 = new Produit(8,"Poulet fermier",5.34,"Boucherie du centre Halal",categories.get(1));
        Produit produit9 = new Produit(9,"Faux filet",6.34,"Boucherie du centre Halal",categories.get(1));
        Produit produit10 = new Produit(10,"Gaufrette",3.34,"Produit francais",categories.get(3));
        Produit produit11 = new Produit(11,"Yaourt",1.24,"Produit francais",categories.get(3));

        produits.add(produit1);
        produits.add(produit2);
        produits.add(produit3);
        produits.add(produit4);
        produits.add(produit5);
        produits.add(produit6);
        produits.add(produit7);
        produits.add(produit8);
        produits.add(produit9);
        produits.add(produit10);
        produits.add(produit11);
        return produits;
    }


}
