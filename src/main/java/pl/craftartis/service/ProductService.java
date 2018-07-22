package pl.craftartis.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
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
		List<Product> products = productRepository.findAllByCategoryIdOrderByCreated(id);

		// for(Product product : products) {
		// if(product.getJpg1() != null) {
		// String jpg1 = product.getJpg1();
		// product.setJpg1File(decoder(jpg1));
		// }
		// }

		return products;

		// List<Product> products =
		// productRepository.findAllByCategoryIdOrderByCreated(id);
		//
		// for(Product product : products) {
		//
		// if(product.getJpg1() != null) {
		// String jpg1 = product.getJpg1();
		// decoderTest(jpg1, "/home/triskelion/test.jpg");
		// System.out.println(jpg1);
		// }
		//
		// }

		// return productRepository.findAllByCategoryIdOrderByCreated(id);
	}

	@Transactional
	public void addToDB(Product product) {
		if (product.getJpg1() != null) {
			String imagePath1 = product.getJpg1();
			product.setJpg1(encoder(imagePath1));
		}
		
		if (product.getJpg2() != null) {
			String imagePath2 = product.getJpg2();
			product.setJpg2(encoder(imagePath2));
		}
		
		if (product.getJpg3() != null) {
			String imagePath3 = product.getJpg3();
			product.setJpg3(encoder(imagePath3));
		}
		
		productRepository.save(product);
	}
	
	@Transactional
	public void editDB(Product product) {
		if (product.getJpg1() != null) {
			String imagePath1 = product.getJpg1();
			product.setJpg1(encoder(imagePath1));
		}
		

		if (product.getJpg2() != null) {
			String imagePath2 = product.getJpg2();
			product.setJpg2(encoder(imagePath2));
		}
		

		if (product.getJpg3() != null) {
			String imagePath3 = product.getJpg3();
			product.setJpg3(encoder(imagePath3));
		}
		
		productRepository.save(product);
	}

	@Transactional
	public Product getProductById(Long id) {

		Product product = productRepository.findOne(id);
		String jpg1 = product.getJpg1();

		//product.setJpg1File(decoder(jpg1));

		return product;
	}

	@Transactional
	public void deleteFromDB(Long id) {
		productRepository.delete(id);
	}

	/******** JPG to String converter ************/
	public static String encoder(String imagePath) {
		String base64Image = "";
		File file = new File(imagePath);

		try (FileInputStream imageInFile = new FileInputStream(file)) {
			byte imageData[] = new byte[(int) file.length()];
			imageInFile.read(imageData);
			base64Image = Base64.getEncoder().encodeToString(imageData);
		} catch (FileNotFoundException e) {
			System.out.println("Image not found" + e);
		} catch (IOException ioe) {
			System.out.println("Exception while reading the Image " + ioe);
		}

		return base64Image;
	}

	/******* String to JPG converter **************/
	public static byte[] decoder(String base64Image) {

		byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
		return imageByteArray;
	}

	// public static void decoderTest(String base64Image, String pathFile) {
	// try (FileOutputStream imageOutFile = new FileOutputStream(pathFile)) {
	// byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
	// imageOutFile.write(imageByteArray);
	// } catch (FileNotFoundException e) {
	// System.out.println("111111111111 Image not found" + e);
	// } catch (IOException ioe) {
	// System.out.println("222222222222 Exception while reading the Image " + ioe);
	// }
	// }

}
