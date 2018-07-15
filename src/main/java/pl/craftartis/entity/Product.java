package pl.craftartis.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*@Max(value = 20)*/
	@Column(nullable = false)
	private String name;
	
	private String description;
	
	private Date created = new Date();
	
	@ManyToOne
	private Category category;
	
	private String jpg1;
	private String jpg2;
	private String jpg3;
	
	
	public Product() {}
	
	public Product(Long id, String name, String description, Date created, Category category, String jpg1, String jpg2,
			String jpg3) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.created = created;
		this.category = category;
		this.jpg1 = jpg1;
		this.jpg2 = jpg2;
		this.jpg3 = jpg3;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getJpg1() {
		return jpg1;
	}

	public void setJpg1(String jpg1) {
		this.jpg1 = jpg1;
	}

	public String getJpg2() {
		return jpg2;
	}

	public void setJpg2(String jpg2) {
		this.jpg2 = jpg2;
	}

	public String getJpg3() {
		return jpg3;
	}

	public void setJpg3(String jpg3) {
		this.jpg3 = jpg3;
	}

}
