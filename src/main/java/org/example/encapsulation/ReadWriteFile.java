package org.example.encapsulation;

public class ReadWriteFile {
    private boolean isRead;
    private boolean isWriteable;

    public ReadWriteFile(boolean isRead, boolean isWriteable) {
        this.isRead = isRead;
        this.isWriteable = isWriteable;
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

    public void setWriteable(boolean writeable) {
        isWriteable = writeable;
    }
}
