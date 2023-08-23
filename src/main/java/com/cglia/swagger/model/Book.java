package com.cglia.swagger.model;
@Entity
public class Book {
	@Id
	@GeneratedValue
	private int bookId;
	private String bookName;
	private double price;
}
