package com.example.listaaja;

public class Item {
    public String name;


    public Item() {
        this("test");

    }

    public Item(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(int name) {
        this.name = String.valueOf(name);
    }



    public String getName() {
        return name;
    }

}