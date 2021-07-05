package basic.objectoriented.feature;

import basic.objectoriented.feature.poj.*;

/*
 * 多态
 * 多态是指，针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法
 *
 * */
/*
 * 收入：<5000 income * 0.1
 * >5000 (income - 5000) * 0.2
 * 津贴补助，不交税
 * */
public class Polymorphic {
    public static void main(String[] args) {
        Person p = new Student();  // 实际的实例是Student的实例
        p.work();  // 打印的是 Student的上学

        Income[] incomes = new Income[]{
                new Income(3000),  //3000 * 0.1 = 300.0
                new Salary(7500),  //(7500 - 5000) * 0.2 = 500.0
                new SpecialSalary(10000)  //0
        };
        System.out.println(totalIncome(incomes));
    }

    // totalIncome方法只用和Income打交道，不用关心子类的实现是什么样
    public static double totalIncome(Income... incomes) {
        double total = 0 ;
        for (Income income : incomes){
            total = total + income.getTax();
        }
        return total;
    }
}
