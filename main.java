package tn.tuniprod.gestionmagasin;

import tn.tuniprod.gestionmagasin.magasin.Magasin;
import tn.tuniprod.gestionmagasin.produit.Produit;

    public class main {
        public static void main(String[] args) {
            // Créer un magasin
            tn.tuniprod.gestionmagasin.magasin.Magasin magasin = new tn.tuniprod.gestionmagasin.magasin.Magasin("123 Rue TuniProd");

            // Créer quelques produits
            tn.tuniprod.gestionmagasin.produit.Produit p1 = new tn.tuniprod.gestionmagasin.produit.Produit("Chaise", 50.0);
            tn.tuniprod.gestionmagasin.produit.Produit p2 = new tn.tuniprod.gestionmagasin.produit.Produit("Table", 150.0);

            // Ajouter les produits au magasin
            magasin.ajouterProduit(p1);
            magasin.ajouterProduit(p2);

            // Afficher les caractéristiques du magasin
            magasin.afficherCaracteristiques();

            // Afficher le nombre total de produits
            System.out.println("Nombre total de produits : " + magasin.getNombreProduits());
        }
    }

}
