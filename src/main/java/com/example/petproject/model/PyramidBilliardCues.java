package com.example.petproject.model;

import javax.persistence.*;

@Entity
public class PyramidBilliardCues {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String cue;
    private String tree;
    private String saw;
    private String weight;
    private String ferule;
    private String sticker;
    private String length;
    private String incrustation;
    private String producer;
    private String price;
    private String state;

    public PyramidBilliardCues() {
    }

    public PyramidBilliardCues(String cue, String tree, String saw, String weight, String ferule,
                               String sticker, String length, String incrustation, String producer, String price, String state) {
        this.cue = cue;
        this.tree = tree;
        this.saw = saw;
        this.weight = weight;
        this.ferule = ferule;
        this.sticker = sticker;
        this.length = length;
        this.incrustation = incrustation;
        this.producer = producer;
        this.price = price;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCue() {
        return cue;
    }

    public void setCue(String cue) {
        this.cue = cue;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getSaw() {
        return saw;
    }

    public void setSaw(String saw) {
        this.saw = saw;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFerule() {
        return ferule;
    }

    public void setFerule(String ferule) {
        this.ferule = ferule;
    }

    public String getSticker() {
        return sticker;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getIncrustation() {
        return incrustation;
    }

    public void setIncrustation(String incrustation) {
        this.incrustation = incrustation;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
