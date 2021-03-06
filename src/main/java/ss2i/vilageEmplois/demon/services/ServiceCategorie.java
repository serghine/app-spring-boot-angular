package ss2i.vilageEmplois.demon.services;


import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ss2i.vilageEmplois.demon.model.Categorie;
import ss2i.vilageEmplois.demon.model.Produit;

import java.util.ArrayList;
import java.util.List;



@Service
@EnableCaching
public class ServiceCategorie {

     List<Categorie> categories = new ArrayList<>();

    /**
     * # a remplacer par les paramettre quand ca sera plus dynamique
     */


    public List<Categorie> returnListCategorie() {
        categories = new ArrayList<>();
        Categorie categorie1 = new Categorie(1, "Fruit");
        Categorie categorie2 = new Categorie(2, "Viande");
        Categorie categorie3 = new Categorie(3, "Legume");
        Categorie categorie4 = new Categorie(4, "Epicerie");
        Categorie categorie5 = new Categorie(5, "Boulangerie");
        categories.add(categorie1);
        categories.add(categorie2);
        categories.add(categorie3);
        categories.add(categorie4);
        categories.add(categorie5);
        return categories;
    }

}
