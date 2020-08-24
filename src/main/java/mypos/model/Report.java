package mypos.model;

import javax.persistence.*;

@Entity
@Table(name = "REPORT")
public class Report {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String path;

    public Report(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
