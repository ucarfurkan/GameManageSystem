package com.company;

public class SalesOperation {
    private Gamer gamer;
    private Game game;
    private Campaign campaign;

    public SalesOperation(Gamer gamer,Game game, Campaign campaign) {
        this.gamer = gamer;
        this.game = game;
        this.campaign = campaign;
    }

    public void sellGame(){
        double discountedPrice = game.getGamePrice() - (game.getGamePrice() * (campaign.getDiscountRate() / 100));
        System.out.println(gamer.getUserName() + " bought " + game.getGameName() + " for " + discountedPrice);
    }


}
