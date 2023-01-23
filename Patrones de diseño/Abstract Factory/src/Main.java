public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //NUESTRA ABSTRACT FACTORY SERA POR REGION DE POKEMONES
        // PLANTA - AGUA - FUEGO
        // CADA REGION TENDRA SU FACTORY
        // CADA FACTORY TENDRA SU POKEMON
        // CADA POKEMON TENDRA SU ATAQUE
        // CADA ATAQUE TENDRA SU EFECTO
        // CADA POKEMON TENDRA SU NOMBRE

        for(int i = 0; i < 3; i++) {
            if(i%2== 0){
                PokemonesInicialesFactory kanto = new KantoLabFactory();
                PokemonAgua pokemonAgua = kanto.crearPokemonAgua();
                PokemonFuego pokemonFuego = kanto.crearPokemonFuego();
                PokemonPlanta pokemonPlanta = kanto.crearPokemonPlanta();
                System.out.println("----------------------------------------------------");
                System.out.println("Region: Kanto");
                System.out.println("Pokemones iniciales:");
                pokemonAgua.imprimirDescripcion();
                pokemonFuego.imprimirDescripcion();
                pokemonPlanta.imprimirDescripcion();
            }else{
                System.out.println("----------------------------------------------------");
                PokemonesInicialesFactory hoen = new HoenLabFactory();
                PokemonAgua pokemonAgua = hoen.crearPokemonAgua();
                PokemonFuego pokemonFuego = hoen.crearPokemonFuego();
                PokemonPlanta pokemonPlanta = hoen.crearPokemonPlanta();
                System.out.println("Region: Hoen");
                System.out.println("Pokemones iniciales:");
                pokemonAgua.imprimirDescripcion();
                pokemonFuego.imprimirDescripcion();
                pokemonPlanta.imprimirDescripcion();
            }


        }
    }
}