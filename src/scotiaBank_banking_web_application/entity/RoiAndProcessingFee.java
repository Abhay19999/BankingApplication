package scotiaBank_banking_web_application.entity;

public class RoiAndProcessingFee {
   private double rateOfInterest;
   private String processingFee;

    public RoiAndProcessingFee(double rateOfInterest, String processingFee) {
        this.rateOfInterest = rateOfInterest;
        this.processingFee = processingFee;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(String processingFee) {
        this.processingFee = processingFee;
    }
}
