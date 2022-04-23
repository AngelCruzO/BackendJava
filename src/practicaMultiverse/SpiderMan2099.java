package practicaMultiverse;

public class SpiderMan2099 extends SpiderMan implements SpiderMan2099Actions{


    public SpiderMan2099(String name, String alias, String origin, String appearance) {
        super(name, alias, origin, appearance);
    }


    @Override
    public void VisionAcelerada(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/vision.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void CuracionAcelerada(Screen s) {

    }

    @Override
    public void GarrasColmillos(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/garras.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void TelaranaOrganica(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/telarana.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void SenueloAcelerado(Screen s) {

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
}
