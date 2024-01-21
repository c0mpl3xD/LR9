public class Lion extends Animal{
    public Lion() {
        super();
    }
    public Lion(String species, String genus, String typeOfFood)
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
