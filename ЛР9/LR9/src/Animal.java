public class Animal {
    private String species; //Вид тварини
    private String genus; //Рід тварини
    private String typeOfFood;//Тип їжі яку вживає тварина

    public Animal(){
        this.species = "Невідомо";
        this.genus = "Невідомо";
        this.typeOfFood = "Невідомо";
    }

    public Animal(String species,String  genus, String typeOfFood){
        this.species = species;
        this.genus = genus;
        this.typeOfFood = typeOfFood;
    }

    ///GET SET
    public void setSpecies(String species){
        this.species = species;
    }
    public void setTypeOfFood(String typeOfFood){
        this.typeOfFood = typeOfFood;
    }
    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }
    public String getGenus() {
        return genus;
    }

    //Метод харчування
    public void feed(String food)
    {
        System.out.println(genus + " " + species + " харчується " + food + ".");
    }

    //
    public String print(){
        return genus + " " + species;
    }
}
