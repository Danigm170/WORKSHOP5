public class main {
    public static void main(String[] args) {
        Itraductor Ftraductor = new proxy();
        String text1= "hello";
        String text2= "world";
        String text3= "house";

        System.out.println("texto original"+ text1);
        System.out.println("traduccion: "+ Ftraductor.traductor(text1));

        System.out.println("texto original "+ text2);
        System.out.println("traduccion:"+ Ftraductor.traductor(text2));

        System.out.println("texto original "+ text3);
        System.out.println("traduccion:"+ Ftraductor.traductor(text3));
    }
}
