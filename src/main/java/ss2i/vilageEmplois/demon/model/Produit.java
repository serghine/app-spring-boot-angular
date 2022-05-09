package ss2i.vilageEmplois.demon.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Produit {

    private int id;
    private String name;
    private float prix;
    private String description;
    private Categorie categorie;
}
