package mypos.model;

import javax.persistence.*;

@Entity
@Table(name = "ALLERGENS")
public class Allergen {

    @Id
    @Column(name = "ALLERGEN_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column( name = "SHORT_DESCRIPTION", nullable = false)
    private String shortDescription;
    @Column( name = "LONG_DESCRIPTION", nullable = false)
    private String longDescription;

    public Allergen(){

    }

    public Allergen(Integer id, String shortDescription, String longDescription) {
        this.id = id;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

}
