package sda.hibernate;

import org.hibernate.Session;
import sda.hibernate.entity.*;

import java.sql.Date;
import java.time.LocalDate;

public class RozwiazanieZad {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Autor autor1 = new Autor(Date.valueOf(LocalDate.now()), 1, "Robert", "Engel");
        Autor autor2 = new Autor(Date.valueOf(LocalDate.now()), 1, "Jan", "Nowak");
        Autor autor3 = new Autor(Date.valueOf(LocalDate.now()), 1, "Ola", "Kowalska");

        Ksiazka ksiazka1 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka1");
        Ksiazka ksiazka2 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka2");
        Ksiazka ksiazka3 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka3");
        Ksiazka ksiazka4 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka4");
        Ksiazka ksiazka5 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka5");
        Ksiazka ksiazka6 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka6");
        Ksiazka ksiazka7 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka7");
        Ksiazka ksiazka8 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka8");
        Ksiazka ksiazka9 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka9");
        Ksiazka ksiazka10 = new Ksiazka(Date.valueOf(LocalDate.now()), 1, "Ksiazka10");

        Wydawnictwo wydawnictwo1 = new Wydawnictwo(Date.valueOf(LocalDate.now()), 1, "PWN");
        Wydawnictwo wydawnictwo2 = new Wydawnictwo(Date.valueOf(LocalDate.now()), 1, "Helion");

        Adres adres1 = new Adres("Długa", "1a", "1", "80-555", "Gdańsk");
        Adres adres2 = new Adres("Szeroka", "12a", "12", "80-555", "Gdańsk");
        Adres adres3 = new Adres("Grunwaldzka", "13a", "13", "80-555", "Gdańsk");
        Adres adres4 = new Adres("Sopocka", "14a", "14", "80-555", "Gdańsk");
        Adres adres5 = new Adres("Spacerowa", "15a", "15", "80-555", "Gdańsk");

        Klient klient1 = new Klient(Date.valueOf(LocalDate.now()), 1, "Ala", "Nowak", adres1, "123456789");
        Klient klient2 = new Klient(Date.valueOf(LocalDate.now()), 1, "Ola", "Nowak", adres2, "987654321");
        Klient klient3 = new Klient(Date.valueOf(LocalDate.now()), 1, "Jan", "Kowalski", adres3, "123454322");
        Klient klient4 = new Klient(Date.valueOf(LocalDate.now()), 1, "Karolina", "Kowalska", adres4, "567898765");
        Klient klient5 = new Klient(Date.valueOf(LocalDate.now()), 1, "Adam", "Nowak", adres5, "9742357999");

        ksiazka1.setWydawnictwo(wydawnictwo1);
        ksiazka2.setWydawnictwo(wydawnictwo1);
        ksiazka3.setWydawnictwo(wydawnictwo1);
        ksiazka4.setWydawnictwo(wydawnictwo1);
        ksiazka5.setWydawnictwo(wydawnictwo1);
        ksiazka6.setWydawnictwo(wydawnictwo2);
        ksiazka7.setWydawnictwo(wydawnictwo2);
        ksiazka8.setWydawnictwo(wydawnictwo2);
        ksiazka9.setWydawnictwo(wydawnictwo2);
        ksiazka10.setWydawnictwo(wydawnictwo2);

        ksiazka1.addAutor(autor1);
        ksiazka2.addAutor(autor2);
        ksiazka2.addAutor(autor1);
        ksiazka3.addAutor(autor2);
        ksiazka3.addAutor(autor3);
        ksiazka4.addAutor(autor1);
        ksiazka5.addAutor(autor1);
        ksiazka6.addAutor(autor2);
        ksiazka6.addAutor(autor3);
        ksiazka7.addAutor(autor1);
        ksiazka7.addAutor(autor2);
        ksiazka7.addAutor(autor3);
        ksiazka8.addAutor(autor2);
        ksiazka8.addAutor(autor1);
        ksiazka9.addAutor(autor1);
        ksiazka9.addAutor(autor2);
        ksiazka9.addAutor(autor3);
        ksiazka10.addAutor(autor1);
        ksiazka10.addAutor(autor2);
        ksiazka10.addAutor(autor3);

        klient1.addBook(ksiazka1);
        klient1.addBook(ksiazka2);
        klient1.addBook(ksiazka3);
        klient1.addBook(ksiazka4);
        klient1.addBook(ksiazka5);

        klient2.addBook(ksiazka3);
        klient2.addBook(ksiazka5);
        klient2.addBook(ksiazka6);
        klient2.addBook(ksiazka8);

        klient3.addBook(ksiazka1);
        klient3.addBook(ksiazka2);
        klient3.addBook(ksiazka6);
        klient3.addBook(ksiazka10);

        klient4.addBook(ksiazka10);

        klient5.addBook(ksiazka2);
        klient5.addBook(ksiazka7);
        klient5.addBook(ksiazka8);
        klient5.addBook(ksiazka9);
        klient5.addBook(ksiazka10);
        klient5.addBook(ksiazka1);
        klient5.addBook(ksiazka3);
        klient5.addBook(ksiazka4);
        klient5.addBook(ksiazka5);

        session.persist(ksiazka1);
        session.persist(ksiazka2);
        session.persist(ksiazka3);
        session.persist(ksiazka4);
        session.persist(ksiazka5);
        session.persist(ksiazka6);
        session.persist(ksiazka7);
        session.persist(ksiazka8);
        session.persist(ksiazka9);
        session.persist(ksiazka10);
        session.flush();
        session.close();
    }
}
