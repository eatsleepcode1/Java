public class CT extends ImagingResults implements ReferenceRanges,Interpretation{
    private int views;
    private String contrast;

    public void setViews(int views) {
        this.views = views;
    }
    public void setContrast(String contrast) {
        this.contrast = contrast;
    }
    public int getViews() {
        return views;
    }
    public String getContrast() {
        return contrast;
    }
    public CT(){
        String contrast = "Without Contrast";
        int views = 1;
    }
    public CT(String c, int v) {
        contrast = c;
        views = v;
    }
    public void displayCT(){
        System.out.println("The CT was done " + getContrast());
        System.out.println(getViews() + " views");
    }
    @Override
    public void femaleReferenceRanges() {
        System.out.println("Reference range for females show no inflammation with normal organ performance.");
    }
    public void maleReferenceRanges(){
        System.out.println("Reference range for males show no inflammation with normal organ performance");
    }
    @Override
    public void firstImpression() {
        System.out.println("Radiologist will give final interpretation at a final date.");
    }
    public String toString(){
        return "The CT was done " + contrast + " and the number of views are " + views;
    }
}
