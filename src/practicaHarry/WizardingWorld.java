package practicaHarry;

public class WizardingWorld {

    public static void main(String[] args) {
        Characters harry = new Characters("Harry James Potter","Male","Stag","Gryffindor","Half-boold","Dementor");
        Characters hermione = new Characters("Hermione Jean Granger","Female","Otter","Gryfindor","Muggle born","Failure");
        Characters bellatrix = new Characters("Bellatrix Lestrange", "Female","Slytherin","Pure blood");
        Characters nagini = new Characters("Nagini","Female","Underbeing");
        Characters sirius = new Characters("Sirius Black III","Male","Non-corporeal","Gryffindor","Pure blood","Lord Voldemort");

        System.out.println("Welcome to Wizarding World\n");

        System.out.println("Name: " + harry.getName() + " \n" +
                "Gender: " + harry.getGender() + " \n" +
                "Patronus: " + harry.getPatrons() + " \n" +
                "House: " + harry.getHouse() + " \n" +
                "Blood Status: " + harry.getBloodStatus() + " \n" +
                "Boggart: " + harry.getBoggart() + "\n\n");

        System.out.println("Name: " + hermione.getName() + " \n" +
                "Gender: " + hermione.getGender() + " \n" +
                "Patronus: " + hermione.getPatrons() + " \n" +
                "House: " + hermione.getHouse() + " \n" +
                "Blood Status: " + hermione.getBloodStatus() + " \n" +
                "Boggart: " + hermione.getBoggart() + "\n\n");

        System.out.println("Name: " + bellatrix.getName() + " \n" +
                "Gender: " + bellatrix.getGender() + " \n" +
                "House: " + bellatrix.getHouse() + " \n" +
                "Blood Status: " + bellatrix.getBloodStatus() + "\n\n");

        System.out.println("Name: " + nagini.getName() + " \n" +
                "Gender: " + nagini.getGender() + " \n" +
                "Blood Status: " + nagini.getBloodStatus() + "\n\n");

        System.out.println("Name: " + sirius.getName() + " \n" +
                "Gender: " + sirius.getGender() + " \n" +
                "Patronus: " + sirius.getPatrons() + " \n" +
                "House: " + sirius.getHouse() + " \n" +
                "Blood Status: " + sirius.getBloodStatus() + " \n" +
                "Boggart: " + sirius.getBoggart() + "\n\n");


    }

}
