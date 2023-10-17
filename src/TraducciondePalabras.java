import java.util.HashMap;
import java.util.Map;

 public class TraducciondePalabras implements Itraductor {
     private Map<String, String> traduccion;

// contructor inicia un mapa de traducciones
     public TraducciondePalabras() {
         traduccion = new HashMap<>();
         traduccion.put("hello", " hola");
         traduccion.put("world", " mundo");
     }

     // busca una palabara de entrada y busca la traduccion en el mapa
@Override
     public String traductor (String text){
         // getordefaul es un metodo de hasmaps
         return traduccion.getOrDefault(text, text);
         // busca en el mapa si hay una traduccion, si no regresa la palabra original
}


 }