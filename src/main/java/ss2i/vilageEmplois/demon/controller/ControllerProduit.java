package ss2i.vilageEmplois.demon.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ss2i.vilageEmplois.demon.model.Produit;

import java.util.List;

@RestController
public class ControllerProduit {


    private  List<Produit> produits;


    @GetMapping()
    public List<Produit> afficherProduits(){



    return produits;
}



}
