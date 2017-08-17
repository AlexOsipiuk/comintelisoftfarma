package com.intelisoft.entity;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name = "order")
public class Orders {
    @Column(name = "id_order")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "number_order")
    private Integer number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pharmacies")
    private Pharmacies pharmacies;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_users")
    private Users users;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private ArrayList<ItemOrders> itemOrders;

    public Orders() {
    }

    public Orders(Integer id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Pharmacies getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(Pharmacies pharmacies) {
        this.pharmacies = pharmacies;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public ArrayList<ItemOrders> getItemOrders() {
        return itemOrders;
    }

    public void setItemOrders(ArrayList<ItemOrders> itemOrders) {
        this.itemOrders = itemOrders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orders {");
        sb.append("Zakaz # ").append(id);
        sb.append(" Nomer -  ").append(number);
        sb.append(";User # ").append(users);
        sb.append(";Apteka # ").append(pharmacies);
        sb.append('}');
        return sb.toString();
    }
}
