package com.intelisoft.entity;

import javax.persistence.*;

@Entity
@Table(name = "item_order")
public class ItemOrders {
    @Column(name = "id_item_order")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "count_drugs")
    private Integer countDrugs;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orders")
    private Orders orders;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users")
    private Users users;

    public ItemOrders() {
    }

    public ItemOrders(Integer id, Integer countDrugs) {
        this.id = id;
        this.countDrugs = countDrugs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountDrugs() {
        return countDrugs;
    }

    public void setCountDrugs(Integer countDrugs) {
        this.countDrugs = countDrugs;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orders {");
        sb.append("Zakaz # ").append(id);
        sb.append(" Nomer zakaza -  ").append(countDrugs);
        sb.append('}');
        return sb.toString();
    }
}
