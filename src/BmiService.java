public class BmiService {
    public int calculate(int weight, double height) {
        height = height * height;
        double myIndexDouble = (weight / height);
        int myIndex = (int) myIndexDouble;
        return myIndex;
    }
}