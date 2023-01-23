public class Caustic implements Leyenda{

    @Override
    public void desplegar() {
        System.out.println("Leyenda Defensa -Caustic-");
    }

    @Override
    public void listarHabilidades() {
        System.out.println("Habilidad Pasiva: Gas Tóxico");
        System.out.println("Habilidad: Trampa de Gas");
        System.out.println("Ultimate: Gas Tóxico");
    }

    @Override
    public void HabilidadPasiva() {
        System.out.println("Gas Tóxico: Permite ver a los enemigos a través de paredes");
    }

    @Override
    public void Habilidad() {
        System.out.println("Trampa de Gas: Lanza una trampa de gas que inflige daño");
    }

    @Override
    public void Ultimate() {
        System.out.println("Gas Tóxico: Lanza una gran cantidad de gas que inflige daño");
    }
}
