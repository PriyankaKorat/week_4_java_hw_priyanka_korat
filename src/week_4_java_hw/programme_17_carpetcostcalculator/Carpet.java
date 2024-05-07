package week_4_java_hw.programme_17_carpetcostcalculator;

/**
 * Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getCost without any parameters, it needs to return the value of cost field.
 */
public class Carpet {
        double cost;

    public Carpet(double cost) {
        this.cost = cost;
        if (cost < 0) {
            System.out.println(0);
        }
    }

    public double getCost() {
        return cost;
    }
}
