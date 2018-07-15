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
import pl.craftartis.repository.CategoryRepository;
import pl.craftartis.repository.ProductRepository;

@Controller
@RequestMapping("/")
public class ProductController {
	
	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;

	@Autowired
	public ProductController(ProductRepository productRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}
	
	
	@ModelAttribute("categories")
	public List<Category> getCategories() {
		return categoryRepository.findAll();
	}

	/***** Index *******************************/
	@GetMapping("/index")
	public String homePage(Model model) {
		model.addAttribute("news", productRepository.findAllByCategoryId(1L));
		model.addAttribute("clothes", productRepository.findAllByCategoryId(2L));
		model.addAttribute("accessories", productRepository.findAllByCategoryId(3L));
		model.addAttribute("toys", productRepository.findAllByCategoryId(4L));
		model.addAttribute("others", productRepository.findAllByCategoryId(5L));
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
		productRepository.save(product);
		return "redirect:/index";
	}
	
	/***** EDIT *******************************/
	@GetMapping("/edit/{id}")
	public String editGet(@PathVariable Long id, Model model) {
		model.addAttribute("products", productRepository.findOne(id));
//		model.addAttribute("news", productRepository.findOne(id));
//		model.addAttribute("clothes", productRepository.findOne(id));
//		model.addAttribute("accessories", productRepository.findOne(id));
//		model.addAttribute("toys", productRepository.findOne(id));
//		model.addAttribute("others", productRepository.findOne(id));
		return "add";
	}
	
	@PostMapping("/edit/{id}")
	public String editPost(@ModelAttribute Product product) {
		productRepository.save(product);
		return "redirect:/index";
	}
	
	/***** DELETE *******************************/
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		productRepository.delete(id);
		return "redirect:/index";
	}
	
	
}
