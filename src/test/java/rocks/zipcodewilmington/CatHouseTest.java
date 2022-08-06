package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // DONE - Create tests for `void add(Cat cat)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Cat cat)`
    // DONE - Create tests for `Cat getCatById(Integer id)`
    // DONE - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Pepper", new Date(22187), 5);
        Integer expectedNumberOfCats = 1;

        //When
        catHouse.add(cat);
        Integer actualNumberOfCats = catHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedNumberOfCats,actualNumberOfCats);
    }

    @Test
    public void removeCatByIdTest() {
        CatHouse.clear();
        //Given
        Cat removeCat = new Cat("Kibble", new Date(22187), 5);

        //When
        CatHouse.add(removeCat);
        Integer expectedRemovalId = 5;
        Integer expectedNumberBeforeRemoval = 1;
        Integer expectedNumberAfterRemoval = 0;

        //Then
        Assert.assertEquals(expectedNumberBeforeRemoval, CatHouse.getNumberOfCats());
        CatHouse.remove(expectedRemovalId);
        Assert.assertEquals(expectedNumberAfterRemoval, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCatByCatTest() {
        CatHouse.clear();

        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Ann", new Date(22187), 6);
        Integer expectedNumberOfCats = 0;

        //When
        catHouse.add(cat);
        catHouse.remove(cat);
        Integer actualNumberOfCats = catHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void getCatByIdTest() {
        CatHouse.clear();
        //Given
        Cat cat = new Cat("Clyde", new Date(4691), 1122);
        CatHouse.add(cat);

        //When
        Integer expectedId = 1122;

        //Then
        Assert.assertEquals(cat, CatHouse.getCatById(expectedId));
    }

    @Test
    public void GetNumberOfCatsTest() {
        //Given

        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        //When
        CatHouse.add(animal);

        //Then
        CatHouse.getNumberOfCats();
    }
}