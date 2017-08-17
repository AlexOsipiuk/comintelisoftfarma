package com.intelisoft.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "street")
public class Street {
    @Column(name = "id_street")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_street")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "street")
    private List<Pharmacies> pharmacies;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_city")
    private City city;

    public Street() {
    }

    public Street(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Pharmacies> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(List<Pharmacies> pharmacies) {
        this.pharmacies = pharmacies;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Street {");
        sb.append("Nomer # ").append(id);
        sb.append(" Ulica - ").append(name);
        sb.append('}');
        return sb.toString();
    }
}
