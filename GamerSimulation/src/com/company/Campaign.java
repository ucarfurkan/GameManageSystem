package com.company;

public class Campaign {
    private int id;
    private String campaignName;
    private double discountRate;
    private String campaignEndDate;

    public Campaign(int id, String campaignName, double discountRate, String campaignEndDate) {
        this.id = id;
        this.campaignName = campaignName;
        this.discountRate = discountRate;
        this.campaignEndDate = campaignEndDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getCampaignEndDate() {
        return campaignEndDate;
    }

    public void setCampaignEndDate(String campaignEndDate) {
        this.campaignEndDate = campaignEndDate;
    }
}
