public class KantoLabFactory implements PokemonesInicialesFactory {
    @Override
    public PokemonAgua crearPokemonAgua() {
        return new KantoPokemonAgua("Squirtle");
    }

    @Override
    public PokemonFuego crearPokemonFuego() {
        return new KantoPokemonFuego("Charmander");
    }

    @Override
    public PokemonPlanta crearPokemonPlanta() {
        return new KantoPokemonPlanta();
    }
}
