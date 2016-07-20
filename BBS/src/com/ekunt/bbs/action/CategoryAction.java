package com.ekunt.bbs.action;

import java.util.List;

import com.ekunt.bbs.model.Category;
import com.ekunt.bbs.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport {
	private List<Category> categorylist;
	private CategoryService categoryService = new CategoryService();
	private Category category;
	private int categoryId;
	
	public String list() throws Exception {
		categorylist = categoryService.list();
		return SUCCESS;
	}
	public String add() throws Exception {
		categoryService.add(category);
		return SUCCESS;
	}
	public String update() throws Exception {
		categoryService.update(category);
		return SUCCESS;
	}
	public String delete() throws Exception {
		categoryService.deleteById(categoryId);
		return SUCCESS;
	}
	public String addInput() throws Exception {
		return INPUT;
	}
	public String updateInput() throws Exception {
		this.category = categoryService.loadById(categoryId);
		return INPUT;
	}
	
	public List<Category> getCategorylist() {
		return categorylist;
	}
	public void setCategorylist(List<Category> categorylist) {
		this.categorylist = categorylist;
	}
	public CategoryService getCategoryService() {
		return categoryService;
	}
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
}
