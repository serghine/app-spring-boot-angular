package ss2i.vilageEmplois.demon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import ss2i.vilageEmplois.demon.exception.Happyxception;

@Data
@AllArgsConstructor
abstract class Mere {
    private String nom="cheval";
    private String prenom;
    private String age;

    abstract void afficherString() throws Happyxception;

    public String lookString(){
        return "hello";
    }

}
