import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

    Superhero hero1 = new Superhero("Superman", "1.79", "Heat Vision", "Cryptonite", true);
    Superhero hero2 = new Superhero("Flash", "1.60", "Superspeed", "Cold", true);
    Superhero hero3 = new Superhero("Martian Manhunter", "1.90", "Transformation", "fire", false);
    Superhero hero4 = new Superhero("Flash", "1.60", "Superspeed", "Cold", true);

    ArrayList<Superhero> superheroesDatabase = new ArrayList<>(List.of(hero1, hero2, hero3, hero4));

    Scanner sc;

    public Database() {
        ArrayList<Superhero> superheroList = new ArrayList<>();
    }

    public ArrayList<Superhero> getSuperheroesDatabase() {
        return superheroesDatabase;
    }

    public void addToDatabase(String superHeroName, String superheroHeight, String superheroPower, String superheroWeakness, boolean humanOrNot) {
        superheroesDatabase.add(new Superhero(superHeroName, superheroHeight, superheroPower, superheroWeakness, humanOrNot));
    }


    public void addHeroToDatabase() {
        sc = new Scanner(System.in);
        System.out.println("Time to add a new hero");
        System.out.println("");

        String superheroName = "";
        do {
            System.out.println("Write the name of the sueprhero");
            superheroName = sc.nextLine();
        } while(superheroName.isEmpty());

        String superheroHeight = "";
        do {
            System.out.println("Write the height of the superhero and what value you want it to be");
            superheroHeight = sc.nextLine();
        } while (superheroHeight.isEmpty());

        String superheroPower = "";
        do {
            System.out.println("Write the power(s) of the superhero: ");
            superheroPower = sc.nextLine();
        } while (superheroPower.isEmpty());

        String superheroWeakness = "";
        do {
            System.out.println("Write the weakness(s) of the superhero");
            superheroWeakness = sc.nextLine();
        } while (superheroWeakness.isEmpty());


        System.out.println("Write if the superhero origin is from planet earth. \nPlease write 1 if he/she is from earth and press ENTER. \nPlease write 2 if he/she is not from planet earth and press ENTER");
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
                System.out.println("Wrong input. Origin og the new hero has been sat to: From planet earth\nPlease use 'Edit superheroes' if you wish to change it.");
        }

        System.out.println("");
        sc.nextLine();

        addToDatabase(superheroName, superheroHeight, superheroPower, superheroWeakness, superheroHumanOrNot);
        System.out.println("You have added: " + "" + superheroName + " " + "To the database");
        System.out.println("");


    }

    ArrayList<Superhero> searchResults = new ArrayList<Superhero>();

    public void searchDatabase() {

        System.out.println("Type the name of the hero you wanna search for: ");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();


        for (Superhero nameSearch : superheroesDatabase) {
            if (nameSearch.getSuperheroName().equalsIgnoreCase(searchName)) {
                searchResults.add(nameSearch);
            }
        }
        if (!searchResults.isEmpty())
            for (Superhero nameSearch : searchResults) {
                System.out.println("");
                System.out.println(nameSearch);
            }
        else
            System.out.println("No matches with the following search: " + "\"" + searchName + "\"");

    }

    public void showSearchResults() {
        Database database = new Database();
        if (!searchResults.isEmpty())
            for (int i = 0; i < searchResults.size(); i++) {
                System.out.println("");
                System.out.println(i + 1 + ":" + searchResults.get(i));
            }
        else
            System.out.println("You have not made any searches yet.");

    }

    public void editSuperheroes() {
        for (int i = 0; i < superheroesDatabase.size(); i++) {
            System.out.println(i + 1 + ":" + superheroesDatabase.get(i));
        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the number of which superhero you wanna edit: ");

        Superhero editSuperhero = superheroesDatabase.get(number - 1);
        System.out.println("Adjusting following superhero " + editSuperhero);

        System.out.println("Edit data and press ENTER. If you do not wish to edit any data press ENTER");
        System.out.println("Currently editing superhero name: " + editSuperhero.getSuperheroName());
        String superheroNewName = sc.nextLine();
        if (!superheroNewName.isEmpty())
            editSuperhero.setSuperheroName(superheroNewName);

        System.out.println("Edit data and press ENTER. If you do not wish to edi any data press ENTER");
        System.out.println("Currently editing superhero height: " + editSuperhero.getSuperheroHeight());
        String superheroNewHeight = sc.nextLine();
        if (!superheroNewHeight.isEmpty())
            editSuperhero.setSuperheroHeight(superheroNewHeight);

        System.out.println("Edit data and press ENTER. If you do not wish to edit any data press ENTER");
        System.out.println("Corrently editing superhero powers: " + editSuperhero.getSuperheroPower());
        String superheroNewPower = sc.nextLine();
        if (!superheroNewPower.isEmpty());
        editSuperhero.setSuperheroPower(superheroNewPower);

        System.out.println("Edit data and press ENTER. If you do not wish to edit any data press ENTER");
        System.out.println("Currently editing superhero weakness(s): " + editSuperhero.getSuperheroWeakness());
        String superheroNewWeakness = sc.nextLine();
        if (!superheroNewWeakness.isEmpty());
        editSuperhero.setSuperheroWeakness(superheroNewWeakness);

        System.out.println("Edit data and press ENTER. If you do not wish to edit any data press ENTER");
        System.out.println("Currently editing superhero origin. \nPress 1 and press ENTER if origin is from earth. \nPress 2 and ENTER if origin is not from earth.");
        String superheroNewOrigin = sc.nextLine();
        if (superheroNewOrigin == "1") {
            editSuperhero.setSuperheroHumanOrNot(true);
        }
        else if (superheroNewOrigin == "2")
        {
            editSuperhero.setSuperheroHumanOrNot(false);
        }
        {
            System.out.println("");
        }


    }


    public void removeSuperhero (){
        for (int i = 0; i < superheroesDatabase.size(); i++) {
            System.out.println(i + 1 + ":" + superheroesDatabase.get(i));
        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the number of which superhero you wanna remove: ");

        Superhero superheroRemove = superheroesDatabase.remove(number -1);
    }

}
