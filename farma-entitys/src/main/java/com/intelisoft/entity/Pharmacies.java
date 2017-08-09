package com.intelisoft.entity;

import java.util.ArrayList;

public class Pharmacies {
    private Integer id_pharmacies;
    private String name_pharma;
    private Float house_number;
    private Integer phone;
    private Street street;

    private ArrayList<Orders> orders;
    private ArrayList<Depot> depots;

    public Pharmacies() {
    }
}
