/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entity.Alert;
import Entity.Date;


/**
 * This class controls and manages the flow of alert-related tasks and data within the application, 
 * facilitating the creation, editing, and management of alerts and ensuring they are triggered at the specified times
 * @author rschi
 */
public class AlertController {
    public Alert sendAlert(Alert alert) {

        return alert; // delete this and insert send alert logic
    }

    public Alert createAlert(String title, Date date) {
        return new Alert(title, date);
    }
}
