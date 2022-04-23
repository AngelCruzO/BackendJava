package practicaComic;

public class LeerComic {
    public static void main(String[] args) {
        TestComic();
    }

    private static void TestComic(){
        Screen screen = new Screen();
        Historia comic = new Historia("La pequeña Lulu","Parramon","#3");

        Runnable testC = new Runnable(){

            @Override
            public void run() {
                try{
                    screen.setVisible(true);
                    comic.Inicio(screen);
                    Thread.sleep(6000);
                    comic.Climax(screen);
                    Thread.sleep(6000);
                    comic.Fin(screen);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }

        };

        Thread comicLulu = new Thread(testC);
        comicLulu.start();
    }
}
