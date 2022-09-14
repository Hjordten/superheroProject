import java.util.ArrayList;

public class Database {

    //Array til superhelte objekter
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private int count = 0;

    public void addHeroes1(String superHeroName, double superheroHeight, String superheroPower, String superheroWeakness, boolean humanOrNot) {
        Superhero superhero = new Superhero(superHeroName, superheroHeight, superheroPower, superheroWeakness, humanOrNot);
    }

    public void addHeroes(Superhero hero){
        superheroes.add(hero);
    }
}