package com.jamila.gestionDeStock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass()
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @JsonIgnore
    @Column(name="createdDate",nullable = false)
    private Date createdDate;

    @JsonIgnore
    @LastModifiedDate
    @Column(name="lastModifiedDate",nullable = false)
    private Date lastModifiedDate;

}
