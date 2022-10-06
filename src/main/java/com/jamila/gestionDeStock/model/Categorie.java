package com.jamila.gestionDeStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="categorie")
public class Categorie extends AbstractEntity{

    @Column(name="codeCategorie")
    private String codeCategorie;

    @Column(name="designationCategorie")
    private String designationCategorie;

    @OneToMany(mappedBy="categorie")
    private List<Article> articles;

}
