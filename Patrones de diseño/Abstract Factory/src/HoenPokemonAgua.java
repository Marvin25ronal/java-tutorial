public class HoenPokemonAgua implements PokemonAgua {
     String name;
    HoenPokemonAgua() {
        this.name = "Mudkip";
    }
    @Override
    public void imprimirDescripcion() {
        System.out.println("Soy un pokemon de agua de la region de Hoenn");
        System.out.println("Mi nombre es: " + name);
    }
}

