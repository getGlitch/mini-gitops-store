
package com.store.inventory;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @GetMapping
    public List<Map<String, Object>> getInventory() {
        return List.of(
            Map.of(
                "productId", 1,
                "productName", "Laptop",
                "availableQuantity", 25,
                "inStock", true
            ),
            Map.of(
                "productId", 2,
                "productName", "Keyboard",
                "availableQuantity", 100,
                "inStock", true
            ),
            Map.of(
                "productId", 3,
                "productName", "Monitor",
                "availableQuantity", 0,
                "inStock", false
            )
        );
    }
}
