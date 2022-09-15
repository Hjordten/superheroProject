import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                    for(Superhero hero : database.getSuperheroesDatabase())
                        System.out.println(hero);
                    break;
                default:
                    System.out.println("Could not resolve input");
                    break;
            }
        }while (mainMenuChoise != 9);
        }
    }


//superheroDatabase.createHero(createdHeroName, createdHeroHeight, createdHeroPower, createdHeroWeakness, createdHeroHumanOrNot);

//System.out.println(superheroDatabase);



