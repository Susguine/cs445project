/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entity.Item;

/**
 * This class controls and manages the flow of item-related tasks and data within the application, 
 * facilitating the creation, editing, and management of items and tasks
 * @author rschi
 */
public class ItemController {
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
