package HW;

public class Example {

    public static void main(String[] args) {
    	Example A = new Example();
    	A.Cost_College();
    }
    
    public void Cost_College() {
        double tuitionPerYear = 1000.0;
        double rate = 0.05;
        double totalCost = 0.0;

        for (int i = 1; i <= 14; i++) {

            tuitionPerYear += tuitionPerYear * rate;

            if (i == 10) {
               
                System.out.printf("The cost of tuition in 10 years is $%.2f%n",
                    tuitionPerYear);
            }
            if (i > 10) {
                totalCost = totalCost + tuitionPerYear;
            }
        }

        System.out.printf("The total cost of 4 years tuition in 10 years is $%.2f%n",
            totalCost);
    }

}