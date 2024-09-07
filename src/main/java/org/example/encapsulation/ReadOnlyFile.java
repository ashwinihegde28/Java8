package org.example.encapsulation;

public class ReadOnlyFile {



    private boolean isRead;


    private boolean isWriteable = false;

    public ReadOnlyFile(boolean isRead) {
        this.isRead = isRead;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
    public boolean isWriteable() {
        return isWriteable;
    }


}
