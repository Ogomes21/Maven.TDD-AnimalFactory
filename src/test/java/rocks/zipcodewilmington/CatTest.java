package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.net.Authenticator;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // DONE - Create tests for `void setName(String name)`
    // DONE - Create tests for `speak`
    // Done - Create tests for `setBirthDate(Date birthDate)`
    // DONE - Create tests for `void eat(Food food)`
    // DONE - Create tests for `Integer getId()`
    // DONE - Create test to check Animal inheritance; google search `java instanceof keyword`
    // DONE - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer givenNumberOfMealsEaten = 0;


        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();
        Integer retrieveNumberOfMealsEaten = cat.getNumberOfMealsEaten();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertSame(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
        Assert.assertEquals(givenNumberOfMealsEaten, retrieveNumberOfMealsEaten);
    }

    @Test
    public void setNameTest(){
        //Given
        String givenName = "Mimi";

        //When
        Cat cat = new Cat("Mimi",new Date(), 5 );

        //When
        String actual = cat.getName();
        String expected = "Mimi";

        //Then
        Assert.assertSame(actual, expected);

    }

    @Test
    public void speakTest() {
        //Given
        String expectedSpeak = "Meow";

        //When
        Cat cat = new Cat ("Mimi", new Date(), 9);

        //When
        String actual = cat.speak();
        String expected = "meow!";

        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test

    public void setBirthDateTest() {

        //Given
        Date expected = new Date();
        
        //When
        Cat cat = new Cat("Mimi",new Date(), 5 );

        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void eatTest() {

        //Given
        String givenName = "Maybe";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 1;

        //When
        Cat cat = new Cat("Maybe", new Date(), 21);
        Food tuna = new Food();
        cat.eat(tuna);
        Integer actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);

    }
        @Test

    public void getIdTest() {

            //Given
            String givenName = "Maya";
            Date givenBirthDate = new Date();
            Integer expected = 22;

            //When
            Cat cat = new Cat("Maya", new Date(), expected);

            //When
            Integer retrievedId = cat.getId();
            Integer actual = cat.getId();

            //Then
            Assert.assertEquals(expected, actual);
        }

        @Test
    public void TestInstanceOfAnimal() {
            String givenName = "Milo";
            Date givenBirthDate = new Date();
            Integer givenId = 0;
        }

        @Test
    public void TestInstanceOfMammal() {
        String givenName = "Mammal";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        }



}



