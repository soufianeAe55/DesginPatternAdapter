import ancienne.AncieneImpl;

public class Adapter2  implements Standard{
    private AncieneImpl an=new AncieneImpl();
    @Override
    public void operation(double n1, double n2) {
         double p=an.produit(n1,n2);
         an.afficher(p);
    }
}
