package practicaMultiverse;

public class SpiderMan {

    private String name;
    private String alias;
    private String origin;
    private String appearance;

    public SpiderMan(String name, String alias, String origin, String appearance) {
        this.name = name;
        this.alias = alias;
        this.origin = origin;
        this.appearance = appearance;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getOrigin() {
        return origin;
    }

    public String getAppearance() {
        return appearance;
    }

    public String showMessage(){
        return "Name: " + name + "\n" +
                "Alias: " + alias + "\n" +
                "Origin: " + origin + "\n" +
                "Appearance: " + appearance + "\n\n";
    }

}
