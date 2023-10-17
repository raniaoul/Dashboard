package com.example.projettableaudebord.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
    @Entity
    @Table(name="quest_enregistres_pro")
    public class Province{

        @JsonProperty("codeId")
        @Id
        @Column(name = "pro")
        private int codeId;

        @Column(name = "nombre_questionnaires")
        private int nbmQuest;

        public Province(int codeId, int nbmQuest) {
            this.codeId = codeId;
            this.nbmQuest = nbmQuest;
        }

        public Province() {
            super();
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
            return "Province{" +
                    "codeId=" + codeId +
                    ", nbmQuest=" + nbmQuest +
                    '}';
        }
    }



