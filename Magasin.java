package tn.tuniprod.gestionmagasin.magasin;

import tn.tuniprod.gestionmagasin.produit.Produit;

public class Magasin {
    private String adresse;
    private Produit[] produits;
    private int nombreProduits;

    public Magasin(String adresse) {
        this.adresse = adresse;
        this.produits = new Produit[50]; // Le magasin peut avoir au maximum 50 produits
        this.nombreProduits = 0; // Le magasin commence vide
    }

    public boolean ajouterProduit(Produit produit) {
        if (nombreProduits < 50) {
            produits[nombreProduits] = produit;
            nombreProduits++;
            return true;
        } else {
            System.out.println("Le magasin est plein.");
            return false;
        }
    }

    public void afficherCaracteristiques() {
        System.out.println("Adresse du magasin: " + adresse);
        System.out.println("Produits du magasin:");
        for (int i = 0; i < nombreProduits; i++) {
            System.out.println(" - " + produits[i].getNom() + " : " + produits[i].getPrix() + " DT");
        }
    }

    public int getNombreProduits() {
        return nombreProduits;
    }
}
