public class Animal
{
    String family,name;
    int age;
    boolean isMammal;

    // Constructeur paramétré
    public Animal(String family,String name,int age,boolean isMammal)
    {
        this.family = family;
        this.name=name;
        this.age=age;
        this.isMammal= isMammal;
    }

    @Override
    public String toString()
    {
        return "Animal : " + name + "\n" +
                "Famille : " + family + "\n" +
                "Âge : " + age + " ans\n" +
                "Est un mammifère : " + isMammal;
    }

}
