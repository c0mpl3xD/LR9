public class Rabbit extends Animal{
    public Rabbit(){
        super();
    }
    public Rabbit(String species, String genus, String typeOfFood)
    {
        super(species, genus, typeOfFood);
    }
    @Override
    public void feed(String food)
    {
        System.out.println(getGenus() + "-" + getSpecies() + " харчується " + food + ".");
    }
    @Override
    public String print(){
        return getGenus() + "-" + getSpecies();
    }
}
