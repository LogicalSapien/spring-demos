package com.logicalsapien.sprintbooth2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Planet Entity Class.
 */
@Entity
public class Planet {

    /**
     * Id.
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    /**
     * Planet Name.
     */
    private String name;

    /**
     * No Of Moons.
     */
    private Integer numberOfMoons;

    /**
     * @return Get Id.
     */
    public Long getId() {
        return id;
    }

    /**
     * @param idA Id to Set
     */
    public void setId(final Long idA) {
        this.id = idA;
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param nameA Name to Set
     */
    public void setName(final String nameA) {
        this.name = nameA;
    }

    /**
     * @return Number of Moons.
     */
    public Integer getNumberOfMoons() {
        return numberOfMoons;
    }

    /**
     * @param numberOfMoonsA Number of moons to Set
     */
    public void setNumberOfMoons(final Integer numberOfMoonsA) {
        this.numberOfMoons = numberOfMoonsA;
    }
}
