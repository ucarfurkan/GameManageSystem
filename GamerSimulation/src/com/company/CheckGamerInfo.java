package com.company;

public class CheckGamerInfo {
    private Gamer gamer;

    public CheckGamerInfo(Gamer gamer) {
        this.gamer = gamer;
    }

    public void checkGamerInfoFromEdevlet(){
        System.out.println(gamer.getUserName() + " is checked.");
    }
}
