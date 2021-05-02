package com.company;

public class GamerManager implements BaseManager {
    private Gamer gamer;

    public GamerManager(Gamer gamer) {
        this.gamer = gamer;
    }

    @Override
    public void add() {
        System.out.println(gamer.getUserName() + " is added.");
    }

    @Override
    public void update() {
        System.out.println(gamer.getUserName() + " is updated.");
    }

    @Override
    public void delete() {
        System.out.println(gamer.getUserName() + " is deleted.");
    }
}
