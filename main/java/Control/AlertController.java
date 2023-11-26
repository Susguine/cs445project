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
    Alert alert;

    public Alert sendAlert(Alert alert) {

        return alert;
    }

    public void createAlert(String title, Date date) {
        this.alert = new Alert(title, date);
    }

    public Alert getAlert() {
        return alert;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }
}
