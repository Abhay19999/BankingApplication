package scotiaBank_banking_web_application.service;

public interface IBasicAccountServices {

    //To eTransfer the Amount
    public abstract double eTransfer(double eTransferAmount);


    //To check account balance
    public abstract double checkAccountBalance();
}

