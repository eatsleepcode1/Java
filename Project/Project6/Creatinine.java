public class Creatinine extends LaboratoryResults implements Interpretation,ReferenceRanges{
    private double serumCreatinine;
    private int patientAge;

    public void setSerumCreatinine(double serumCreatinine) {
        this.serumCreatinine = serumCreatinine;
    }
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }
    public double getSerumCreatinine() {
        return serumCreatinine;
    }
    public int getPatientAge() {
        return patientAge;
    }
    public Creatinine(){
        serumCreatinine = 0.0;
        patientAge = 1;
    }
    public Creatinine(double sCreatinine, int pAge){
        serumCreatinine = sCreatinine;
        patientAge = pAge;
    }
    public void printCreatinine(){
        System.out.println("Creatinine result:" + getSerumCreatinine() + " µmol/L");
        System.out.println("Patient age: " + getPatientAge());
    }

    @Override
    public void maleReferenceRanges() {
        System.out.println("The Reference Values for Men serum Creatinine 0.74-1.35 mg/dL");
    }

    @Override
    public void femaleReferenceRanges() {
        System.out.println("The Reference Values for Female serum Creatinine 0.59-1.04 mg/dL");
    }

    @Override
    public void firstImpression() {
        System.out.println("Pathologist find results unremarkable. Please refer any concerns to Nephrology.");
    }

    public String toString(){
        return "Creatinine result is " + serumCreatinine + " and patient age is " + patientAge;
    }
}
