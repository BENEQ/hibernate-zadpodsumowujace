package sda.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;

@MappedSuperclass
public class MainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @Column
    protected Date dataModyfikacji;
    @Column
    protected Integer idModyfikujacego;

    public MainEntity() {
    }

    public MainEntity(Date dataModyfikacji, Integer idModyfikujacego) {
        this.dataModyfikacji = dataModyfikacji;
        this.idModyfikujacego = idModyfikujacego;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataModyfikacji() {
        return dataModyfikacji;
    }

    public void setDataModyfikacji(Date dataModyfikacji) {
        this.dataModyfikacji = dataModyfikacji;
    }

    public Integer getIdModyfikujacego() {
        return idModyfikujacego;
    }

    public void setIdModyfikujacego(Integer idModyfikujacego) {
        this.idModyfikujacego = idModyfikujacego;
    }
}
