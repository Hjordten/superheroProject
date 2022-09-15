import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

    Superhero hero1 = new Superhero("Superman", 1.79, "Heat Vision", "Cryptonite", true);
    Superhero hero2 = new Superhero("Flash", 1.60, "Superspeed", "Cold", true);
    Superhero hero3 = new Superhero("Martian Manhunter", 1.90, "Transformation", "fire", false);
    Superhero hero4 = new Superhero("Flash", 1.60, "Superspeed", "Cold", true);

    ArrayList<Superhero> superheroesDatabase = new ArrayList<>(List.of(hero1, hero2, hero3, hero4));

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

    public void showDatabse() {
        System.out.println(superheroesDatabase.get(0));
    }


    public void addHeroToDatabase() {
        sc = new Scanner(System.in);
        System.out.println("Time to add a new hero");
        System.out.println("");

        System.out.println("Write the name of the superhero: ");
        String superheroName = sc.nextLine();
        System.out.println("");

        System.out.println("Write the height of the superhero : \nPlease use , (comme) to seperate period");
        double superheroHeight = sc.nextDouble();
        System.out.println("");

        System.out.println("Write the power(s) of the superhero: ");
        String superheroPower = sc.next();
        System.out.println("");

        System.out.println("Write the weakness(s) of the superhero");
        String superheroWeakness = sc.next();
        System.out.println("");

        System.out.println("""
                write if the superhero origin is from planet earth?
                Please write 1 if he/she is from planet earth.
                Please write 2 if he/she is not from planet earth.              
                """);
        boolean superheroHumanOrNot = true;
        int userChoice = (sc.nextInt());
        switch (userChoice) {
            case 1:
                superheroHumanOrNot = true;
                System.out.println("You have declared the superheros origin as: from planet earth");
                break;
            case 2:
                superheroHumanOrNot = false;
                System.out.println("You have declared the superheroes origin as: not from planet earth");
                break;
            default:
                System.out.println("Wrong input. Please type again");
        }

        System.out.println("");
        sc.nextLine();

        addToDatabase(superheroName, superheroHeight, superheroPower, superheroWeakness, superheroHumanOrNot);
        System.out.println("You have added: " + "" + superheroName + " " + "To the database");
        System.out.println("");


    }


    public void searchDatabase() {

        System.out.println("Type the name of the hero you wanna search for: ");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();

        ArrayList<Superhero> searchResults = new ArrayList<Superhero>();

        for (Superhero nameSearch : superheroesDatabase) {
            if (nameSearch.getSuperheroName().contains(searchName)) {
                searchResults.add(nameSearch);
            }
        }
        if (!searchResults.isEmpty())
            for (Superhero nameSearch : searchResults)
                System.out.println(nameSearch);

        else
            System.out.println("No matches with the following search: " + "\"" + searchName + "\"");

        for (int i = 0; i < searchResults.size(); i++) {
            System.out.println(i + 1 + ":" + searchResults.get(i));
        }
    }
}
