import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

//class DatabaseTest {
/*
    @BeforeEach
    void databasePreset() {
        Superhero hero1 = new Superhero("Superman", "1.79", "Heat Vision", "Cryptonite", true);
        Superhero hero2 = new Superhero("Flash", "1.60", "Superspeed", "Cold", true);
        Superhero hero3 = new Superhero("Martian Manhunter", "1.90", "Transformation", "fire", false);
        Superhero hero4 = new Superhero("Flash", "1.60", "Superspeed", "Cold", true);

        ArrayList<Superhero> superheroesDatabase = new ArrayList<>(List.of(hero1, hero2, hero3, hero4));

        Scanner sc;

        ArrayList<Superhero> superheroList = new ArrayList<>();

        ArrayList<Superhero> getSuperheroesDatabase ()

        public void addToDatabase(String superHeroName, String superheroHeight, String superheroPower, String superheroWeakness, boolean humanOrNot) {
            superheroesDatabase.add(new Superhero(superHeroName, superheroHeight, superheroPower, superheroWeakness, humanOrNot));
        }

    }


    @Test
    void addHeroToDatabase() {
        //Arrange
        String superheroName = "Test";


        //Assert
    }
}