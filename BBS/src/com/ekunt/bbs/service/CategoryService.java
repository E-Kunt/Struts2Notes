package com.ekunt.bbs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ekunt.bbs.model.Category;
import com.ekunt.bbs.utils.DB;

public class CategoryService {
	
	public List<Category> list() throws Exception {
		List<Category> Categorylist = new ArrayList<Category>();
		Category c = null;
		Connection conn = DB.createConn();
		String sql = "select * from _category";
		PreparedStatement pstmt = DB.prepare(conn,sql);
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery();
			while(rs.next()) {
				c = new Category();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setDescription(rs.getString("description"));
				Categorylist.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DB.close(rs);
			DB.close(pstmt);
			DB.close(conn);
		}
		return Categorylist;
	}

	public void add(Category c) throws Exception {
		Connection conn = DB.createConn();
		String sql = "insert into _category values(null,?,?)";
		PreparedStatement pstmt = DB.prepare(conn, sql);
		try {
			pstmt.setString(1,c.getName());
			pstmt.setString(2, c.getDescription());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DB.close(pstmt);
			DB.close(conn);
		}
		
	}
	
	public void delete(Category c) throws Exception {
		deleteById(c.getId());
	}
	
	public void deleteById(int id) throws Exception {
		Connection conn = DB.createConn();
		String sql = "delete from _category where id = ?";
		PreparedStatement pstmt = DB.prepare(conn, sql);
		try {
			pstmt.setInt(1,id);
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DB.close(pstmt);
			DB.close(conn);
		}
	}
	
	public void update(Category c) throws Exception {
		Connection conn = DB.createConn();
		String sql = "update _category set name = ?, description = ? where id = ?";
		PreparedStatement pstmt = DB.prepare(conn, sql);
		try {
			pstmt.setString(1,c.getName());
			pstmt.setString(2, c.getDescription());
			pstmt.setInt(3, c.getId());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DB.close(pstmt);
			DB.close(conn);
		}
	}
	
	public Category loadById(int id) throws Exception {
		Category c = null;
		Connection conn = DB.createConn();
		String sql = "select * from _category where id = ?";
		PreparedStatement pstmt = DB.prepare(conn,sql);
		ResultSet rs = null;
		try {
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				c = new Category();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			DB.close(rs);
			DB.close(pstmt);
			DB.close(conn);
		}
		return c;
	}
	
}
