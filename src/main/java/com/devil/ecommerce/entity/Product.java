package com.devil.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
 private Long id;
    @Column(name = "sku")
 private String sku;
    @Column(name = "name")
 private String name;
    @Column(name = "description")
 private String description;
    @Column(name = "unitPrice")
 private BigDecimal unitPrice;
    @Column(name = "imageUrl")
 private String imageUrl;
    @Column(name = "active")
 private boolean active;
    @Column(name = "unitsInStock")
 private int unitsInStock;
    @Column(name = "dateCreated")
    @CreationTimestamp
 private Date dateCreated;
    @Column(name = "lastUpdated")
    @UpdateTimestamp
 private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory category;
}
