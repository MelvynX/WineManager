public class Beer extends Alcohol {
    protected String type;
    //Instancier

    public Beer() { }
    public Beer(String name, String region, int age, int degreeOfAlcohol, int capacityML, String type) {
        this.name = name;
        this.region = region;
        this.age = age;
        this.degreeOfAlcohol = degreeOfAlcohol;
        this.capacityML = capacityML;
        this.type = type;
    }
    //Fonction
    public String toString() {
        String str = "\n"+
                "*---------------------------------------------*\n" +
                "Bière : "+this.name+
                "\n \t Elle provient de "+this.region+" et à été crée en "+this.age+". " +
                "\n \t C'est une bière "+this.type+"."+
                "\n \t Elle possède "+this.degreeOfAlcohol+"% d'Alcool et contient "+ this.capacityML +"ml.\n"+
                "*---------------------------------------------*";
        return str;
    }
    //Getter

    public String getType() {
        return type;
    }
    //Setter

    public void setType(String type) {
        this.type = type;
    }
}
