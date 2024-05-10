package com.ra.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "category_name",length = 50)
    private String categoryName;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Boolean status;

}
