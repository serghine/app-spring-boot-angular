package ss2i.vilageEmplois.demon.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ss2i.vilageEmplois.demon.exception.Happyxception;
import ss2i.vilageEmplois.demon.model.Files;
import ss2i.vilageEmplois.demon.model.PetiteFille;

@RestController
public class Contr {

    @GetMapping("/hh")
    public String ggg(){

        Files f = new Files("nom","prenom","33","categorie");
        f.returnString();
        try {
            f.afficherString();
        }catch (Happyxception e){
            System.out.println(e.getMessage());
        }
           System.out.println(f.lookString());
        System.out.println(f);
        System.out.println(f.returnString());
        PetiteFille pF=new PetiteFille("nomPF","prenomPF","44","CatPF","vert");
        System.out.println(pF instanceof Object);

        return "hhhhh";
    }


}
