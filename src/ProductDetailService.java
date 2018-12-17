
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ProductDetailService {

    static String usercurrent;
    static String blue = "น้ำเงิน";
    static String gray = "เทา";
    static String red = "แดง";
    static String brown = "น้ำตาล";
    static String pink = "ชมพู";
    static String black = "ดำ";
    static String yellow = "เหลือง";

    public static void showProductDetail() {
        ProductDetailForm productdetail = new ProductDetailForm();
        productdetail.setVisible(true);
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }

    public static String changeEngtoThaiColor(String color) {
        if (color.equals("blue")) {
            return blue;
        } else if (color.equals("gray")) {
            return gray;
        } else if (color.equals("red")) {
            return red;
        } else if (color.equals("brown")) {
            return brown;
        } else if (color.equals("pink")) {
            return pink;
        } else if (color.equals("yellow")) {
            return yellow;
        }
        return black;
    }

    public static void getDetailProduct(Product pid) {

        String setcolor = changeEngtoThaiColor(pid.getColor());
        getPicture(pid);
        //ProductDetailFrame.nameproduct.setText(pid.getName().toUpperCase());
        ProductDetailForm.bandtxt.setText(pid.getBrand());
        ProductDetailForm.colortxt.setText(setcolor);
        ProductDetailForm.sizetxt.setText(pid.getSize());
        ProductDetailForm.pricetxt.setText("" + pid.getPrice());
        ProductDetailForm.nameproduct.setText(pid.getName().toUpperCase());

    }

    public static void getPicture(Product pid) {
        if (pid.getId().equals("S01")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S01");

        } else if (pid.getId().equals("S02")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S02");
        } else if (pid.getId().equals("S03")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S03");
        } else if (pid.getId().equals("S04")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S04");
        } else if (pid.getId().equals("S05")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S05");
        } else if (pid.getId().equals("S06")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S06");
        } else if (pid.getId().equals("S07")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S07");
        } else if (pid.getId().equals("S08")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S08");
        } else if (pid.getId().equals("S09")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S09");
        } else if (pid.getId().equals("S10")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S10");
        } else if (pid.getId().equals("S11")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S11");
        } else if (pid.getId().equals("S12")) {
            ProductDetailForm.pic1.setIcon(new ImageIcon(pid.getPicture()));
            ProductDetailForm.pIdtxt.setText("S12");
        }
    }

    public static void increaseNumofProduct() {
        int index = Integer.parseInt(ProductDetailForm.numtxt.getText());
        index = index + 1;
        ProductDetailForm.numtxt.setText("" + index);
    }

    public static void decreaseNumofProduct() {
        int index = Integer.parseInt(ProductDetailForm.numtxt.getText());
        index = index - 1;
        if (index > 0) {
            ProductDetailForm.numtxt.setText("" + index);
        }

    }

    public static void showComfirmProductToCart() {
        JOptionPane.showMessageDialog(null, "คุณได้ทำการเพิ่มสินค้าไปยังตะกร้าเรียบร้อยแล้ว");
        int index = JOptionPane.showConfirmDialog(null,
                "คุณต้องการไปยังหน้าตะกร้าสินค้าเลยหรือไม่ ??", "Go to Cart or Not?",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        showCartPage(index);
    }

    public static void showCartPage(int index) {
        if (index == 0) {
            CartService.showCartPage();
            CartService.showList();
        }

    }

    public static void addProductToCart() {
        usercurrent = LoginForm.userCurrent;
        User user = UserService.getUser(usercurrent);
        Product product = ProductService.getProduct(ProductDetailForm.pIdtxt.getText());
        int num = Integer.parseInt(ProductDetailForm.numtxt.getText());
//        System.out.println(user + " " + product + " " + num);
        CartService.addToCart(user, product, num);

    }

}
