package com.example.listaaja;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Item> items = new ArrayList<>();

    private static Storage storage = null;

    private Storage() {
    }

    public static Storage getInstance() {
        if(storage == null) {
            storage = new Storage();
        }
        return storage;
    }
    public ArrayList<Item> getitems() {
        return items;
    }
    public void addItem(Item item) {
        items.add(item);
    }



}
