package practicaComic;

public class Historia extends Comic implements Viñetas{

    public Historia(String titulo, String autor, String volumen) {
        super(titulo, autor, volumen);
    }

    @Override
    public void Inicio(Screen s) throws InterruptedException {
        s.out(showMessage(),"practicaComic.Comic sans",35, Colors.LighterPurple);
        Thread.sleep(4000);
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro1.png");
        Thread.sleep(6000);
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro2.png");
        Thread.sleep(6000);
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro3.png");
    }

    @Override
    public void Climax(Screen s) throws InterruptedException {
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro4.png");
        Thread.sleep(6000);
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro5.png");
    }

    @Override
    public void Fin(Screen s) throws InterruptedException {
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro6.png");
        Thread.sleep(6000);
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro7.png");
        Thread.sleep(6000);
        s.cls();
        s.repaint();
        s.setBounds(50,100,1280,500);
        s.showImage("images/comic/cuadro8.png");
    }
}
