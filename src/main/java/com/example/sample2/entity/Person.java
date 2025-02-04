package com.example.sample2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "person")
public class Person extends BaseTime {

    @Column(name = "name")
    private String name;

    private Integer age;

    private String mobile;
}
