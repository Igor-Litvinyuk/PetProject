package com.example.petproject.model;

import javax.persistence.*;

@Entity
@Table(name = "billiard_cues_pyramid")
public class BilliardCuesPyramid {

    @Id
    @Column(name = "Номер")
    private Integer id;

    @Column(name = "Кий")
    private String cue;

    @Column(name = "Дерево")
    private String tree;

    @Column(name = "Запил")
    private String saw;

    @Column(name = "Вес")
    private String weight;

    @Column(name = "Стакан")
    private String glass;

    @Column(name = "Наклейка")
    private String sticker;

    @Column(name = "Длина")
    private String length;

    @Column(name = "Инкрустация")
    private String incrustation;

    @Column(name = "Производитель")
    private String producer;

    @Column(name = "Цена")
    private String price;

    @Column(name = "Статус")
    private String status;

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

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}