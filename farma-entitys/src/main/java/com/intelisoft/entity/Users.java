package com.intelisoft.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Column(name = "id_users")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "surnsme")
    private String surnsme;

    @Column(name = "phone_user")
    private Integer phoneUser;

    @Column(name = "character")
    private Boolean character;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<Orders> orders;

    public Users() {
    }

    public Users(Integer id, String surnsme, Integer phoneUser, Boolean character) {
        this.id = id;
        this.surnsme = surnsme;
        this.phoneUser = phoneUser;
        this.character = character;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurnsme() {
        return surnsme;
    }

    public void setSurnsme(String surnsme) {
        this.surnsme = surnsme;
    }

    public Integer getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(Integer phoneUser) {
        this.phoneUser = phoneUser;
    }

    public Boolean getCharacter() {
        return character;
    }

    public void setCharacter(Boolean character) {
        this.character = character;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pharmacies {");
        sb.append("Kod # ").append(id);
        sb.append(", Familia -  ").append(surnsme);
        sb.append(",  Telefon -  ").append(phoneUser);
        sb.append("Aktivacia ").append(character);
        sb.append('}');
        return sb.toString();
    }
}
