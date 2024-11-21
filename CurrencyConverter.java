import java.util.Scanner;
class CurrencyConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToInr = 82.0;
        double usdToEur = 0.93;
        double usdToGbp = 0.78;
        System.out.println("Available currencies: USD, INR, EUR, GBP");
        System.out.println("Enter the currency you want to convert from (e.g., USD): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.println("Enter the currency you want to convert to (e.g., INR): ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.println("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0.0;
        boolean validConversion = true;

        if (fromCurrency.equals("USD")) {
            switch (toCurrency) {
                case "INR":
                    convertedAmount = amount * usdToInr;
                    break;
                case "EUR":
                    convertedAmount = amount * usdToEur;
                    break;
                case "GBP":
                    convertedAmount = amount * usdToGbp;
                    break;
                default:
                    validConversion = false;
            }
        } else if (fromCurrency.equals("INR")) {
            switch (toCurrency) {
                case "USD":
                    convertedAmount = amount / usdToInr;
                    break;
                case "EUR":
                    convertedAmount = (amount / usdToInr) * usdToEur;
                    break;
                case "GBP":
                    convertedAmount = (amount / usdToInr) * usdToGbp;
                    break;
                default:
                    validConversion = false;
            }
        } else if (fromCurrency.equals("EUR")) {
            switch (toCurrency) {
                case "USD":
                    convertedAmount = amount / usdToEur;
                    break;
                case "INR":
                    convertedAmount = (amount / usdToEur) * usdToInr;
                    break;
                case "GBP":
                    convertedAmount = (amount / usdToEur) * usdToGbp;
                    break;
                default:
                    validConversion = false;
            }
        } else if (fromCurrency.equals("GBP")) {
            switch (toCurrency) {
                case "USD":
                    convertedAmount = amount / usdToGbp;
                    break;
                case "INR":
                    convertedAmount = (amount / usdToGbp) * usdToInr;
                    break;
                case "EUR":
                    convertedAmount = (amount / usdToGbp) * usdToEur;
                    break;
                default:
                    validConversion = false;
            }
        } else {
            validConversion = false;
        }

        if (validConversion) {
            System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, toCurrency);
        } else {
            System.out.println("Invalid currency conversion.");
        }

        scanner.close();
    }
}

