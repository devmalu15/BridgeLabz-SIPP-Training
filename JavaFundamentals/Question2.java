public class Question2 {
    public static void main(String[] args) {
        int fee = 125000;
        double discount_rate = 10;
        double discounted_fee = (discount_rate / 100) * fee;
        double payable_fee = fee - discounted_fee;
        System.out.println(" The discount amount is INR " +  discounted_fee  + " and final discounted fee is INR " + payable_fee);
    }
    
}
