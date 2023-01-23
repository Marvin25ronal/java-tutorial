public class HoenPokemonFuego implements PokemonFuego {
    String name;
    HoenPokemonFuego() {
        this.name = "Torchic";
    }
    public void imprimirDescripcion() {
        System.out.println("Soy un pokemon de fuego de la region de Hoenn");
        System.out.println("Mi nombre es: " + name);
    }
}
