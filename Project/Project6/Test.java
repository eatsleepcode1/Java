public class Test {
    public static void main(String[] args) {

        LaboratoryResults laboratoryResults = new LaboratoryResults("Not Applicable","Done");
        Creatinine creatinine = new Creatinine(0.90,82);
        creatinine.setFirstName("Wonder");
        creatinine.setLastName("Woman");
        creatinine.setDateOfBirth("10/21/1941");
        creatinine.printPatient();
        System.out.println(laboratoryResults.toString());
        creatinine.femaleReferenceRanges();
        System.out.println(creatinine.toString());
        creatinine.firstImpression();
        System.out.println("Test charge is " + laboratoryResults.resultCharge());
        ImagingResults imagingResults = new ImagingResults("Done","Not Applicable");
        System.out.println(imagingResults.toString());
        System.out.println("Image charges are " + imagingResults.resultCharge());
        CT ct = new CT("Without Contrast", 2);
        System.out.println(ct.toString());
        ct.femaleReferenceRanges();
        ct.firstImpression();

        System.out.println();

        LaboratoryResults laboratoryResults1 = new LaboratoryResults("Done","Not Applicable");
        CBC cbc = new CBC(9.0,5.5,15.0,45.0,337,13.2);
        ImagingResults imagingResults1 = new ImagingResults("Not Applicable","Done");
        cbc.setFirstName("Captain");
        cbc.setLastName("America");
        cbc.setDateOfBirth("07/04/1920");
        cbc.printPatient();
        System.out.println(laboratoryResults1.toString());
        cbc.maleReferenceRanges();
        cbc.mCV(45.0,5.5);
        cbc.mCH(15.0,5.5);
        cbc.mCHC(15.0,45.0);
        cbc.displayCBC();
        cbc.firstImpression();
        System.out.println("Test charge is " + laboratoryResults1.resultCharge());
        System.out.println(cbc.toString());
        imagingResults1.displayImagingResults();
        MRI mri = new MRI("Brain","Concussion");
        mri.maleReferenceRanges();
        mri.firstImpression();
        System.out.println(mri.toString());
        System.out.println("Imaging test charge is " + imagingResults1.resultCharge());
    }
}
