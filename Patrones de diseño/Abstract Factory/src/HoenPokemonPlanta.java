public class HoenPokemonPlanta implements PokemonPlanta {
    String name;
    HoenPokemonPlanta() {
        this.name = "Treecko";
    }
    @Override
    public void imprimirDescripcion() {
        System.out.println("Soy un pokemon de tipo planta de la región de Hoenn");
        System.out.println("Mi nombre es: " + name);
    }
}

