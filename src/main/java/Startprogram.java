import java.util.Scanner;

public class Startprogram {

    public void StartUI() {
        Database database = new Database();
        Scanner sc = new Scanner(System.in);
        int mainMenuChoise = 0;
        int optionsMenu = 0;
        do {
            System.out.println("""
                    Welcome to the superhero database
                    1. create superhero(es).
                    2. Find Superhero(es).
                    3. Show database of heroes.
                    4. Show searched results.
                    9. Exit
                    """);
            mainMenuChoise = sc.nextInt();
            //int optionsMenu = 0;
            switch (mainMenuChoise) {

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
                default:
                    System.out.println("Closing database");
                    break;
            }
        } while (mainMenuChoise != 9);
    }
}
