public class KantoPokemonPlanta implements PokemonPlanta {
   String name;
    public KantoPokemonPlanta() {
        this.name= "Bulbasaur";
    }
    @Override
    public void imprimirDescripcion() {
        System.out.println("Soy un Pokemon de tipo Planta de la region de Kanto");
        System.out.println("Mi nombre es: " + name);
    }
}


