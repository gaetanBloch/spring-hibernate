package com.gbloch.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

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
@Setter
public final class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;
}
