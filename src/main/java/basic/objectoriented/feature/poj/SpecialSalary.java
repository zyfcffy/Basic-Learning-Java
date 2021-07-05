package basic.objectoriented.feature.poj;

public class SpecialSalary extends Income {
    public SpecialSalary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}

