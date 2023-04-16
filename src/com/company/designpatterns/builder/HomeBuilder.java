package com.company.designpatterns.builder;

public class HomeBuilder implements Builder<Home>{
    @Override
    public Builder<Home> addWall() {
        return null;
    }

    @Override
    public Builder<Home> addDoor() {
        return null;
    }

    @Override
    public Builder<Home> addGarage() {
        return null;
    }

    @Override
    public Builder<Home> addGarden() {
        return null;
    }

    @Override
    public Builder<Home> reset() {
        return null;
    }

    @Override
    public Home getResult() {
        return null;
    }
}
