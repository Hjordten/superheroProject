import java.util.Scanner;
public class Superhero {
    private String superheroName;
    private String superheroHeight;
    private String superheroPower;
    private String superheroWeakness;
    private boolean superheroHumanOrNot;


    //Konstruktør
    public Superhero(String superheroName, String superheroHeight, String superheroPower, String superheroWeakness, boolean superheroHumanOrNot) {
        this.superheroName = superheroName;
        this.superheroHeight = superheroHeight;
        this.superheroPower = superheroPower;
        this.superheroWeakness = superheroWeakness;
        this.superheroHumanOrNot = superheroHumanOrNot;
    }

    public String toString() {
        return "\nSuperhero name: " + superheroName +
                "\nSuperhro height: " + superheroHeight +
                "\nSuperhero power(s): " + superheroPower +
                "\nSuperhero weakness(s): " + superheroWeakness +
                "\nSuperhero origin from planet earth: " + superheroHumanOrNot;

    }



    //get methods

    public String getSuperheroName() {
        return superheroName;
    }

    public String  getSuperheroHeight() {
        return superheroHeight;
    }

    public String getSuperheroPower() {
        return superheroPower;
    }

    public String getSuperheroWeakness() {
        return superheroWeakness;
    }

    public Boolean getSuperheroHumanOrNot() {
        return superheroHumanOrNot;
    }


    //set methods
    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setSuperheroHeight(String superheroHeight) {
        this.superheroHeight = superheroHeight;
    }

    public void setSuperheroPower(String superheroPower) {
        this.superheroPower = superheroPower;
    }

    public void setSuperheroWeakness(String superheroWeakness) {
        this.superheroWeakness = superheroWeakness;
    }

    Boolean setSuperheroHumanOrNot(Boolean superheroHumanOrNot) {
        this.superheroHumanOrNot = superheroHumanOrNot;
        return superheroHumanOrNot;
    }

}


