package sda.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "autor")
public class Autor extends MainEntity {
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @ManyToMany(mappedBy = "autorzy")
    private Set<Ksiazka> ksiazki;

    public Autor() {
    }

    public Autor(Date dataModyfikacji, Integer idModyfikujacego, String imie, String nazwisko) {
        super(dataModyfikacji, idModyfikujacego);
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Set<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(Set<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }
}
