package com.smsys.sallon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private int phone;

    private LocalDate date;  // 2026-11-18

    private LocalTime time;  // 14:30

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL)
    private List<Service> services = new ArrayList<>();


    @PrePersist
    public void onCreate() {
        this.date = LocalDate.now();
        this.time = LocalTime.now().withSecond(0).withNano(0);
    }

}
