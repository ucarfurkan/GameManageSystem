package com.company;

public class CampaignManager implements BaseManager {
    private Campaign campaign;

    public CampaignManager(Campaign campaign) {
        this.campaign = campaign;
    }



    @Override
    public void add() {
        System.out.println(campaign.getCampaignName() + " is added.");
    }

    @Override
    public void update() {
        System.out.println(campaign.getCampaignName() + " is updated.");
    }

    @Override
    public void delete() {
        System.out.println(campaign.getCampaignName() + " is deleted.");
    }
}
