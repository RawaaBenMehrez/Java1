//import java.util.Scanner;
public class ZooManagement
{
        public static void main(String[] args)
        {
                // Création d'un objet Animal (lion)
                Animal lion = new Animal("Felidae", "Lion", 5, true);

                // Création d'un objet Zoo (myZoo)
                Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);

// PROSITE 1 :
          /* Scanner scanner = new Scanner(System.in);

            System.out.print("Entre le nom du zoo : ");
            zoo.zooName = scanner.nextLine();

            System.out.print("Entre le number de cages : ");
            zoo.nbrCages = scanner.nextInt();

            scanner.close();

            System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");*/

// 1ere METHODE:
                /*
                //Afficher les informations
                System.out.println("Animal : " + lion.name);
                System.out.println("Famille : " + lion.family);
                System.out.println("Âge : " + lion.age + " ans");
                System.out.println("Est un mammifère : " + lion.isMammal);

                System.out.println("\nZoo : " + myZoo.name);
                System.out.println("Ville : " + myZoo.city);
                System.out.println("Nombre de cages : " + myZoo.nbrCages);*/
//2éme METHODE:
                // Utilisation des méthodes toString() pour afficher les informations

                System.out.println(lion);  // Appelle lion.toString()
                System.out.println();
                System.out.println(myZoo);  // Appelle myZoo.toString()

        }
}



