public class Horse extends Animal{
    public Horse(){
        super();
    }
    public Horse(String species, String genus, String typeOfFood)
    {
        super(species, genus, typeOfFood);
    }
    @Override
    public void feed(String food)
    {
        System.out.println(Character.toUpperCase(getSpecies().charAt(0)) + getSpecies().substring(1) + " " + getGenus().toLowerCase() + " харчується " + food + ".");
    }
    @Override
    public String print(){
        return Character.toUpperCase(getSpecies().charAt(0)) + getSpecies().substring(1) + " " + getGenus().toLowerCase();
    }
}
