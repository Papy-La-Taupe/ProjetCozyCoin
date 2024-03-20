package fr.eni.cozycoin.bo;

import fr.eni.cozycoin.dal.builders.UserBuilder;

import java.sql.Date;

public class Article {
    private int numArticle;
    private String nom;
    private String description;
    private Date debut;
    private Date fin;
    private int prixInitial;
    private int prixVente;
    private int userId;
    private int categorie;

    public Article() {
        super();
    }

    public Article(String nom, String description, Date debut, Date fin, int prixInitial, int userId, int categorie){
        super();
        this.nom = nom;
        this.description = description;
        this.debut= debut;
        this.fin = fin;
        this.prixInitial = prixInitial;
        this.userId = userId;
        this.categorie = categorie;
    }

    public int getNumArticle() {
        return numArticle;
    }

    public void setNumArticle(int numArticle) {
        this.numArticle = numArticle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getPrixInitial() {
        return prixInitial;
    }

    public void setPrixInitial(int prixInitial) {
        this.prixInitial = prixInitial;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }
}
