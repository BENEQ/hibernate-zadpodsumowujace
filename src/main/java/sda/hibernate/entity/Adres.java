package sda.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adres {
    @Column
    private String ulica;
    @Column
    private String nrDomu;
    @Column
    private String nrMieszkania;
    @Column
    private String kodPocztowy;
    @Column
    private String miejscowosc;

    public Adres() {
    }

    public Adres(String ulica, String nrDomu, String nrMieszkania, String kodPocztowy, String miejscowosc) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miejscowosc = miejscowosc;
    }
}
