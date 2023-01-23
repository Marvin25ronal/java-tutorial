public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            DespliegueLeyenda despliegueLeyenda;
            System.out.println("Desplegando Leyenda-----------------------------------------");
            if (i % 2 == 0) {
                despliegueLeyenda = new DespliegueLeyendaDefensa();
                Leyenda defensa = despliegueLeyenda.crearLeyenda();
                despliegueLeyenda.imprimirLeyenda(defensa);
            } else {
                despliegueLeyenda = new DespliegueLeyendaEscaneo();
                Leyenda escaneo = despliegueLeyenda.crearLeyenda();
                despliegueLeyenda.imprimirLeyenda(escaneo);
            }
        }
    }
}