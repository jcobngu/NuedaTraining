public class MortgageAttributes {

    private String address;
    private String customer;
    private String closingDate;
    private double basePropertyValue;
    private double downPayment;
    private double monthlyPayment;
    private long mortgageID;

    private int lengthOfLoan; // years
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public double getBasePropertyValue() {
        return basePropertyValue;
    }

    public void setBasePropertyValue(double basePropertyValue) {
        this.basePropertyValue = basePropertyValue;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public long getMortgageID() {
        return mortgageID;
    }

    public void setMortgageID(long mortgageID) {
        this.mortgageID = mortgageID;
    }

    public int getLengthOfLoan() {
        return lengthOfLoan;
    }

    public void setLengthOfLoan(int lengthOfLoan) {
        this.lengthOfLoan = lengthOfLoan;
    }


}
