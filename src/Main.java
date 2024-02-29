public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.80;
        int weight = 86;
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}