public class Client {
    private Standard standard;

    public void traitement(double a,double b) {
        System.out.println("***************************");
        System.out.println("---------------------------");
        standard.operation(a,b);
        System.out.println("###########################");
        System.out.println("****************************");
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
