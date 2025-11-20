interface SensitiveData {
}

class CreditCardInfo implements SensitiveData {
    private String cardNumber;
    private String holderName;
    private String expiryDate;
    
    public CreditCardInfo(String cardNumber, String holderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }
    
    public String toString() {
        return "CreditCardInfo{cardNumber='" + cardNumber + "', holderName='" + holderName + "', expiryDate='" + expiryDate + "'}";
    }
}

class UserProfile implements SensitiveData {
    private String ssn;
    private String address;
    private String phoneNumber;
    
    public UserProfile(String ssn, String address, String phoneNumber) {
        this.ssn = ssn;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public String toString() {
        return "UserProfile{ssn='" + ssn + "', address='" + address + "', phoneNumber='" + phoneNumber + "'}";
    }
}

class PublicInfo {
    private String companyName;
    private String website;
    
    public PublicInfo(String companyName, String website) {
        this.companyName = companyName;
        this.website = website;
    }
    
    public String toString() {
        return "PublicInfo{companyName='" + companyName + "', website='" + website + "'}";
    }
}

public class EncryptionSystem {
    public static void processData(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("ENCRYPTING sensitive data: " + obj);
            System.out.println("Data encrypted successfully for " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Processing public data: " + obj);
            System.out.println("No encryption needed for " + obj.getClass().getSimpleName());
        }
    }
    
    public static void main(String[] args) {
        CreditCardInfo card = new CreditCardInfo("1234-5678-9012-3456", "John Doe", "12/25");
        UserProfile profile = new UserProfile("123-45-6789", "123 Main St", "555-0123");
        PublicInfo company = new PublicInfo("TechCorp", "www.techcorp.com");
        
        processData(card);
        processData(profile);
        processData(company);
    }
}