package com.example.projettableaudebord.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="quest_enregistres_com")
public class Commune {

    @JsonProperty("codeId")
    @Id
    @Column(name = "com")
    private String codeId;

    @Column(name = "nombre_questionnaires")
    private int nbmQuest;


    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public int getNbmQuest() {
        return nbmQuest;
    }

    public void setNbmQuest(int nbmQuest) {
        this.nbmQuest = nbmQuest;
    }

    public Commune() {
        super();
    }

    @Override
    public String toString() {
        return "Commune{" +
                "codeId='" + codeId + '\'' +
                ", nbmQuest=" + nbmQuest +
                '}';
    }
}