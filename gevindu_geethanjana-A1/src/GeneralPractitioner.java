public class GeneralPractitioner extends HealthProfessional{

    private String areaOfFocus;

    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int id, String name, String basicInfo, String areaOfFocus) {
        super(id, name, basicInfo);
        this.areaOfFocus = areaOfFocus;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Area of Focus : " + areaOfFocus);
    }

}
