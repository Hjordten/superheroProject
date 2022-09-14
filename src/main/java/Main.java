import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int user;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("""
                    Welcome to the superhero database
                    1. create superhero.
                    2. Exit
                    """);

            user = sc.nextInt();
            if (user == 1) {
                System.out.println("Enter the name of the superhero");
                String name = sc.next();

                System.out.println("Enter the height of the superhero");
                double height = sc.nextDouble();

                System.out.println("Enter the power of the superhero");
                String power = sc.next();

                System.out.println("Enter the weakness of the superhero");
                String Weakness = sc.next();

                System.out.println("Kommer din superhelt fra jorden? (Ja/Nej)");

                String isHumanOrNotString = sc.next();
                boolean humanNot = false;
                boolean humanYes = true;
                if (isHumanOrNotString.equalsIgnoreCase("Ja")) {
                }
                Database database = new Database();

                System.out.println(database);

            } else {
                System.exit(0);
            }
        } while (user != 9);
    }
}


//superheroDatabase.createHero(createdHeroName, createdHeroHeight, createdHeroPower, createdHeroWeakness, createdHeroHumanOrNot);

//System.out.println(superheroDatabase);



