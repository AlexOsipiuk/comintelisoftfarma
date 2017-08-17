package com.intelisoft.entity;

import org.hibernate.criterion.Order;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "pharmacies")
public class Pharmacies {
    @Id
    @Column(name = "id_pharmacies")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_pharma")
    private String name;

    @Column(name = "house_number")
    private Float houseNumber;

    @Column(name = "phone")
    private Integer phone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacies")
    private List<Order> orders;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pharmacies")
    private List<Depot> depots;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_street")
    private Street street;

    public Pharmacies() {
    }

    public Pharmacies(Integer id, Street street, String name, Float houseNumber, Integer phone) {
        this.id = id;
        this.street = street;
        this.name = name;
        this.houseNumber = houseNumber;
        this.phone = phone;
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

    public Float getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Float houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Depot> getDepots() {
        return depots;
    }

    public void setDepots(List<Depot> depots) {
        this.depots = depots;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pharmacies {");
        sb.append("Apteka # ").append(id);
        sb.append("Nazvanie -  ").append(name);
        sb.append("Ulica -  ").append(street);
        sb.append(" dom ").append(houseNumber);
        sb.append(";  Telefon - ").append(phone);
        sb.append('}');
        return sb.toString();
    }
}
