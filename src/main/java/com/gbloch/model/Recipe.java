package com.gbloch.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.util.DirectFieldAccessFallbackBeanWrapper;

import javax.persistence.*;
import java.util.Set;

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
public final class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private int prepTime;
    private int cookTime;
    private int servings;
    private String source;
    private String url;
    private String directions;
    @Lob
    private Byte[] image;
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @OneToOne(cascade = CascadeType.ALL)
    private Note note;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients;
}
