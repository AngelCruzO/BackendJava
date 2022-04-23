package practicaHarry;

public class Characters {

    String name,gender,patronus,house,bloodStatus,boggart;

    public Characters(){

    }

    public Characters(String name, String house){
        this.name = name;
        this.house = house;
    }

    public Characters(String name, String gender, String bloodStatus){
        this.name = name;
        this.gender = gender;
        this.bloodStatus = bloodStatus;
    }

    public Characters(String name, String gender, String house, String bloodStatus){
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.bloodStatus = bloodStatus;
    }

    public Characters(String name, String gender, String pratonus, String house, String bloodStatus, String boggart){
        this.name = name;
        this.gender = gender;
        this.patronus = pratonus;
        this.house = house;
        this.bloodStatus = bloodStatus;
        this.boggart = boggart;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPatrons() {
        return patronus;
    }

    public String getHouse(){
        return house;
    }

    public String getBloodStatus() {
        return bloodStatus;
    }

    public String getBoggart() {
        return boggart;
    }

}
