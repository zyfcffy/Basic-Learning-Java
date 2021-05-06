package Basic.ObjectOrientedBasic.feature.poj;

import Basic.ObjectOrientedBasic.feature.poj.Income;

public class SpecialSalary extends Income {
    public SpecialSalary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}

