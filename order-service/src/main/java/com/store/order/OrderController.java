
package com.store.order;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public List<Map<String, Object>> getOrders() {
        return List.of(
            Map.of(
                "id", 101,
                "productId", 1,
                "quantity", 2,
                "status", "CONFIRMED"
            ),
            Map.of(
                "id", 102,
                "productId", 2,
                "quantity", 1,
                "status", "PROCESSING"
            )
        );
    }
}
