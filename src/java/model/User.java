
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name", length = 20, nullable = false)
    private String name ;
    @Column(name = "mobile", length = 20, nullable = false)
    private String mobile; 
    
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public User() {
    }
    
   
    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public String getMobile() {
        return mobile;
    }

   
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }
    
}
