package com.tutorial;


public class Adjudicate {

	private String policyNumber;
	private String policyHolder;
    private String claimAmount;
    private String outcome;
    private static final String template = "Policy Number: %s, Policy Holder: %s, Claim Amount: %s, And the result is, %s";
    
    public Adjudicate(){};
    
    public Adjudicate(String policyNumber, String policyHolder, String claimAmount) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.claimAmount = claimAmount;
    }

    public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}

	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

    public String getOutcome() {
    	this.outcome = String.format(template, policyNumber, policyHolder, claimAmount, "Approved");
    	return outcome;
    }

	public String getPolicyNumber() {
		return policyNumber;
	}


	public String getPolicyHolder() {
		return policyHolder;
	}


	public String getClaimAmount() {
		return claimAmount;
	}

}
