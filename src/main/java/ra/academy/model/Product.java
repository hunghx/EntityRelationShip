package ra.academy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter  // phương thức getter
@Setter // phương thức setter
@Builder // tự tâo constructor tùy ý
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    private double price;
    private int stock;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "catalogId")
    private Catalog catalog;

    @ManyToMany(mappedBy = "products")
    @JsonIgnore // bỏ qua việc lấy dữ liệu
    private List<Provider> providers;


}
