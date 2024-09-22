public class Zoo
{
    Animal [] animals; // Tableau pour stocker les animaux
    String name,city;
    int nbrCages;

    public Zoo(String name , String city, int nbrCages)
    {
        this.animals= new Animal [nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo : " + name + "\n" +
                "Ville : " + city + "\n" +
                "Nombre de cages : " + nbrCages;
    }
}
