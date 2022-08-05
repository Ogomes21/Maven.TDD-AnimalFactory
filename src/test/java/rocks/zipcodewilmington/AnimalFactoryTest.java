package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //DONE - Create Test for `Animal createDog(String name, Date birthDate)`
    //DONE - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {

        //Given
        String expectedName = "Benji";
        Date expectedBirthDate = new Date();

        //When
        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthDate);

        //Then
        Assert.assertEquals(expectedName, dog.getName());
        Assert.assertEquals(expectedBirthDate, dog.getBirthDate());
    }

    @Test
    public void createCatTest() {

        //Given
        String expectedName = "Money";
        Date expectedBirthDate = new Date();

        //When
        Cat cat = AnimalFactory.createCat(expectedName, expectedBirthDate);

        //Then
        Assert.assertEquals(expectedName, cat.getName());
        Assert.assertEquals(expectedBirthDate, cat.getBirthDate());

    }
}


