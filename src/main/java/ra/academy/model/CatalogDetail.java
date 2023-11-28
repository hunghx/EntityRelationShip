package ra.academy.model;

import lombok.*;

import javax.persistence.*;

//@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter  // phương thức getter
@Setter // phương thức setter
@Builder // tự tâo constructor tùy ý
public class CatalogDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "catalogId")
    private Catalog catalog;
    @Column(columnDefinition = "text")
    private  String content;


}
