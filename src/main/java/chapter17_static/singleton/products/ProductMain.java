package chapter17_static.singleton.products;

public class ProductMain {
    public static void main(String[] args) {

        ProductView productView1 =ProductView.getInstnace();
        ProductView productView2 =ProductView.getInstnace();
        ProductView productView3 =ProductView.getInstnace();
        ProductView productView4 =ProductView.getInstnace();

        productView1.showMainView();
        productView2.showMainView();
        productView3.showMainView();
        productView4.showMainView();

    }
}
