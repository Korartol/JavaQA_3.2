public class BmiService {
    public double data(double weight, double growth) {
        double calculate = weight / (growth * growth);
        return calculate;
    }

}
