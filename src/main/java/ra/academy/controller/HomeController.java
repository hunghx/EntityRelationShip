package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.academy.model.Catalog;
import ra.academy.model.Product;
import ra.academy.model.Provider;
import ra.academy.repository.ICatalogRepository;
import ra.academy.repository.IProductRepository;
import ra.academy.repository.IProviderRepository;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ICatalogRepository catalogRepository;
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private IProviderRepository providerRepository;
    @RequestMapping("/home")
    public  String home(){

        catalogRepository.deleteById(1L);
         return "home";
    }
    @RequestMapping("/add")
    public  String add (){
        // thêm mới nhà cung cấp
//        Product p1 = new Product(1L,"SP01","hehe",100,99,true,null,null);
//        Product p2 = new Product(2L,"SP02","hehe",100,99,true,null,null);

        Provider pr1 = new Provider(1L,"China", Arrays.asList(Product.builder().id(5L).build()
                ,Product.builder().id(6L).build()));
//        p1.setProviders(Arrays.asList(new Provider()));
//        p2.setProviders(Arrays.asList(pr1));

        providerRepository.save(pr1);
        return "home";
    }

    @RequestMapping("/getAll")
    public String gettAll(){
        Provider provider = providerRepository.findById(4L).orElse(null);
       return "home";
    }
}
