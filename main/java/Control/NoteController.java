package Control;

public class NoteController {
    private static String note = "";

    public static String getNote() {
        return note;
    }

    public void setNote(String str) {
        note = str;
    }

    public void deleteNote() {
        note = "";
    }
}
