package com.myonlineshop.db;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.myonlineshop.model.Product;

public class Db {

	private static final long serialVersionUID = 1L;
	private DataSource dataSource;
	private JdbcTemplate template;

	public Db() {

	}

	public DataSource getDataSource() {

		return this.dataSource;
	}

	@Autowired
	public void setDataSource(DataSource source) {
		this.dataSource = source;
		this.template = new JdbcTemplate(source);
	}

	public int insert(Product p) {
		// TODO Auto-generated method stub

		String sql = "insert into products values(null,?,?,?,?)";
		return (int) template.update(sql, p.getName(), p.getMake(), p.getDescription(), p.getPrice());
	}

	public List<Product> getProducst(){
		List<Product> products = new ArrayList<Product>();
		this.template.query("SELECT * FROM products",
		        (rs, rowNum) -> new Product(rs.getInt("id"), rs.getString("name"), rs.getString("make")
		        		,rs.getString("description"), (rs.getLong("price"))),"")
		    .forEach(product -> products.add(product));
		
		return products;
	}
}
