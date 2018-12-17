
import java.util.*;
import javax.swing.ImageIcon;

public abstract class ProductService {

    public static ArrayList<Product> showAllProduct() {
        return ProductDao.getAllProducts();
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }

    public static boolean addProduct(Product product) {
        return ProductDao.addProduct(product);
    }

    public static void getInfo(String page) {
        ArrayList<Product> product = ProductService.showAllProduct();
        int i = 1;
        for (Product e : product) {
            Product product1 = ProductService.getProduct(e.getId());
            if (page.equals("1")) {
                if (i == 1) {
                    MainPage.lbl_Name1.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic1.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S02")) {
                    MainPage.lbl_Name2.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic2.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S03")) {
                    MainPage.lbl_Name3.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic3.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S04")) {
                    MainPage.lbl_Name4.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic4.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S05")) {
                    MainPage.lbl_Name5.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic5.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S06")) {
                    MainPage.lbl_Name6.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic6.setIcon(new ImageIcon(e.getPicture()));

                }

            } else if (page.equals("2")) {
                if (e.getId().equals("S07")) {
                    MainPage.lbl_Name1.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic1.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S08")) {
                    MainPage.lbl_Name2.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic2.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S09")) {
                    MainPage.lbl_Name3.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic3.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S10")) {
                    MainPage.lbl_Name4.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic4.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S11")) {
                    MainPage.lbl_Name5.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic5.setIcon(new ImageIcon(e.getPicture()));
                } else if (e.getId().equals("S12")) {
                    MainPage.lbl_Name6.setText(product1.getName().toUpperCase());
                    MainPage.lbl_Pic6.setIcon(new ImageIcon(e.getPicture()));

                }

            }
            i++;
        }
    }

}
