package model;

import javax.persistence.*;

@Entity
@Table(name = "processor")
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;

    @Column(name = "model")
    private String model;

    @Column(name = "number_of_cores")
    private int numberOfCores;

    @Column(name = "generation")
    private int generation;

}
