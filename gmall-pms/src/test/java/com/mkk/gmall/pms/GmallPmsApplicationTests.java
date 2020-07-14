package com.mkk.gmall.pms;

import com.mkk.gmall.pms.entity.Product;
import com.mkk.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    void contextLoads() {
        Product product = productService.getById(1);
        System.out.println(product);
    }

}
