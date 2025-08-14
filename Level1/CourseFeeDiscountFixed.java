public class CourseFeeDiscountFixed{
     public static void courseFeeDiscountFixed() {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
    public static void main(String[] args){
        courseFeeDiscountFixed();
    }
}