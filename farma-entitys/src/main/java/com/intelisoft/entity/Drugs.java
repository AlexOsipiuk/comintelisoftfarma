package com.intelisoft.entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "drugs")
public class Drugs {
    @Column(name = "id_drugs")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_drugs")
    private String name;

    @Column(name = "release_form")
    private String releaseForm;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "recipe")
    private Boolean recipe;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "drugs")
    private List<Depot> depot;

    public Drugs() {
    }

    public Drugs(Integer id, String name, String releaseForm, String manufacturer, Boolean recipe) {
        this.id = id;
        this.name = name;
        this.releaseForm = releaseForm;
        this.manufacturer = manufacturer;
        this.recipe = recipe;
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

    public String getReleaseForm() {
        return releaseForm;
    }

    public void setReleaseForm(String releaseForm) {
        this.releaseForm = releaseForm;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Boolean getRecipe() {
        return recipe;
    }

    public void setRecipe(Boolean recipe) {
        this.recipe = recipe;
    }

    public List<Depot> getDepot() {
        return depot;
    }

    public void setDepot(List<Depot> depot) {
        this.depot = depot;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drugs {");
        sb.append("Lekarstvo # ").append(id);
        sb.append("Nazvanie -  ").append(name);
        sb.append("Forma otpuska  ").append(releaseForm);
        sb.append(";  Proizvodstvo - ").append(manufacturer);
        sb.append("; Recept - ").append(recipe);
        sb.append('}');
        return sb.toString();
    }
}
