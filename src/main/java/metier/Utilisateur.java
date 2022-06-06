/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;
import tp.appli_31_05.*;
import vue.*;



/**
 *
 * @author Dell 7390 2in1
 */
public class Utilisateur {
    
    
    public Utilisateur(String prenom, String  nom , String identifiant, String password){
        
        this.nom=nom;
        this.prenom=prenom;
        this.identifiant=identifiant;
        this.mail="";
        this.password=password;
        this.estadmin=true;
    }
    
    // getters

    public String getIdentifiant() {
        return identifiant;
    }

    public String getMail() {
        return mail;
    }

    public String getNom() {
        return nom;
    }

    public String getPassword() {
        return password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setEstadmin(boolean estadmin) {
        this.estadmin = estadmin;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
    
    
    private String nom;
    private String prenom;
    private String identifiant;
    private String  mail;
    private String password;
    private boolean estadmin;
}
    
    
