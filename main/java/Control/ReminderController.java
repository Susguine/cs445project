/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entity.Reminder;

/**
 * This class controls and manages the flow of reminder-related tasks and data between 
 * the Reminder Screen and the Reminder class
 * @author rschi
 */
public class ReminderController {
    private Reminder reminder;

    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }
}
