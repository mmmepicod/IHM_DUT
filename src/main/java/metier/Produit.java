/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.*;
import java.lang.Enum ;

import java.util.List;

/**
 *
 * @author Dell 7390 2in1
 */
public class Produit  {
    
    // constructeur complet
    public Produit(String libelleProduit, String categorieProduit, String sousCategorieProduit, String descriptionProduit, double prixProduit,
            int tauxPromoProduit, boolean enPromoProduit, boolean visibleProduit, String lienImageProduit, int quantiteProduit,  int seuilAlerte){
        nbrProduits++;
        this.idProduit=nbrProduits;
        this.libelleProduit=libelleProduit;
        this.categorieProduit=categorieProduit;
        this.sousCategorieProduit=sousCategorieProduit;
        this.prixProduit=prixProduit;
        this.tauxPromoProduit=tauxPromoProduit;
        this.enPromoProduit=enPromoProduit;
        this.visibleProduit=visibleProduit;
        this.lienImageProduit = lienImageProduit;
        this.prixReduitProduit=(this.prixProduit*(100-this.tauxPromoProduit)); 
        this.quantiteProduit=quantiteProduit;
        this.descriptionProduit=descriptionProduit;
        this.seuilAlerte=seuilAlerte;
        listeDesProduits.add(this);
     
        
        
    
}
      // constructeur partiel , avec attribution de valeurs par défaut
       public Produit(String libelleProduit, String categorieProduit, double prixProduit){
        nbrProduits++;
        this.idProduit=nbrProduits;
        this.libelleProduit=libelleProduit;
        this.categorieProduit=categorieProduit;
        this.sousCategorieProduit="";
        this.prixProduit=prixProduit;
        this.tauxPromoProduit=0;
        this.enPromoProduit=false;
        this.visibleProduit=true;
        this.prixReduitProduit=this.prixProduit;
        this.lienImageProduit="";
        this.descriptionProduit="";
        this.quantiteProduit=10;
        this.seuilAlerte=3;
        listeDesProduits.add(this);}
       
       
       // getters

    public int getIdProduit() {
        return idProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public String getCategorieProduit() {
        return categorieProduit;
    }
    
    

    public String getSousCategorieProduit() {
        return sousCategorieProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public double getPrixReduitProduit() {
        return prixReduitProduit;
    }

    public int getTauxPromoProduit() {
        return tauxPromoProduit;
    }

    public String getLienImageProduit() {
        return lienImageProduit;
    }

    public static List<Produit> getListeDesProduits() {
        return listeDesProduits;
    }

    public static int getNbrProduits() {
        return nbrProduits;
    }

    public String getDescriptionProduit() {
        return descriptionProduit;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public int getSeuilAlerte() {
        return seuilAlerte;
    }
    
    
    
    

    // setters

    public void setCategorieProduit(String categorieProduit) {
        this.categorieProduit = categorieProduit;
    }

    public void setEnPromoProduit(boolean enPromoProduit) {
        this.enPromoProduit = enPromoProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public void setLienImageProduit(String lienImageProduit) {
        this.lienImageProduit = lienImageProduit;
    }

    public static void setListeDesProduits(List<Produit> listeDesProduits) {
        Produit.listeDesProduits = listeDesProduits;
    }

    public static void setNbrProduits(int nbrProduits) {
        Produit.nbrProduits = nbrProduits;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public void setPrixReduitProduit(double prixReduitProduit) {
        this.prixReduitProduit = prixReduitProduit;
    }

    public void setSousCategorieProduit(String sousCategorieProduit) {
        this.sousCategorieProduit = sousCategorieProduit;
    }

    public void setTauxPromoProduit(int tauxPromoProduit) {
        this.tauxPromoProduit = tauxPromoProduit;
    }

    public void setVisibleProduit(boolean visibleProduit) {
        this.visibleProduit = visibleProduit;
    }

    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }

    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public void setSeuilAlerte(int seuilAlerte) {
        this.seuilAlerte = seuilAlerte;
    }
    
    //redefinir methode parente

    @Override
    public String toString() 
    {
        return "Article{" + "id Produit= " + idProduit + ", libelle Produit = " + libelleProduit + ", categorie produit = " 
                + categorieProduit + ", sous_categorie produit = " + sousCategorieProduit + ", prix produit : " + prixProduit + ",  description produit = " + descriptionProduit + "}";
    }
    
    
  
    public enum CategoriesProduits {Bracelet , Montre, Bague , Boucle, Alliance };
  
    
    private static int nbrProduits=0;
    private String libelleProduit;
    private String categorieProduit;
    private String sousCategorieProduit;
    private String descriptionProduit;
    private double prixProduit;
    private double prixReduitProduit;
    private int tauxPromoProduit;
    private boolean enPromoProduit;
    private boolean visibleProduit;
    private String lienImageProduit;
    private int quantiteProduit;
    private int seuilAlerte;
    private static List<Produit> listeDesProduits;
    private int idProduit;
    
    
    ;
    
    
    
    
    
}
