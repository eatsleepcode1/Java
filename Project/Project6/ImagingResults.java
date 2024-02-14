public class ImagingResults extends PatientFiles {
    private String CTResults;
    private String MRIResults;
    private static int imageCharges = 0;

    public void setCTResults(String CTResults) {
        this.CTResults = CTResults;
    }
    public void setMRIResults(String MRIResults) {
        this.MRIResults = MRIResults;
    }
    public static int getImageCharges() {
        return imageCharges;
    }
    public String getCTResults() {
        return CTResults;
    }
    public String getMRIResults() {
        return MRIResults;
    }

    @Override
    int resultCharge() {
        return getImageCharges();
    }

    public ImagingResults(){
        CTResults = "Pending";
        MRIResults = "Pending";
        ++imageCharges;
    }
    public ImagingResults(String ctResults, String mriResults){
         CTResults = ctResults;
         MRIResults = mriResults;
         ++imageCharges;
    }
    public void displayImagingResults(){
        System.out.println("Imaging results: ");
        System.out.println("CT results: " + getCTResults());
        System.out.println("MRI results: " + getMRIResults());
    }
    public String toString(){
        return "MRI results are " + MRIResults + " and CT results are " + CTResults;
    }
}
