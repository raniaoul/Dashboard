package com.example.projettableaudebord.models;
import jakarta.persistence.*;

@Entity
@Table(name="employes")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="prenom_employe")
    private String prenomEmploye;
    @Column(name="nom_employe")
    private String nomEmploye;
    @Column(name="id_employe")
    private int idEmploye;
    @Column(name="numero_telephone")
    private String numeroTelephone;
    @Column(name="email")
    private String emailEmp;


    public Employe( String prenomEmploye, String nomEmploye, int idEmploye, String numeroTelephone, String emaiL) {

        this.prenomEmploye = prenomEmploye;
        this.nomEmploye = nomEmploye;
        this.idEmploye = idEmploye;
        this.numeroTelephone = numeroTelephone;
        this.emailEmp = emaiL;
    }

    public Employe() {
        super();
    }

    public int getId() {
        return id;
    }


    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getEmaiL() {
        return emailEmp;
    }

    public void setEmaiL(String emaiL) {
        this.emailEmp = emaiL;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", prenomEmploye='" + prenomEmploye + '\'' +
                ", nomEmploye='" + nomEmploye + '\'' +
                ", idEmploye='" + idEmploye + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", email='" + emailEmp + '\'' +
                '}';
    }
}
