package pl.craftartis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.craftartis.entity.Product;
import pl.craftartis.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Transactional
	public List<Product> getProductsByCategoryId(Long id) {
		return productRepository.findAllByCategoryIdOrderByCreated(id);
	}
	
	@Transactional
	public void saveToDB(Product product) {
		productRepository.save(product);
	}
	
	@Transactional
	public Product getProductById(Long id) {
		return productRepository.findOne(id);
	}
	
	@Transactional
	public void deleteFromDB(Long id) {
		productRepository.delete(id);
	}
}
