public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75;
        double growth = 1.75;
        double imt = service.data(weight, growth);
        System.out.println("Ваш Индекс массы тела = " + imt);

    }
}
/*
Формула рассчета ИМТ = масса тела / квадрат роста
 */