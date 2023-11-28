package ra.academy.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Catalogs")
@NoArgsConstructor
@AllArgsConstructor
@Getter  // phương thức getter
@Setter // phương thức setter
@Builder // tự tâo constructor tùy ý
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 100,nullable = false,unique = true)
    private String name;

    @Column(columnDefinition = "text")
    private String description;
    private boolean status;
    // mappedby dùng để tạo liên kết giữa 2 đối tượng trong quan hệ
//    @OneToOne(fetch = FetchType.EAGER,mappedBy ="catalog") // fetch : là lấy dữ liệu về sớm hay muộn
//    private CatalogDetail catalogDetail;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "catalog",cascade = CascadeType.ALL)
    private Set<Product> products;


}
