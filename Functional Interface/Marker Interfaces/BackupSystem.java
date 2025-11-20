import java.io.*;

interface Backupable {
}

class UserData implements Backupable, Serializable {
    private String username;
    private String email;
    
    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }
    
    public String toString() {
        return "UserData{username='" + username + "', email='" + email + "'}";
    }
}

class TempData {
    private String tempInfo;
    
    public TempData(String tempInfo) {
        this.tempInfo = tempInfo;
    }
    
    public String toString() {
        return "TempData{tempInfo='" + tempInfo + "'}";
    }
}

public class BackupSystem {
    public static void backupData(Object obj) {
        if (obj instanceof Backupable) {
            System.out.println("Backing up: " + obj);
            System.out.println("Backup completed for " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Cannot backup: " + obj.getClass().getSimpleName() + " is not backupable");
        }
    }
    
    public static void main(String[] args) {
        UserData user = new UserData("john_doe", "john@example.com");
        TempData temp = new TempData("temporary information");
        
        backupData(user);
        backupData(temp);
    }
}