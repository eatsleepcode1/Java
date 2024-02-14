public class CBC extends LaboratoryResults implements ReferenceRanges,Interpretation{
    private double wBC;
    private double rBC;
    private double hemoglobin;
    private double hematocrit;
    private double plateletCount;
    private double rDW;

    public void setWBC(double wBC) {
        this.wBC = wBC;
    }
    public void setRBC(double rBC) {
        this.rBC = rBC;
    }
    public void setHemoglobin(double hemoglobin) {
        this.hemoglobin = hemoglobin;
    }
    public void setHematocrit(double hematocrit) {
        this.hematocrit = hematocrit;
    }
    public void setPlateletCount(double plateletCount) {
        this.plateletCount = plateletCount;
    }
    public void setRDW(double rDW) {
        this.rDW = rDW;
    }
    public double getWBC() {
        return wBC;
    }
    public double getRBC() {
        return rBC;
    }
    public double getHemoglobin() {
        return hemoglobin;
    }
    public double getHematocrit() {
        return hematocrit;
    }
    public double getPlateletCount() {
        return plateletCount;
    }
    public double getRDW() {
        return rDW;
    }
    public double mCV(double hematocrit, double rBC){
        double mcv = (hematocrit / rBC) * 10;
       return mcv;
    }
    public double mCH(double hemoglobin, double rBC){
        double mch = (hemoglobin / rBC) * 10;
        return mch;
    }
    public double mCHC(double hemoglobin, double hematocrit){
        double mchc = (hemoglobin / hematocrit) * 100;
        return mchc;
    }
    public CBC(double whiteBloodCount, double redBloodCount, double hgb, double hct, double plt, double redDW){
        wBC = whiteBloodCount;
        rBC = redBloodCount;
        hemoglobin = hgb;
        hematocrit = hct;
        rDW = redDW;
        plateletCount = plt;

    }
    public void displayCBC(){
        System.out.println(" Complete Blood Count results: ");
        System.out.println("  White Blood Cell count: " + getWBC() + " cells/L");
        System.out.println("  Red Blood Cell count: " + getRBC() + " cells/L");
        System.out.println("  Hemoglobin: " + getHemoglobin() + " gm/dL");
        System.out.println("  Hematocrit: " + getHematocrit() + " %");
        System.out.println("  MCV: " + mCV(hematocrit, rBC) + " femtoliter");
        System.out.println("  MCH: " + mCH(hemoglobin, rBC) + " pg");
        System.out.println("  MCHC: " + mCHC(hemoglobin,hematocrit) + " g/dL");
        System.out.println("  RDW: " + getRDW() + " %");
        System.out.println("  Platelet: " + getPlateletCount() + " cells/L");
    }
    @Override
    public void femaleReferenceRanges() {
        System.out.println("Reference Values of Female Complete Blood Count: ");
        System.out.println(" White Blood Cell count: 3.0-10.0 cells/L");
        System.out.println(" Red Blood Cell count: 4.0-5.0 cells/L");
        System.out.println(" Hemoglobin: 12.0 gm/dL");
        System.out.println(" Hematocrit:  %");
        System.out.println(" MCV: 80-100 femtoliter");
        System.out.println(" MCH: 28-34 pg");
        System.out.println(" MCHC: 32-36 g/dL");
        System.out.println(" RDW: 12-14.6 %");
        System.out.println(" Platelet: 145-400 cells/L");
    }

    @Override
    public void maleReferenceRanges() {
        System.out.println("Reference Values of Male Complete Blood Count: ");
        System.out.println(" White Blood Cell count: 4.5-11.0 cells/L");
        System.out.println(" Red Blood Cell count: 4.5-5.5 cells/L");
        System.out.println(" Hemoglobin: 14-17.4 gm/dL");
        System.out.println(" Hematocrit: 42-52 %");
        System.out.println(" MCV: 80-100 femtoliter");
        System.out.println(" MCH: 28-34 pg");
        System.out.println(" MCHC: 32-36 g/dL");
        System.out.println(" RDW: 12-14.6 %");
        System.out.println(" Platelet: 150-400 cells/L");
    }

    @Override
    public void firstImpression() {
        System.out.println("No critical low Hemoglobin, Hematocrit, and Platelet count found.");
        System.out.println("Hematologist will give final interpretation at later date.");
    }
    public String toString(){
        return "The CBC hemoglobin is " + hemoglobin + " gm/dL and platelet count is " + plateletCount + " billion/L";
    }
}
