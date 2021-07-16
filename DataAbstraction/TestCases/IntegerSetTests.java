import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //check number is not already in set
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check the number is in the set
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contains(3));
    }


    /*
    im not sure exactly what you were looking for so i wrote both ways i interpreted the assignment
    */

    /*
    this one assumes that either it or the test above should fail and it tests if there is a number already in the
    set and tests if the set stays the same after attempting to add the same number
    */
    @Test
    public void testInsertAlreadyThere(){
        //check number is  already in set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));

        //tries to insert number
        testSet.insert(3);

        //check the number is not in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }
    //this one just tests if adding a number that is already the set to the set results in the number not being added to the set

    @Test
    public void testInsertAlreadyThere1(){
        //tests if set is empty
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contains(3));


        //Starts with a 3 in the set
        testSet.insert(3);

        //check number is  already in set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));

        //tries to insert
        testSet.insert(3);

        //check the number is not in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(3));
    }
}
