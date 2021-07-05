package basic.objectoriented.feature.poj;

public class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        } else {
            return (income - 5000) * 0.2;
        }
    }
}
