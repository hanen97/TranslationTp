package com.rizomm.m2.tp.traduction.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Translation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String language;

    @ManyToOne
    private Application application;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Entry> entries;

}
