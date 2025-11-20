program-1:
Your app supports multiple payment options: , , and .
Each payment method must implement:
interface Payment {
boolean process(double amount);
}
Implement classes for each payment type.
For CreditCard, reject payments above ₹50,000.
For UPI, accept only if amount ≤ ₹1,00,000.
Test all payment methods in main().

Program-2:
A billing system needs a utility method to convert an amount from dollars to rupees (1 USD = 83 INR).
 Create an interface CurrencyConverter that contains:
An abstract method billAmount()
A static method dollarToInr(double amount) that returns converted INR value
Write a Java program that calls the static method using the interface name (not using object).

Program-3:
A notification service sends alerts through Email and SMS.
 To format the notification message, the interface should use a repeated helper code.
 Create an interface Notifier with:
An abstract method sendNotification(String msg)
A default method prepareAndSend(String msg)
A private method format(String msg) used inside the default method
Write a Java program where implementing classes call only prepareAndSend(), which internally uses the private method.