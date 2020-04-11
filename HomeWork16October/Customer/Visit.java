package TekwillCourses.HomeWork16October.Customer;

import java.util.Date;

public class Visit {
    Customer customer;
    Date date;
    double serviceExpensive;
    double productExpensive;

    Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }


    public Date getDate() {
        return date;
    }

    public double getServiceExpensive() {
        return serviceExpensive;
    }

    public void setServiceExpensive(double serviceExpensive) {
        this.serviceExpensive = serviceExpensive;
    }

    public double getProductExpensive() {
        return productExpensive;
    }

    public void setProductExpensive(double productExpensive) {
        this.productExpensive = productExpensive;
    }

    public double getTotalExpensive() {
        return serviceExpensive + productExpensive;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpensive=" + serviceExpensive +
                ", productExpensive=" + productExpensive +
                '}';
    }
}
