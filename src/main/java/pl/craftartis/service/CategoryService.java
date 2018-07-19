package pl.craftartis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.craftartis.entity.Category;
import pl.craftartis.repository.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;

	@Autowired
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@Transactional
	public List<Category> getCategories() {
		return categoryRepository.findAll();
	}

}
