package ra.academy.dto;

import javax.persistence.Column;
import java.util.List;

public class ProductRequest {
    private String name;
    private String description;
    private double price;
    private int stock;
    private Long catalogId;

    public ProductRequest() {
    }

    public ProductRequest(String name, String description, double price, int stock, Long catalogId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.catalogId = catalogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }
}
