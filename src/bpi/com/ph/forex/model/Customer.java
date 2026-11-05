package bpi.com.ph.forex.model;

public class Customer {
    //input instance variables (owned by the object)
    public String name; //default value is null
    public String currencySelected; //default value is null
    public double pesoAmount; //default value is 0.0

    //computed instance variables (owned by the object)
    public double convertedAmount;//default value is 0.0
    public String currencyEquivalent; //default value is null;
    public boolean isValid; //default value is false

    public void convertAmount() {
        isValid = true;

        //process
        switch(currencySelected) {
            case "1":
                convertedAmount = pesoAmount / 64.35;
                currencyEquivalent = "USD$";
                break;
            case "2":
                convertedAmount = pesoAmount / 73.3531;
                currencyEquivalent = "€";
                break;

            case "3":
                convertedAmount = pesoAmount / 0.4166;
                currencyEquivalent = "¥";
                break;
            case "4":
                convertedAmount = pesoAmount / 46.1469;
                currencyEquivalent = "AUD$";
                break;
            default:
                isValid = false;
                break;
        }
    }
}

