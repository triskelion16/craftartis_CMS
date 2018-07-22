package pl.craftartis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.craftartis.entity.Category;
import pl.craftartis.entity.Product;
import pl.craftartis.service.CategoryService;
import pl.craftartis.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {
	
	private ProductService productService;
	private CategoryService categoryService;

	@Autowired
	public ProductController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	
	@ModelAttribute("categories")
	public List<Category> getCategories() {
		return categoryService.getCategories();
	}

	/***** Index *******************************/
	@GetMapping("/index")
	public String homePage(Model model) {
		model.addAttribute("news", productService.getProductsByCategoryId(1L));
		model.addAttribute("clothes", productService.getProductsByCategoryId(2L));
		model.addAttribute("accessories", productService.getProductsByCategoryId(3L));
		model.addAttribute("toys", productService.getProductsByCategoryId(4L));
		model.addAttribute("others", productService.getProductsByCategoryId(5L));
		return "index";
	}

	/***** ADD *******************************/
	@GetMapping("/add")
	public String addGet(Model model) {
		model.addAttribute("products", new Product());
		return "add";
	}
	
	@PostMapping("/add")
	public String addPost(@ModelAttribute Product product) {
		productService.addToDB(product);
		return "redirect:/index";
	}
	
	/***** EDIT *******************************/
	@GetMapping("/edit/{id}")
	public String editGet(@PathVariable Long id, Model model) {
		model.addAttribute("products", productService.getProductById(id));
		return "add";
	}
	
	@PostMapping("/edit/{id}")
	public String editPost(@ModelAttribute Product product) {
		productService.editDB(product);
		return "redirect:/index";
	}
	
	/***** DELETE *******************************/
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		productService.deleteFromDB(id);
		return "redirect:/index";
	}
	
	
}
