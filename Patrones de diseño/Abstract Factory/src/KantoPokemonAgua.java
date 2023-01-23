public class KantoPokemonAgua implements PokemonAgua {
    String name;
    KantoPokemonAgua(String name) {
        this.name = name;
    }
    @Override
    public void imprimirDescripcion() {
        System.out.println("Soy un pokemon de agua de la region de Kanto");
        System.out.println("Mi nombre es: " + name);
    }
}

