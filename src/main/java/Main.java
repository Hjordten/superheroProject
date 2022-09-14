import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Database database = new Database();
        int user = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    Welcome to the superhero database
                    1. create superhero(es).
                    2. Find Superhero(es).
                    3. Show database of heroes.
                    9. Exit
                    """);
            int mainMenuChoise = 0;
                switch (mainMenuChoise) {
                    case 1:
                        database.addHeroToDatabase();
                        break;
                    case 2:
                        System.out.println("Search the name of a desired superhero by typing its name: ");
                        String searchName = sc.nextLine();
                        database.searchHero(searchName);
                        break;
                    default:
                        System.out.println("test");
                        break;
                }

        } while (user != 999);
    }
}


//superheroDatabase.createHero(createdHeroName, createdHeroHeight, createdHeroPower, createdHeroWeakness, createdHeroHumanOrNot);

//System.out.println(superheroDatabase);



