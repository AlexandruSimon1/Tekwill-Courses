package TekwillCourses.HomeWork16October.Customer;

public class DiscountRate {
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;
    double productDiscountPremium = 0.1;
    double productDiscountGold = 0.1;
    double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type) {
        return serviceDiscountGold + serviceDiscountPremium + serviceDiscountSilver;
    }

    public double getProductDiscountRate(String type) {
        return productDiscountPremium + productDiscountGold + productDiscountSilver;
    }
}
