package com.intelisoft.entity;

import javax.persistence.*;

@Entity
@Table(name = "depot")
public class Depot {
    @Column(name = "id_depot")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDepot;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pharmacies")
    private Pharmacies pharmacies;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_drugs")
    private Drugs drugs;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Float price;

    @Column(name = "presence_of")
    private Boolean presenceOf;

    public Depot(Integer idDepot, Pharmacies pharmacies, Drugs drugs, Integer quantity, Float price, Boolean presenceOf) {
        this.idDepot = idDepot;
        this.pharmacies = pharmacies;
        this.drugs = drugs;
        this.quantity = quantity;
        this.price = price;
        this.presenceOf = presenceOf;
    }

    public Integer getIdDepot() {
        return idDepot;
    }

    public void setIdDepot(Integer idDepot) {
        this.idDepot = idDepot;
    }

    public Pharmacies getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(Pharmacies pharmacies) {
        this.pharmacies = pharmacies;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getPresenceOf() {
        return presenceOf;
    }

    public void setPresenceOf(Boolean presenceOf) {
        this.presenceOf = presenceOf;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Depot {");
        sb.append("Depo # ").append(idDepot);
        sb.append(". Apteka # ").append(pharmacies);
        sb.append(". Lekarstvo # ").append(drugs);
        sb.append(". Kollichestvo - ").append(quantity);
        sb.append(", Cena$ - ").append(price);
        sb.append(", Nalichie - ").append(presenceOf);
        sb.append('}');
        return sb.toString();
    }
}
