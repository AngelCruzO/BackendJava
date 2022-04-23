package practicaMultiverse;

public class SpiderVerse {
    public static void main(String[] args) throws InterruptedException {
            TestSpiderBoy();
            Thread.sleep(5000);
            TestSpiderWoman();
            Thread.sleep(5000);
            TestSpiderMan2099();
    }

    private static void TestSpiderWoman() throws InterruptedException {
        Screen screen = new Screen();
        SpiderWoman sw = new SpiderWoman("Jessica Miriam Drew",
                                         "Spider Woman",
                                         "Tierra 616",
                                         "Marvel spotlight #32");
        screen.setVisible(true);
        sw.RayoVeneno(screen);
        Thread.sleep(3000);
        sw.Fuerza(screen);
        Thread.sleep(3000);
        sw.TrepaMuros(screen);
        Thread.sleep(3000);
        sw.Vuelo(screen);
        Thread.sleep(3000);
        sw.Agilidad(screen);
        Thread.sleep(3000);
        sw.Velocidad(screen);
        Thread.sleep(3000);
        sw.Resistencia(screen);
    }

    private static void TestSpiderBoy() throws InterruptedException {
        Screen screen = new Screen();
        SpiderBoy sb = new SpiderBoy("Miles Gonzalo Morales",
                                     "Spider Boy",
                                     "Tierra 1610",
                                     "Ultimate Comics Fallout #4");
        screen.setVisible(true);
        sb.Agilidad(screen);
        Thread.sleep(3000);
        sb.CamuflajeAracnido(screen);
        Thread.sleep(3000);
        sb.Fuerza(screen);
        Thread.sleep(3000);
        sb.Resistencia(screen);
        Thread.sleep(3000);
        sb.TrepaMuros(screen);
        Thread.sleep(3000);
        sb.Reflejos(screen);
        Thread.sleep(3000);
        sb.ExplosionEnergia(screen);
        Thread.sleep(3000);
        sb.Velocidad(screen);
        Thread.sleep(3000);
        sb.RayoVeneno(screen);
    }

    private static void TestSpiderMan2099() throws InterruptedException {
        Screen screen = new Screen();
        SpiderMan2099 sm = new SpiderMan2099("Miguel O'Hara",
                                             "Spider-Man 2099",
                                             "Tierra 928",
                                             "Amazing Spiderman #365");
        screen.setVisible(true);
        sm.Velocidad(screen);
        Thread.sleep(3000);
        sm.VisionAcelerada(screen);
        Thread.sleep(3000);
        sm.TrepaMuros(screen);
        Thread.sleep(3000);
        sm.TelaranaOrganica(screen);
        Thread.sleep(3000);
        sm.Agilidad(screen);
        Thread.sleep(3000);
        sm.GarrasColmillos(screen);
        Thread.sleep(3000);
        sm.Reflejos(screen);
        Thread.sleep(3000);
        sm.Fuerza(screen);
        Thread.sleep(3000);
        sm.Resistencia(screen);
    }

}


