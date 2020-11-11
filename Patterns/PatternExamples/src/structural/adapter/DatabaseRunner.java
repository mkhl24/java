package structural.adapter;

import javax.swing.text.AbstractDocument;

public class DatabaseRunner {

    public static void main(String[] args) {
//        Database database = null;
        Database database = new JavaToDatabaseAdapter();

        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
