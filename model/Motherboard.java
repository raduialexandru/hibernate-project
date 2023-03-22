package model;

import javax.persistence.*;

@Entity
@Table(name = "motherboard")
public class Motherboard {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;

    @Column(name = "model")
    private String model;

    public Motherboard(){

    }

    public Motherboard(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
