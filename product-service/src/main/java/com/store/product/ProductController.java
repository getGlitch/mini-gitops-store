
package com.store.product;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Map<String, Object>> getProducts() {
        return List.of(
            Map.of(
                "id", 1,
                "name", "Laptop",
                "price", 65000,
                "category", "Electronics"
            ),
            Map.of(
                "id", 2,
                "name", "Keyboard",
                "price", 2500,
                "category", "Accessories"
            ),
            Map.of(
                "id", 3,
                "name", "Monitor",
                "price", 15000,
                "category", "Electronics"
            )
        );
    }
}
