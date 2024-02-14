public class MRI extends ImagingResults implements Interpretation,ReferenceRanges {
    private String anatomicalFocus;
    private String patientAbnormality;

    public void setAnatomicalFocus(String anatomicalFocus) {
        this.anatomicalFocus = anatomicalFocus;
    }
    public void setPatientAbnormality(String patientAbnormality) {
        this.patientAbnormality = patientAbnormality;
    }
    public String getAnatomicalFocus() {
        return anatomicalFocus;
    }
    public String getPatientAbnormality() {
        return patientAbnormality;
    }
    public MRI(){
        anatomicalFocus = "Whole Body";
        patientAbnormality = "Sick";
    }
    public MRI(String aFocus, String pAbnormality){
        anatomicalFocus = aFocus;
        patientAbnormality = pAbnormality;
    }
    public void printMRI(){
        System.out.println("MRI focus: " + getAnatomicalFocus());
        System.out.println("Patient abnormality: " + getPatientAbnormality());
    }

    @Override
    public void femaleReferenceRanges() {
        System.out.println("The female reference range in this area is next to image.");
    }

    @Override
    public void maleReferenceRanges() {
        System.out.println("The male reference range in this area is next to the image.");
    }

    @Override
    public void firstImpression() {
        System.out.println("No comparison is present at this time. Radiologist will give final interpretation at later time.");
    }

    public String toString(){
        return "MRI is focused on " + anatomicalFocus + " and the patient's abnormality is " + patientAbnormality;
    }

}
