package com.example.projettableaudebord.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "questionnaire")
public class Enqueteur {



    @Id

    @Column(name= "unique_identifier")
    private int uniqueIdentifier;

    @Column(name="enqueteur_id")
    private int idEnqueteur;

    @Column(name="enqueteur_nom")
    private String nomEnqueteur;
    @Column(name="statut")
    private int statut;

    @Column(name="nombre_questionnaires")
    private int nombreQuestionaires;


    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(int uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public Enqueteur(int idEnqueteur, String nomEnqueteur, int statut, int nombreQuestionaires, int uniqueIdentifier) {
        this.idEnqueteur = idEnqueteur;
        this.nomEnqueteur = nomEnqueteur;
        this.statut = statut;
        this.nombreQuestionaires = nombreQuestionaires;
        this.uniqueIdentifier = uniqueIdentifier;

    }

    public Enqueteur() {
        super();
    }

    public int getIdEnqueteur() {
        return idEnqueteur;
    }

    public void setIdEnqueteur(int idEnqueteur) {
        this.idEnqueteur = idEnqueteur;
    }

    public String getNomEnqueteur() {

        return nomEnqueteur;
    }

    public void setNomEnqueteur(String nomEnqueteur) {

        this.nomEnqueteur = nomEnqueteur;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public int getNombreQuestionaires() {
        return nombreQuestionaires;
    }

    public void setNombreQuestionaires(int nombreQuestionaires) {
        this.nombreQuestionaires = nombreQuestionaires;
    }



    @Override
    public String toString() {
        return "Enqueteur{" +
                "uniqueIdentifier=" + uniqueIdentifier +
                ", idEnqueteur=" + idEnqueteur +
                ", nomEnqueteur='" + nomEnqueteur + '\'' +
                ", statut=" + statut +
                ", nombreQuestionaires=" + nombreQuestionaires +
                '}';
    }
}
