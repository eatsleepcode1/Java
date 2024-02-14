public abstract class PatientFiles {
    protected String firstName;
    protected String lastName;
    protected String dateOfBirth;

    abstract int resultCharge();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public PatientFiles(){
        firstName = "Patient";
        lastName = "Name";
        dateOfBirth = "01/01/1900";
    }
    public PatientFiles(String fName, String lName, String birthDate){
        firstName = fName;
        lastName = lName;
        dateOfBirth = birthDate;
    }
    public void printPatient(){
        System.out.println("Patient Information: ");
        System.out.println("Patient's name: " + getFirstName() + " " + getLastName());
        System.out.println("Date of Birth: " + getDateOfBirth());
    }

    public String toString(){
        return "The patient's name is " + firstName + " " + lastName + "and date of birth is " + dateOfBirth;
    }
}
