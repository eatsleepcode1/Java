public class LaboratoryResults extends PatientFiles {
    private String hematologyResults;
    private String chemistryResults;
    private static int testCharges = 0;

    public void setHematologyResults(String hematologyResults) {
        this.hematologyResults = hematologyResults;
    }
    public void setChemistryResults(String chemistryResults) {
        this.chemistryResults = chemistryResults;
    }

    public static int getTestCharges() {
        return testCharges;
    }
    public String getHematologyResults() {
        return hematologyResults;
    }
    public String getChemistryResults() {
        return chemistryResults;
    }
    public LaboratoryResults(){
        hematologyResults = "Pending";
        chemistryResults = "Pending";
        ++testCharges;
    }
    public LaboratoryResults(String hResults, String cResults){
        hematologyResults = hResults;
        chemistryResults = cResults;
        ++testCharges;
    }

    @Override
    int resultCharge() {
        return getTestCharges();
    }

    public void displayLabResults(){
        System.out.println("Laboratory results: ");
        System.out.println("Hematology lab results: " + getHematologyResults());
        System.out.println("Chemistry lab results: " + getChemistryResults());
    }
    public String toString(){
        return "Hematology lab results are " + hematologyResults + " and Chemistry lab results are " + chemistryResults;
    }
}
