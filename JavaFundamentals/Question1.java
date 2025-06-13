public class Question1 {
    public static void main(String[] args) {
        int cost_price = 129;
        int selling_price = 191;
        int profit = selling_price - cost_price;
        double profit_perc = ((double)profit / cost_price) * 100;

        System.out.println("The Cost Price is " + cost_price + " INR\nand the Selling Price is " + selling_price + " INR\nThe Profit is " + profit + " INR\nand the Profit Percentage is " + profit_perc + "%");
    }
    
}
