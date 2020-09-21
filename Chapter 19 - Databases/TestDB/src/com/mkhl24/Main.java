package com.mkhl24;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/home/mkhl24/Рабочий стол/JavaPrograms/Chapter 19 - Databases/TestDB/" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMB_EMAIL = "email";

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                " (" + COLUMN_NAME + " text, " +
                                       COLUMN_PHONE + " integer, " +
                                       COLUMB_EMAIL + " text)");

            insertContact(statement, "Tim", 564267, "tim@mail.com");
            insertContact(statement, "Joe", 867123, "joeadw@mai.l");
            insertContact(statement, "Jane", 332211, "jane@anywhere.com");
            insertContact(statement, "Fido", 969, "amiadog@ma.il");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                " (" + COLUMN_NAME + ", " +
//                                COLUMN_PHONE + ", " +
//                                COLUMB_EMAIL +
//                            " ) " +
//                            "VALUES ('Joe', 867123,'joeadw@mai.l')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMB_EMAIL +
//                    " ) " +
//                    "VALUES ('Jane', 332211,'jane@anywhere.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                                " (" + COLUMN_NAME + ", " +
//                                COLUMN_PHONE + ", " +
//                                COLUMB_EMAIL +
//                            " ) " +
//                            "VALUES ('Fido', 969,'amiadog@ma.il')");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                                COLUMN_PHONE + "=332211" +
                                " WHERE " + COLUMN_NAME + "='Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                                " WHERE " + COLUMN_NAME + "='Joe'");


            ResultSet result = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (result.next()) {
                System.out.println(result.getString(COLUMN_NAME) + " " +
                        result.getString(COLUMN_PHONE) + " " +
                        result.getString(COLUMB_EMAIL));
            }
            result.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMB_EMAIL +
                " ) " +
                "VALUES ('" + name + "', " + phone + ", " + "'" + email + "')");
    }
}














