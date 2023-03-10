package net.erasmatov.behavioral.command;

public class Developer {
    Command Insert;
    Command Update;
    Command Select;
    Command Delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        Insert = insert;
        Update = update;
        Select = select;
        Delete = delete;
    }

    public void insertRecord() {
        Insert.execute();
    }

    public void updateRecord() {
        Update.execute();
    }

    public void selectRecord() {
        Select.execute();
    }

    public void deleteRecord() {
        Delete.execute();
    }
}
