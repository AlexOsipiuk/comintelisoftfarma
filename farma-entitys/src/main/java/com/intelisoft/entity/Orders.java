package com.intelisoft.entity;

import java.util.ArrayList;

public class Orders {
    private Integer id_order;
    private Integer number_order;
    private Pharmacies pharmacies;
    private Users users;

    private ArrayList<ItemOrders> itemOrders;

    public Orders() {
    }
}
