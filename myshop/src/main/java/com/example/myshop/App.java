package com.example.myshop;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Order order = context.getBean("order", Order.class);

		Product product = context.getBean("product", Product.class);
		product.setBrand("Samsung");
		product.setId(1);
		product.setName("Note");
		product.setPrice(222.33f);

		order.addProduct(product);

		product = context.getBean("product", Product.class);
		product.setBrand("Apple");
		product.setId(2);
		product.setName("iPhone");
		product.setPrice(900.00f);

		order.addProduct(product);

		order.getTotal();
		order.submit();

		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.println("Bye!");
	}
}
