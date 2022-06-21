//author Alex Znahur
package app;

import app.controllers.ProductController;
import app.models.Product;
import app.views.SalesView;

public class App {

    public static void main(String[] args) {

        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model,view);

        controller.runApp();
    }
}
