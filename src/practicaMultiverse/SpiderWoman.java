package practicaMultiverse;

public class SpiderWoman extends SpiderMan implements SpiderWomanActions{

    public SpiderWoman(String name, String alias, String origin, String aparicion) {
        super(name, alias, origin, aparicion);
    }

    @Override
    public void Fuerza(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/Fuerza.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void Velocidad(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/velocidad.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void Resistencia(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/resistencia.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void Reflejos(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/reflejos.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void Agilidad(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/Agilidad.png");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void TrepaMuros(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/TrepaMuros.png");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void RayoVeneno(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/rayovenenowoman.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void Audicion(Screen s) {
        /*s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28,Colors.BlueHorizon);
        s.showImage("Fuerza.jpg");
        s.setBounds(200,100,1000,700);*/
    }

    @Override
    public void Inmunidad(Screen s) {
        /*s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28,Colors.BlueHorizon);
        s.showImage("Fuerza.jpg");
        s.setBounds(200,100,1000,700);*/
    }

    @Override
    public void SecrecionFeromonas(Screen s) {
        /*s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28,Colors.BlueHorizon);
        s.showImage("Fuerza.jpg");
        s.setBounds(200,100,1000,700);*/
    }

    @Override
    public void Vuelo(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/vuelo.jpg");
        s.setBounds(200,100,1000,700);
    }


}
