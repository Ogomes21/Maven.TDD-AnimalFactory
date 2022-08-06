package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // DONE - Create tests for `void add(Dog dog)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDogTest() {
        //Given
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Mia",new Date(878787), 1234);
        Integer expectedNumberOfDogs = 1;

        //When
        dogHouse.add(dog);
        Integer actualNumberOfDogs = dogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumberOfDogs,actualNumberOfDogs);
    }

    @Test
    public void removeDogByIdTest() {
        DogHouse.clear();
        //Given
        Dog dog = new Dog("Marty", new Date (221187), 45);

        //When
        DogHouse.add(dog);
        Integer expectedRemovalId = 45;
        Integer expectedNumBeforeRemoval = 1;
        Integer expectedNumAfterRemoval = 0;

        //Then
        Assert.assertEquals(expectedNumBeforeRemoval, DogHouse.getNumberOfDogs());
        DogHouse.remove(expectedRemovalId);
        Assert.assertEquals(expectedNumAfterRemoval, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogByDogTest() {
        DogHouse.clear();
        //Given
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Froggy", new Date(022561), 7);
        Integer expectedNumberOfDogs = 0;

        //When
        dogHouse.add(dog);
        dogHouse.remove(dog);
        Integer actualNumberOfDogs = dogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void getDogByIdTest() {
        DogHouse.clear();

        //Given
        Dog dog = new Dog("DallE", new Date(4444), 90);
        DogHouse.add(dog);

        //When
        Integer expectedId = 90;

        //Then
        Assert.assertEquals(dog, DogHouse.getDogById(expectedId));
    }

    @Test
    public void removeDogTest() {
        DogHouse.clear();

        //Given
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Her", new Date(65456), 7);
        Integer expectedNumberOfDogs = 0;

        //When
        dogHouse.add(dog);
        dogHouse.remove(dog);
        Integer actualNumberOfDogs = dogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void testGetNumberOfDogs() {
        DogHouse.clear();
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
