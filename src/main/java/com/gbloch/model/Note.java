package com.gbloch.model;

import lombok.Getter;

import javax.persistence.*;

/**
 * <br>
 * Created on 06/03/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@Entity
@Getter
final class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String notes;

    @OneToOne
    private Recipe recipe;
}
