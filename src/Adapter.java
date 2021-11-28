import ancienne.AncieneImpl;

public class Adapter extends AncieneImpl implements Standard{
    @Override
    public void operation(double n1, double n2) {
         double p=produit(n1,n2);
         afficher(p);
    }
}
