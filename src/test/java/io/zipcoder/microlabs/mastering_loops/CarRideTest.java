package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void testAreWeThereYetYes(){
        //: Given
        CarRide carRide = new CarRide();
        String tellAnswer= "yes";
        String expected= "Good!";

        //: When
        String actual= carRide.areWeThereYet();

        //: Then
        Assert.assertEquals("If input is yes, return should be 'good!'", expected, actual);
    }

}



