package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    Dog dog;
    // DONE - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // DONE - Create tests for `speak`
    // DONE - Create tests for `setBirthDate(Date birthDate)`
    // DONE - Create tests for `void eat(Food food)`
    // DONE - Create tests for `Integer getId()`
    // DONE - Create test to check Animal inheritance; google search `java instanceof keyword`
    // DONE - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        //Given
        String expectedName = "Fido";
        Date expectedBirthdate = new Date();
        int expectedId = 0;
        Integer expectedNumberOfMealsEaten = 0;

        //When
        Dog testDog = new Dog(expectedName, expectedBirthdate, expectedId);

        String actualName = testDog.getName();
        Date actualBirthdate = testDog.getBirthDate();
        int actualId = testDog.getId();
        Integer actualNumberOfMealsEaten = testDog.getNumberOfMealsEaten();

        //Then
        Assert.assertSame(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthdate);
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);

    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("Milo", new Date(),0);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        //Given
        String speak = "bark!";

        //When
        Dog dog = new Dog("Milo", new Date(), 0);
        String actual = dog.speak();
        String expected = "bark!";

        //Then
        Assert.assertSame(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        //Given
        Date expected = new Date();

        //When
        Dog dog = new Dog("Milo", new Date(), 0);
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        //Then
    Assert.assertSame(expected, actual);
    }

    @Test
    public void eatTest() {
        //Given
        String name = "Fido";
        Date birthDate = new Date();
        int id = 0;
        Integer expected = 1;

        //When
        Dog dog = new Dog("Fido", new Date(), 0);
        Food chow = new Food();
        dog.eat(chow);
        Integer actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        String name = "Fido";
        Date birthDate = new Date();
        Integer expectedId = 21;

        //When
        Dog dog = new Dog("Fido", new Date(), expectedId);
        Integer actual = dog.getId();

        //
        Assert.assertEquals(expectedId, actual);
    }

    @Test
    public void TestInstanceOfAnimal() {
        String name = "Momo";
        Date birthDate = new Date();
        Integer id = 0;
        Integer mealsEaten = 0;
    }

    @Test
    public void TestInstanceOfMammal() {
        String name = "Momo";
        Date birthDate = new Date();
        Integer id = 0;
        Integer mealsEaten = 0;
    }
}
