package sda.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "wydawnictwo")
public class Wydawnictwo extends MainEntity {
    @Column
    private String nazwaWydawnictwa;
    @OneToMany(mappedBy = "wydawnictwo")
    private Set<Ksiazka> ksiazki;

    public Wydawnictwo() {
    }

    public Wydawnictwo(Date dataModyfikacji, Integer idModyfikujacego, String nazwaWydawnictwa) {
        super(dataModyfikacji, idModyfikujacego);
        this.nazwaWydawnictwa = nazwaWydawnictwa;
    }
}
