package com.serifgungor.tabfragmentkullanimi.Model;

public class Konu {
    private int id;
    private String konuAdi;

    public Konu() {
    }

    public Konu(int id, String konuAdi) {
        this.id = id;
        this.konuAdi = konuAdi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKonuAdi() {
        return konuAdi;
    }

    public void setKonuAdi(String konuAdi) {
        this.konuAdi = konuAdi;
    }
}
