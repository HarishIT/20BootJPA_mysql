package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class MySqlRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		//1...to save one object
		/*repo.save(new Product("A1",3.3));
		repo.save(new Product("B1",4.4));
		repo.save(new Product("C1",5.5));

		//2...to update one object
		repo.save(new Product(1,"NEW",1.1));

		//3...to insert the Bulk data
		List<Product> proList=Arrays.asList(
				new Product(10,"x",9.9),
				new Product(11,"y",8.8),
				new Product(12,"z",7.7)
				);
		repo.saveAll(proList);
		//4...fetch one row
		Optional<Product> p=repo.findById(1);
		if (p.isPresent()) {
			Product product=p.get();
			System.out.println(product);
			System.out.println(product.getProdCode());
		}else {
			System.out.println("id not found");
		}
       //5....to fetch all row 
		List<Product> list=repo.findAll();
		for (Product product : list) {
			System.out.println(product);
		}
		//6.... delete one row based on id
		repo.deleteById(1);
		//7...to delete all one by one
		repo.deleteAll();
		//8..../delete row at a time all
		repo.deleteAllInBatch();*/
		
		repo.save(new Product("B1",4.4));
		repo.save(new Product("C1",5.5));
	}

}
