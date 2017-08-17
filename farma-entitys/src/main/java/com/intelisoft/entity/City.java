package com.intelisoft.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id_city")
    private Integer id;

    @Column(name = "name_city")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<Street> streets;

    public City() {
    }

    public City(Integer idCity, String nameCity) {
        this.id = idCity;
        this.name = nameCity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer idCity) {
        this.id = idCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameCity) {
        this.name = nameCity;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City {");
        sb.append("index - ").append(id);
        sb.append(", City - ").append(name);
        sb.append('}');
        return sb.toString();
    }
}
