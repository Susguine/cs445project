/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 * This class represents a specific item within the application, encompassing tasks, 
 * reminders, notes, or any other type of content
 * @author rschi
 */
public class Item {
    private ItemNote itemNote;
    private String title;
    private String action;

    public ItemNote getItemNote() {
        return itemNote;
    }

    public void setItemNote(ItemNote itemNote) {
        this.itemNote = itemNote;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
