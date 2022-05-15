package ss2i.vilageEmplois.demon.model;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.ConsoleTarget;
import ss2i.vilageEmplois.demon.utliEnum.Contrat;
import ss2i.vilageEmplois.demon.utliEnum.Grade;

public class Ensignant  extends Personnel{

    private Grade grade;

    public Ensignant(String nom, String prenom, int age, Contrat contrat, Grade grade ){
        super(nom,prenom,age,contrat);
        this.grade=grade;
    }

    public Grade getGrade(){
        return grade;
    }

    public void setGrade(Grade grade){
        this.grade=grade;
    }

    @Override
    public void Afficher(){
        System.out.println("-------------Personnel Enseignant-----------");
        System.out.println("--Nom-"+nom+"-----prenom----"+prenom+"-------Age-----"+age);
        System.out.println("-------------Grade---"+grade.toString());


    }

}
