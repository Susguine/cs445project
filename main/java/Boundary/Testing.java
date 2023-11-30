package Boundary;
import java.util.ArrayList;

import org.junit.*;

import Control.ItemController;
import Control.ReminderController;
import Entity.Item;
import Entity.Note;
public class Testing {

    @Test
    public void addItemtest() {
        ItemController.addItem("Hello","Bye Bye");
        ArrayList<String> arr = new ArrayList<>();
        arr = ItemController.getItem(0);
        Assert.assertEquals(arr.get(0), "Bye Bye");
        Assert.assertEquals(arr.get(1), "Hello");
    }

    @Test
    public void addRemindertest() {
        //correct input
        ReminderController.addItem("Hello","11/30/2023 1:30 PM");
        ArrayList<String> arr = new ArrayList<>();
        arr = ReminderController.getItem(0);
        Assert.assertEquals(arr.get(0), "Hello");
        Assert.assertEquals(arr.get(1), "11/30/2023");
        Assert.assertEquals(arr.get(2), "1:30 PM");
        //incorrect input
        //title will accept any charcter
        //date has to be in correct format
        ReminderController.addItem("Hello","11/30");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2 = ReminderController.getItem(1);
        Assert.assertEquals("Hello", arr2.get(0));
        Assert.assertEquals("Error. Please try again with correct input layout!", arr2.get(1));
    }
}
