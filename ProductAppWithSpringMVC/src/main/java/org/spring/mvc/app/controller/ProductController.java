package org.spring.mvc.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.spring.mvc.app.dao.ProductDao;
import org.spring.mvc.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ProductController {

//	Inject Dao Object in Controller class
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String dashboard(Model model) {
		
		model.addAttribute("title", "Product List");
		List<Product> allProducts = productDao.getAllProducts();
		model.addAttribute("product", allProducts);
		return "home";
		
	}

//	To show add-product form
	@RequestMapping("/add-product")
	public String addProduct(Model model) {

		model.addAttribute("title", "Add Product");
		System.out.println("ProductController.addProduct()");
		return "add_product_form";
		
	}
	
//	To handle add-product form
	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {

		System.out.println("ProductData----: "+product);
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;	
		
	}

//	To delete the product	
	@RequestMapping(path = "/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId , HttpServletRequest request) {

		System.out.println("ProductId----: "+productId);
		productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}
	
//	To update the product	
	@RequestMapping(path = "/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId , Model model) {

		System.out.println("ProductId----: "+productId);
		Product product = productDao.getProduct(productId);
		model.addAttribute("product", product);
		model.addAttribute("title", "Update Product");
		return "update_form";
		
	}
	
}
