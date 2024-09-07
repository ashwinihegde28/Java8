package org.example.encapsulation;

public class MainForReadWriteAccess {
    public static void main(String[] args) {
        ReadWriteFile readWrite = new ReadWriteFile(true,true);
        ReadOnlyFile readOnly = new ReadOnlyFile(true);
        WriteOnlyFile writeOnly = new WriteOnlyFile(true);

        System.out.println("ReadOnlyFile is readable ? " + readOnly.isRead()+ " Writable? " + readOnly.isWriteable());
        System.out.println("Write only is writable ? " + writeOnly.isWriteable() + " Readable ? " + writeOnly.isRead());
        System.out.println("Read Write File allows read  " + readWrite.isRead() + " Write " + readWrite.isWriteable());

    }
}
