package isp;

public class Lion implements BougerFelin {
    @Override
    public void courir() {
        System.out.println("Je peux courir");
    }

    @Override
    public void marcher() {
        System.out.println("Je peux marcher");
    }
}
