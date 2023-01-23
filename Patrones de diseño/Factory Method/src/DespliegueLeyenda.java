public abstract class DespliegueLeyenda {
   public abstract  Leyenda crearLeyenda();
   public void imprimirLeyenda(Leyenda leyenda){
       leyenda.desplegar();
       leyenda.listarHabilidades();
       leyenda.HabilidadPasiva();
       leyenda.Habilidad();
       leyenda.Ultimate();
   }
}
