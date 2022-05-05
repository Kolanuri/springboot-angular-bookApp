package com.sptingboot.application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sptingboot.application.dto.Book;

@SpringBootApplication
@RestController
public class BookserviceApplication {
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/findAllBooks")
		public List<Book> getBooks(){
			return Stream.of(new Book(101, "Java" ,898),
					new Book(102, "Hibernet" ,900),
					new Book(103,"Spring" ,1000)).collect(Collectors.toList());
			
		}
	

	public static void main(String[] args) {
		SpringApplication.run(BookserviceApplication.class, args);
	}

}
