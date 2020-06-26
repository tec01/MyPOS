package mypos.management.products;

import mypos.management.families.Family;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private LocalDate createdOn;
    @Column
    private LocalDate modifiedOn;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @Column
    private String provider;
    @Column
    private String image;
    @Column
    private String description;
    @OneToMany
    private Set<Ingredient> ingredients;
    @OneToOne
    private Family family;
    @Column
    private ProductType PRODUCT_TYPE;
    @Column(nullable = false)
    private boolean weighted;
    
    public Product() {
        
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
    public LocalDate getModifiedOn() {
        return modifiedOn;
    }
    public void setModifiedOn(LocalDate modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    public Family getFamily() {
        return family;
    }
    public void setFamily(Family family) {
        this.family = family;
    }
    public ProductType getType() {
        return PRODUCT_TYPE;
    }
    public void setType(ProductType type) {
        this.PRODUCT_TYPE = type;
    }

    public boolean isWeighted() {
        return weighted;
    }

    public void setWeighted(boolean weighted) {
        this.weighted = weighted;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
    
    

    
}
