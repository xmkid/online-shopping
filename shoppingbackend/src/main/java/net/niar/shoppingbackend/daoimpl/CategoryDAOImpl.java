package net.niar.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.niar.shoppingbackend.dao.CategoryDAO;
import net.niar.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(0);
		category.setName("iphonex");
		category.setDescription("iphone x");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);

		category = new Category();
		category.setId(1);
		category.setName("iphone7");
		category.setDescription("iphone 7");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("iphone6");
		category.setDescription("iphone 6");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category: categories) {
			if (category.getId() == id) {
				return category;
			}
			
		}
		
		return null;
	}

	
}
