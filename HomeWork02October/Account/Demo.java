package TekwillCourses.HomeWork02October.Account;

public class Demo {
    public static void main(String[] args) {
        AccountUtilities account = new AccountUtilities(1122,20000);

        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account Statement");
        System.out.println(account.getId());
        System.out.println(account.getDateCreated());
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterestRate());
    }
}
