package credit;

public class Credit {
    double amount;
    double interest;
    double payment;
    double amountOfPayment;

    public Credit(double amount, double interest, double payment) {
        this.amount = amount;
        this.interest = interest;
        this.payment = payment;
        this.amountOfPayment = ((amount / payment * (payment / interest)));
    }
// использовал инт чтобы другое имя не писать в amountOfPayment
    public Credit(double amount, double interest, int amountOfPayment) {
        this.amount = amount;
        this.interest = interest;
        this.amountOfPayment = amountOfPayment;
        this.payment = (((amount - (amount / amountOfPayment)) * (interest / amountOfPayment) + amount) / amountOfPayment);
    }
}
