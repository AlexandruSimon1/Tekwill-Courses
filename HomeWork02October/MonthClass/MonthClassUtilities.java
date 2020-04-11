package TekwillCourses.HomeWork02October.MonthClass;

public class MonthClassUtilities {
    private int monthNumber;
    private String monthName;

    MonthClassUtilities() {
        monthNumber = 1;
    }

    MonthClassUtilities(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else
            this.monthNumber = monthNumber;
    }

    MonthClassUtilities(String monthName) {
        switch (monthName) {
            case "January":
                this.monthNumber = 1;
                break;
            case "February":
                this.monthNumber = 2;
                break;
            case "March":
                this.monthNumber = 3;
                break;
            case "April":
                this.monthNumber = 4;
                break;
            case "May":
                this.monthNumber = 5;
                break;
            case "June":
                this.monthNumber = 6;
                break;
            case "July":
                this.monthNumber = 7;
                break;
            case "August":
                this.monthNumber = 8;
                break;
            case "September":
                this.monthNumber = 9;
                break;
            case "October":
                this.monthNumber = 10;
                break;
            case "November":
                this.monthNumber = 11;
                break;
            case "December":
                this.monthNumber = 12;
                break;
            default:
                System.out.println("Wrong month");
                break;

        }
    }
    //MonthClassUtilities(int monthNumber){
      //  switch (monthNumber){
        //    case monthNumber=1:
          //      "January";
            //    break;
    //    }
  //  }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else
            this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    @Override
    public String toString() {
        return "The number of month is " + monthNumber;
    }
}
