import java.util.InputMismatchException;
import java.util.Scanner;

public class Startprogram {
    public void StartUI() {
        Database database = new Database();
        boolean stop = false;
        while (stop == false) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    Please type the number of which option you wanna use:
                    1. create superhero(es).
                    2. Find Superhero(es).
                    3. Show database of heroes.
                    4. Show searched results.
                    5. Edit superheroes.
                    9. Exit
                    """);

            try {
                switch (sc.nextInt()) {
                    case 1:
                        database.addHeroToDatabase();
                        break;
                    case 2:
                        database.searchDatabase();
                        break;
                    case 3:
                        for (Superhero hero : database.getSuperheroesDatabase())
                            System.out.println(hero);
                        break;
                    case 4:
                        database.showSearchResults();
                        System.out.println("You have previously searched for these superheroes: ");
                        break;
                    case 5:
                        database.editSuperheroes();
                        System.out.println("Please type the number of which hero you wanna edit");
                        break;
                    case 9:
                        System.out.println("Closing database");
                        stop = true;
                        break;
                    default:
                        System.out.println("Could not handle input. Please type again");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("please enter a number");
            }
        }
    }
}
