package dev.gustavoteixeira.application;

import dev.gustavoteixeira.model.product.NewProduct;
import dev.gustavoteixeira.model.product.Product;
import dev.gustavoteixeira.model.product.UpdatedProduct;
import dev.gustavoteixeira.model.sale.NewSaleRecord;
import dev.gustavoteixeira.model.seller.NewSeller;
import dev.gustavoteixeira.model.seller.Seller;
import dev.gustavoteixeira.model.seller.UpdatedSeller;

import java.util.Arrays;
import java.util.List;

public interface SalesScoreApplication {

    Seller findSellerByRegistration(String registration);

    String createSeller(NewSeller newSeller);

    void updateSeller(String registration, UpdatedSeller seller);

    void deleteSeller(String registration);

    String createProduct(NewProduct newProduct);

    void updateProduct(String id, UpdatedProduct product);

    List<Product> listProducts();

    String create(NewSaleRecord toNewSaleRecord);

    List<Seller> highestSalesNumber();

    List<Seller> highestSalesValue();

    List<Product> bestSellingItems();
}
