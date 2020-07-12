package mypos.management.products;

import mypos.management.families.Family;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column( name = "DATE_CREATED", nullable = false)
    private LocalDate createdOn;
    @Column( name = "DATE_MODIFIED")
    private LocalDate modifiedOn;
    @Column( name = "NAME", nullable = false)
    private String name;
    @Column( name="PRICE", precision = 2 , nullable = false)
    private BigDecimal price;
    @Column( name = "PROVIDER")
    private String provider;
    @Column( name = "IMG_PATH", length = 400)
    private String image;
    @Column( name = "DESCRIPTION", length = 10000)
    private String description;
    @OneToMany
    @JoinColumn ( name = "INGREDIENT_ID")
    private Set<Ingredient> ingredients;
    @ManyToOne
    @JoinColumn (name = "FAMILY_ID", nullable = false)
    private Family family;
    @Column ( name = "PRODUCT_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ProductType PRODUCT_TYPE;
    @Column( name = "WEIGHTED", nullable = false)
    private boolean weighted;
    
    public Product() {
        
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
