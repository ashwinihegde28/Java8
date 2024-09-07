package org.example.encapsulation;

public class WriteOnlyFile {

    private boolean isWriteable;
    private boolean isRead = false;

    public boolean isRead() {
        return isRead;
    }


    public WriteOnlyFile(boolean isWriteable) {
        this.isWriteable = isWriteable;
    }

    public boolean isWriteable() {
        return isWriteable;
    }

    public void setWriteable(boolean writeable) {
        isWriteable = writeable;
    }


}
