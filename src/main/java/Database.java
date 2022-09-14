import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    ArrayList<Superhero> superheroesDatabase = new ArrayList<>();

    Scanner sc;

    public Database() {
        ArrayList<Superhero> superheroList = new ArrayList<>();
    }

    public ArrayList<Superhero> getSuperheroesDatabase() {
        return superheroesDatabase;
    }

    public void addToDatabase(String superHeroName, double superheroHeight, String superheroPower, String superheroWeakness, boolean humanOrNot) {
        superheroesDatabase.add(new Superhero(superHeroName, superheroHeight, superheroPower, superheroWeakness, humanOrNot));
    }


    public void addHeroToDatabase() {
        sc = new Scanner(System.in);
        System.out.println("Time to add a new hero");

        System.out.println("Write the name of the superhero: ");
        String superheroName = sc.nextLine();

        System.out.println("""
                Write the height of the hero:
                please use .(perod) to seperate period numbers to avoid error.
                """);
        double superheroHeight = sc.nextDouble();

        System.out.println("""
                Write the power(s) of the hero:
                """);
        String superheroPower = sc.next();

        System.out.println("""
                Write the weakness(s) of the superhero:
                """);
        String superheroWeakness = sc.next();

        System.out.println("""
                write if the superhero origin is from planet earth?
                              
                """);
        boolean superheroHumanOrNot = true;
        int userChoice = 0;
        do {
            System.out.println("""
                    Please write 1 if he/she is from planet earth.
                    please write 2 if he/she is not from planet earth.
                    """);
            switch (userChoice) {
                case 1:
                    superheroHumanOrNot = true;
                    break;
                case 2:
                    superheroHumanOrNot = false;
                    break;
                default:
                    System.out.println("Wrong input. Please type again");
            }
        }
        while (userChoice != 1 && userChoice != 2);
        sc.nextLine();

        addToDatabase(superheroName, superheroHeight, superheroPower, superheroWeakness, superheroHumanOrNot);
        System.out.println("You have added: " + "" + superheroName + " " + "To the databse");


    }

    public void searchHero(String searchName) {
        boolean find = false;
        for (Superhero hero : superheroesDatabase) {
            System.out.println("Superhero name is: " + hero.getSuperheroName());
            System.out.println("Superhero height is: " + hero.getSuperheroHeight());
            System.out.println("Superhero power(s) is: " + hero.getSuperheroPower());
            System.out.println("Superhero weakness(s) is: " + hero.getSuperheroWeakness());
            System.out.println("Superhero origin from planet earth is: " + hero.getSuperheroHumanOrNot());

            find = true;
        }
        if (!find) {
            System.out.println("There are no match(es) while searching for: " + searchName);
        }


    }

}

