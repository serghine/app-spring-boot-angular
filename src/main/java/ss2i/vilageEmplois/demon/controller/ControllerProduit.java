package ss2i.vilageEmplois.demon.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ss2i.vilageEmplois.demon.model.Categorie;
import ss2i.vilageEmplois.demon.model.Produit;
import ss2i.vilageEmplois.demon.services.ServiceCategorie;
import ss2i.vilageEmplois.demon.services.ServiceProduit;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200")
public class ControllerProduit {


private final ServiceProduit serviceProduit;

private final ServiceCategorie serviceCategorie;

private List<Produit> produits=new ArrayList<>();
private List<Categorie> categories=new ArrayList<>();

    @GetMapping("/vilageEmplois/afficherProduits")
    public List<Produit> afficherProduits() {
        produits = serviceProduit.returnProduitAfficher();
        return produits;
    }


}
