package tn.tuniprod.gestionmagasin.produit;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        if (prix >= 0) {
            this.prix = prix;
        } else {
            this.prix = 0; // Si le prix est négatif, on le met à 0
        }
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }
}
