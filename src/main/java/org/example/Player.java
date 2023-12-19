package org.example;

public class Player {
    private Integer id = 0;
    private String name;
    private String position;

    public Player() {
        this.id += 1;
        this.name = ConsoleInput.getName();
        if (id == 1){
            this.position = PositionsPlayer.X.toString();
        }else {
            this.position = PositionsPlayer.O.toString();
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void go()
    {
        int a = ConsoleInput.getPosition();
        Field.setPosition(a, this.getPosition());
    }
}
