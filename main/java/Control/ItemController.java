/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entity.Item;
import Entity.Note;

import java.util.HashMap;
import java.util.Objects;

/**
 * This class controls and manages the flow of item-related tasks and data within the application, 
 * facilitating the creation, editing, and management of items and tasks
 * @author rschi
 */
public class ItemController {
    private HashMap<Integer, Item> items;

    public Item getItem(int index) {
        return this.items.get(index);
    }

    public void addItem(String note, String title) {
        int key = 0;

        if (this.items.size() < 10) {
            Item item = new Item(new Note(note), title);

            for (int i = 0; i < 10; i++) {
                if (!this.items.containsKey(i)) {
                    key = i;
                    break;
                }
            }

            this.items.put(key, item);
        }
    }

    public void deleteItem(int index) {
        this.items.remove(index);
    }

    public void deleteAllItems() {
        this.items.clear();
    }

    public int getItemIndex(Item item) {
        int index = -1;

        if (this.items.containsValue(item)) {
            for (HashMap.Entry<Integer, Item> entry : this.items.entrySet()) {
                if (Objects.equals(entry.getValue(), item)) {
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
