package com.example.projettableaudebord.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="quest_enregistres_reg")
public class Region {

    @JsonProperty("codeId")
    @Id
    @Column(name = "reg")
    private int codeId;


    @Column(name = "nombre_questionnaires")
    private int nbmQuest;


    public Region(int codeId, int nbmQuest) {
        this.codeId = codeId;
        this.nbmQuest = nbmQuest;
    }

    public Region() {super();
    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public int getNbmQuest() {
        return nbmQuest;
    }

    public void setNbmQuest(int nbmQuest) {
        this.nbmQuest = nbmQuest;
    }

    @Override
    public String toString() {
        return "Region{" +
                "codeId=" + codeId +
                ", nbmQuest=" + nbmQuest +
                '}';
    }
}


