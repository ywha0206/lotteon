package com.lotteon.entity.product;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_detail")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prod_manufacture")
    private String manufacture;

    @Column(name = "prod_id")
    private Long productId;

    @Column(name = "prod_madein")
    private String madein;

    @Column(name = "prod_caution")
    private String caution;

    @Column(name = "prod_mdate")
    private Timestamp mdate;

    @Column(name = "prod_warranty")
    private int warranty;

    @Column(name = "prod_warranty_type")
    private Boolean warrantyType;

    @Column(name = "prod_description")
    private String description;

    @Column(name = "prod_stat")
    private String stat;

    @Column(name = "prod_tax")
    private Boolean tax;

    @Column(name = "prod_origin")
    private String origin;
}
