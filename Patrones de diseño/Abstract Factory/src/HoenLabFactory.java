public class HoenLabFactory implements PokemonesInicialesFactory {
    @Override
    public PokemonAgua crearPokemonAgua() {
        return new HoenPokemonAgua();
    }

    @Override
    public PokemonFuego crearPokemonFuego() {
        return new HoenPokemonFuego();
    }

    @Override
    public PokemonPlanta crearPokemonPlanta() {
        return new HoenPokemonPlanta();
    }
}

