package com.company;

public class Main {

    public static void main(String[] args) {
        Gamer gamer1 = new Gamer(1,"Furkan","Uçar",1111,"050902","furkanucar");
        GamerManager gamerManager = new GamerManager(gamer1);
        System.out.println("Add Gamer");
        gamerManager.add();
        System.out.println("Update Gamer");
        gamerManager.update();
        System.out.println("Delete Gamer");
        gamerManager.delete();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");

        Campaign campaign1 = new Campaign(1,"Summar Discount",20,"100521");
        CampaignManager campaignManager = new CampaignManager(campaign1);
        System.out.println("Add Campaign");
        campaignManager.add();
        System.out.println("Update Campaign");
        campaignManager.update();
        System.out.println("Delete Campaign");
        campaignManager.delete();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");

        CheckGamerInfo checkGamerInfo = new CheckGamerInfo(gamer1);
        checkGamerInfo.checkGamerInfoFromEdevlet();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");

        Game game1 = new Game(1,"Age of Empires II",30);
        SalesOperation salesOperation = new SalesOperation(gamer1,game1,campaign1);
        salesOperation.sellGame();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");

    }
}
