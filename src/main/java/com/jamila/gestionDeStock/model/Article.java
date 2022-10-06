package com.jamila.gestionDeStock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="article")
public class Article extends AbstractEntity{

    @Column(name="codeArticle")
    private String codeArticle;

    @Column(name="designationArticle")
    private String designationArticle;

    @Column(name="prixUnitaireHt")
    private BigDecimal prixUnitaireHt;

    @Column(name="tauxTVA")
    private BigDecimal tauxTVA;

    @Column(name="prixUnitaireTTC")
    private BigDecimal prixUnitaireTTC;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie;

}
