package com.metech.medtechsystem.modles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="users_tables")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private long userId;

    @Column(name="USERNAME", nullable = false)
    private String username;
    
    @Column(name="PWHASH", nullable = false)
    private String pwHash;

    @Column(name = "HNI", nullable = false)
    private String nhi;
 
 }
