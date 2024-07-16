public class Dietitian extends HealthProfessional{

    private String dietitianSpecificInfo;

    public Dietitian() {
    }

    public Dietitian(int id, String name, String basicInfo, String dietitianSpecificInfo) {
        super(id, name, basicInfo);
        this.dietitianSpecificInfo = dietitianSpecificInfo;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Dietitian Specific Info: " + dietitianSpecificInfo);
    }

}
