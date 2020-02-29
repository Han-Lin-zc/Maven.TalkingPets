package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void dogInheritanceTest() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void catInheritanceTest() {
        Pet p = new Cat();
        Assert.assertTrue(p instanceof Pet);
    }


}