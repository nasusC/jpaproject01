package com.ict01.jpaproject01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // AUTO = hivernate가 자동으로 설정해줌
    // IDENTITY = mysql
    // Sequence = oracle
    private int id;

    @Column(length = 30) // 행의 길이 30
    private String name;

    @Column(length = 30)
    private String email;

    @Column(length = 100)
    private String address;
}
