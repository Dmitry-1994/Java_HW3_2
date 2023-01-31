public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 68.3f;
        float height = 1.73f;
        System.out.println("Индекс массы тела составляет " + service.calculate(weight, height) + " кг/m^2");
    }
}
