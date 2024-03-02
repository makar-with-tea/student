package ru.hse.product.storage.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.hse.product.storage.api.StudentApi;
import ru.hse.product.storage.api.dto.Student;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "product-storage", url = "${product.storage.url}")
public interface ProductClient extends StudentApi {

    @GetMapping("/api/v1/product")
    List<Student> findProducts(
            @RequestParam(required = false, name = "name", defaultValue = "") String name,
            @RequestParam(required = false, name = "id") List<UUID> ids);

    @GetMapping("/api/v1/product/{id}")
    DetailedProduct getProductById(@PathVariable(name = "id") UUID id);

    @PostMapping("/api/v1/product")
    Product createProduct(@RequestBody DetailedProduct detailedProduct);

    @PutMapping("/api/v1/product/{id}")
    void editProduct(@PathVariable(name = "id") UUID id, @RequestBody DetailedProduct detailedProduct);

    @DeleteMapping("/api/v1/product/{id}")
    void deleteProduct(@PathVariable(name = "id") UUID id);
}
