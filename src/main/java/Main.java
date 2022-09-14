import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Database database = new Database();
        int user = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    Welcome to the superhero database
                    1. create superhero.
                    2. Show superheroes.
                    3. Find superhero.
                    9. Exit
                    """);
            int mainMenuChoise = 0;
                switch (mainMenuChoise) {
                    case 1:
                        database.addHeroToDatabase();
                        break;
                    case 2:
                        System.out.println("test");
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



