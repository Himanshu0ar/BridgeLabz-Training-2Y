class University {
    private String universityName;
    protected String location;
    int establishedYear;
    public String chancellor;

    public University(String universityName, String location, int establishedYear, String chancellor) {
        this.universityName = universityName;
        this.location = location;
        this.establishedYear = establishedYear;
        this.chancellor = chancellor;
    }

    public String getUniversityName() {
        return universityName;
    }
}

class College extends University {
    public College(String universityName, String location, int establishedYear, String chancellor) {
        super(universityName, location, establishedYear, chancellor);
    }

    public void showDetails() {
        System.out.println("University: " + getUniversityName());
        System.out.println("Location: " + location);
        System.out.println("Established: " + establishedYear);
        System.out.println("Chancellor: " + chancellor);
    }
}

public class TestUniversity {
    public static void main(String[] args) {
        College c = new College("Delhi University", "Delhi", 1922, "Dr. Singh");
        c.showDetails();
    }
}
