/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entity.Date;
import Entity.Reminder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * This class controls and manages the flow of reminder-related tasks and data between 
 * the Reminder Screen and the Reminder class
 * @author rschi
 */
public class ReminderController {
    private static HashMap<Integer, Reminder> reminders = new HashMap<>();

    public static ArrayList<String> getItem(int index) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(reminders.get(index).getTitle());
        arrayList.add(reminders.get(index).getDate().toString());

        return arrayList;
    }

    public static void setItem(String title, String date, String time, int index) {
        reminders.put(index, new Reminder(title, new Date(date, time)));
    }

    public static void addItem(String title, String date, String time) {
        int key = 0;

        if (reminders.size() < 10) {
            Reminder reminder = new Reminder(title, new Date(date, time));

            for (int i = 0; i < 10; i++) {
                if (!reminders.containsKey(i)) {
                    key = i;
                    break;
                }
            }

            reminders.put(key, reminder);
        }
    }

    public static void deleteItem(int index) {
        reminders.remove(index);
    }

    public static void deleteAllItems() {
        reminders.clear();
    }

    public static int getItemIndex(Reminder reminder) {
        int index = -1;

        if (reminders.containsValue(reminder)) {
            for (HashMap.Entry<Integer, Reminder> entry : reminders.entrySet()) {
                if (Objects.equals(entry.getValue(), reminder)) {
                    index = entry.getKey();
                }
            }

            return index;
        } else {
            System.out.println("Item is not found in HashMap");
            return -1;
        }
    }
}
