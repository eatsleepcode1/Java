//In a new class, implement three methods that will each calculate and return the average of an array of numeric values that 
//is passed in as an argument.
public class CalculateAverages {
    public double arrayAverages(int[] arrayVal){
        int sum = 0;
        for (int i = 0; i < arrayVal.length; i++)
            sum += arrayVal[i];
        double average = (double) sum / arrayVal.length;
        return average;
    }
    public double arrayAverages(Double[] arrayVal){
        int sum = 0;
        for (int i = 0; i < arrayVal.length; i++)
            sum += arrayVal[i];
        double average = (double) sum / arrayVal.length;
        return average;
    }
    public double arrayAverages(String[] arrayVal){
        String sum = String.valueOf(0);
        for (int i = 0; i < arrayVal.length; i++)
            sum += arrayVal[i];

        double average;
        average = Double.parseDouble(sum) / arrayVal.length;
        return average;
    }

    public static void main(String[] args) {
        DisplayShapes displayShapes = new DisplayShapes();

        displayShapes.rectanglePrintInfo();
        displayShapes.circlePrintInfo();
        displayShapes.printShapesTypes();
        displayShapes.printShapesTotal();
        System.out.println();
        
        CalculateAverages calculateAverages = new CalculateAverages();
        int[] arrayVal = {100, 200, 300};
        System.out.println(calculateAverages.arrayAverages(arrayVal));
        int[] myArrayVal = {400, 500, 600, 700};
        System.out.println(calculateAverages.arrayAverages(myArrayVal));

        Double[] doubleValueArray = {2.0, 4.0, 6.0, 8.0, 10.0};
        System.out.println(calculateAverages.arrayAverages(doubleValueArray));
        Double[] myDoubleValueArray = {12.0, 14.0, 16.0, 20.0, 22.0, 24.0};
        System.out.println(calculateAverages.arrayAverages(myDoubleValueArray));

        String[] stringValueArray = {"1.0", "3.0", "5.0", "7.0", "9.0", "11.0", "13.0", "15.0", "17.0", "19.0"};
        System.out.println(calculateAverages.arrayAverages(stringValueArray));
        String[] myStringValueArray = {"1.0", "3.0", "5.0", "7.0", "9.0", "11.0", "13.0", "15.0", "17.0", "19.0", "21.0"};
        System.out.println(calculateAverages.arrayAverages(myStringValueArray));
    }
}
