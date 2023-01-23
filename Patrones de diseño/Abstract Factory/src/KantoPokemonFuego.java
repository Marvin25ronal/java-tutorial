public class KantoPokemonFuego implements PokemonFuego {
    String name;
    KantoPokemonFuego(String name) {
        this.name = name;
    }

    @Override
    public void imprimirDescripcion() {
        System.out.println("Soy un pokemon de fuego de la región de Kanto");
        System.out.println("Mi nombre es: " + name);
    }
}


