
public class Superhero {
    private String superheroName;
    private double superheroHeight;
    private String superheroPower;
    private String superheroWeakness;
    private boolean superheroHumanOrNot;

    //Konstruktør
    public Superhero(String superheroName, double superheroHeight, String superheroPower, String superheroWeakness, boolean superheroHumanOrNot) {
        this.superheroName = superheroName;
        this.superheroHeight = superheroHeight;
        this.superheroPower = superheroPower;
        this.superheroWeakness = superheroWeakness;
        this.superheroHumanOrNot = superheroHumanOrNot;
    }



    //get methods

    public String getSuperheroName() {
        return superheroName;
    }

    public double getSuperheroHeight() {
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

    public void setSuperheroHeight(double superheroHeight) {
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



/*
    public class createHero {
        String heroName = getsuperheroName();
        double heroHeight = getSuperheroHeight();
        String heroPower = getSuperheroPower();
        String heroWeakness = getSuperheroWeakness();
        boolean heroHumanOrNot = getSuperheroHumanOrNot();

    }
*/
    /*
    public static class classCreateHero {
        private String superheroName;
        public String SuperheroName = superheroName;

        public void createHero() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Tid til at lave din superhelt!");
            System.out.println("Hvad hedder din helt?");
            this.SuperheroName = sc.next();
            System.out.println(superheroName);


        }
*/
}


