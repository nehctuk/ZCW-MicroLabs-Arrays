package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected =
                "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "Mushrooms";
        //: When
        String actual = arrayParty.lastElement(breakfast);
        //: Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void lastButOneTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "Tomatoes";
        //: When
        String actual = arrayParty.lastButOne(breakfast);
        //: Then
        Assert.assertEquals(expected,actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected =
                "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";

        String actual = arrayParty.reverse(breakfast);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isPalindromeTest() {
        ArrayParty arrayParty = new ArrayParty();
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};

        boolean expected = true;
        boolean actual = arrayParty.isPalindrome(palindromic);
        Assert.assertEquals(expected,actual);


    }

    //TODO Define the method compressTest
    @Test
    public void compressTest() {
        ArrayParty arrayParty = new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String expected =
                "*** Output ***\n" +
                "1\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "4";
        String actual = arrayParty.compress(nums);
        Assert.assertEquals(expected,actual);
    }

    //TODO Define the method packTest
    @Test
    public void packTest() {
        ArrayParty arrayParty = new ArrayParty();
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd',
                'e', 'e', 'e', 'e'};

        String expected =
                "*** Output ***\n" +
                "aaaa, b, cc, aa, d, eeee";

        String actual = arrayParty.pack(letters);

        Assert.assertEquals(expected,actual);

    }


}
