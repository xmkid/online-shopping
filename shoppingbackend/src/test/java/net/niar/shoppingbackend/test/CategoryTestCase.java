package net.niar.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.niar.shoppingbackend.dao.CategoryDAO;
import net.niar.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;	
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.niar.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("iphonex");
		category.setDescription("iphone x");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("iphone7");
		category.setDescription("iphone 7");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("iphone6");
		category.setDescription("iphone 6");
		category.setImageURL("CAT_3.png");
		
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
	}
}
 