import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        Scanner sc = new Scanner(System.in);

            System.out.println("""
                    Welcome to the superhero database
                    1. create superhero(es).
                    2. Find Superhero(es).
                    3. Show database of heroes.
                    9. Exit
                    """);
            int mainMenuChoise = Integer.parseInt(sc.next());
            switch (mainMenuChoise) {
                case 1:
                    database.addHeroToDatabase();
                    break;
                case 2:
                    System.out.println("Search the name of a desired superhero by typing its name: ");
                    String searchName = sc.nextLine();
                    database.searchHero(searchName);
                case 3:
                    database.showDatabse();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }



//superheroDatabase.createHero(createdHeroName, createdHeroHeight, createdHeroPower, createdHeroWeakness, createdHeroHumanOrNot);

//System.out.println(superheroDatabase);



