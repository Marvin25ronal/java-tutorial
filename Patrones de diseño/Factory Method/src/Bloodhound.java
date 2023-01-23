public class Bloodhound implements Leyenda{
    @Override
    public void desplegar() {
        System.out.println("Leyenda Escaneo -Bloodhound-");
    }

    @Override
    public void listarHabilidades() {
        System.out.println("Habilidad Pasiva: Escaneo");
        System.out.println("Habilidad: Rastreo");
        System.out.println("Ultimate: Avispa");
    }

    @Override
    public void HabilidadPasiva() {
        System.out.println("Escaneo: Permite ver a los enemigos a través de paredes");
    }

    @Override
    public void Habilidad() {
        System.out.println("Rastreo: Permite ver los rastros de los enemigos");
    }

    @Override
    public void Ultimate() {
        System.out.println("Avispa: Permite ver a los enemigos a través de paredes y ver sus rastros");
    }
}
