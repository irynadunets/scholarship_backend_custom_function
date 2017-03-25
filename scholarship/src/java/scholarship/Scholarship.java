/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ARI
 */
@Entity
@Table(name = "scholarship")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Scholarship.findAll", query = "SELECT s FROM Scholarship s"),
    @NamedQuery(name = "Scholarship.findById", query = "SELECT s FROM Scholarship s WHERE s.id = :id"),
    @NamedQuery(name = "Scholarship.findByLevel", query = "SELECT s FROM Scholarship s WHERE s.level = :level"),
    @NamedQuery(name = "Scholarship.findByField", query = "SELECT s FROM Scholarship s WHERE s.field = :field"),
    @NamedQuery(name = "Scholarship.findByCountry", query = "SELECT s FROM Scholarship s WHERE s.country = :country"),
    @NamedQuery(name = "Scholarship.findByLanguage", query = "SELECT s FROM Scholarship s WHERE s.language = :language"),
    @NamedQuery(name = "Scholarship.findByUniversity", query = "SELECT s FROM Scholarship s WHERE s.university = :university"),
    @NamedQuery(name = "Scholarship.findByLink", query = "SELECT s FROM Scholarship s WHERE s.link = :link")})
public class Scholarship implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "level")
    private String level;
    @Size(max = 50)
    @Column(name = "field")
    private String field;
    @Size(max = 50)
    @Column(name = "country")
    private String country;
    @Size(max = 50)
    @Column(name = "language")
    private String language;
    @Size(max = 250)
    @Column(name = "university")
    private String university;
    @Size(max = 200)
    @Column(name = "link")
    private String link;

    public Scholarship() {
    }

    public Scholarship(Integer id,String level,String field,String country) {
        this.id = id;
        this.level = level;
        this.field = field;
        this.language = language;        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Scholarship)) {
            return false;
        }
        Scholarship other = (Scholarship) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scholarship.Scholarship[ id=" + id + " ]";
    }
    
}
