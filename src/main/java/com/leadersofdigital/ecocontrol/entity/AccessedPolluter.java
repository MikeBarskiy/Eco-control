package com.leadersofdigital.ecocontrol.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Data
public class AccessedPolluter {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(columnDefinition = "TEXT")
    private String name;

    @NotNull
    private String inn;

    @Column(columnDefinition = "TEXT")
    @NotNull
    private String address;
}