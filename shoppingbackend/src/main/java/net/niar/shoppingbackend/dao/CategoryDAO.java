package net.niar.shoppingbackend.dao;

import java.util.List;

import net.niar.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
	
}
