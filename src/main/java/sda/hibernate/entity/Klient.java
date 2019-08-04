package sda.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "klient")
public class Klient extends MainEntity {
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Embedded
    private Adres adres;
    @Column
    private String telefon;
    @ManyToMany(mappedBy = "klienci")
    private Set<Ksiazka> ksiazki;

    public Klient() {
    }

    public Klient(Date dataModyfikacji, Integer idModyfikujacego, String imie, String nazwisko, Adres adres, String telefon) {
        super(dataModyfikacji, idModyfikujacego);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.telefon = telefon;
    }

    private Set<Ksiazka> getKsiazki() {
        if (ksiazki == null) {
            ksiazki = new HashSet<>();
        }
        return ksiazki;
    }

    public void addBook(Ksiazka ksiazka) {
        getKsiazki().add(ksiazka);
        ksiazka.addKlient(this);
    }
}
