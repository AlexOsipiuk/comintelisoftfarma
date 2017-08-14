package com.intelisoft.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id_city")
    private Integer idCity;

    @Column(name = "name_city")
    private String nameCity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
    private List<Street> streets;

    public City() {
    }

    public City(Integer idCity, String nameCity) {
        this.idCity = idCity;
        this.nameCity = nameCity;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
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
        sb.append("index - ").append(idCity);
        sb.append(", City - ").append(nameCity);
        sb.append('}');
        return sb.toString();
    }
}
