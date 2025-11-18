public class VacationCostCalculator{
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost){
        return accommodationCost + mealCost + activityCost;
    }
        public static void main(String[]args){
            double accommodation=800.25;
            double meals=350.50;
            double activities=300.00;
            double totalCost= calculateTotalCost(accommodation,meals,activities);
            System.out.println("Total Vacation Cost:$" + totalCost);
        }
}