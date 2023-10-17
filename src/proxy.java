// actua como un intermediario que controla el acceso a traduccion de palabras
public class proxy implements Itraductor {
    private TraducciondePalabras Traducido;

    @Override
    public  String traductor (String text){
        if (Traducido== null){
            Traducido=new TraducciondePalabras();
        }
        return Traducido.traductor(text);
    }
}
