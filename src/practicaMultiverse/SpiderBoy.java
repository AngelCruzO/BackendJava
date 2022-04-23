package practicaMultiverse;

public class SpiderBoy extends SpiderMan implements SpiderBoyActions{

    public SpiderBoy(String name, String alias, String origin, String appearance) {
        super(name, alias, origin, appearance);
    }


    @Override
    public void SentidoAracnido(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/SentidoAracnido.png");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void ExplosionEnergia(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/explosion.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void CamuflajeAracnido(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/camuflaje.jpg");
        s.setBounds(200,100,1000,700);
    }

    @Override
    public void RayoVeneno(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"San Serif",28, Colors.BlueHorizon);
        s.showImage("images/spiderverse/rayoveneno.jpg");
        s.setBounds(200,100,1000,700);
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
