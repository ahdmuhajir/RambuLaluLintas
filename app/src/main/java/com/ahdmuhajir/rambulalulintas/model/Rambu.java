package com.ahdmuhajir.rambulalulintas.model;

/**
 * Created by ahdmuhajir on 19/05/17.
 */

public class Rambu {
    private int id;
    private String sign_group;
    private String number;
    private byte[] image;
    private String defenition;

    public Rambu(int id, String sign_group, String number, byte[] image, String defenition) {
        this.id = id;
        this.sign_group = sign_group;
        this.number = number;
        this.image = image;
        this.defenition = defenition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSign_group() {
        return sign_group;
    }

    public void setSign_group(String sign_group) {
        this.sign_group = sign_group;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDefenition() {
        return defenition;
    }

    public void setDefenition(String defenition) {
        this.defenition = defenition;
    }
}
