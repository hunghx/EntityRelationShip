package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ra.academy.model.Product;
import ra.academy.service.IProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping(value = "/getAll",produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Product> getAll(){
        return productService.findAll();
    }
}
