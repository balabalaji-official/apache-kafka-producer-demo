package com.balajiofficial.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.balajiofficial.kafka.model.Book;

@RestController
public class KafkaProducer {
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate1;
	
	@Autowired
	KafkaTemplate<String, Book> kafkaTemplate2;
	
	private static final String TOPIC ="test";
	
	@GetMapping("/publish/{msg}")
	public String publishMessage(@PathVariable("msg") String msg) {
		kafkaTemplate1.send(TOPIC,msg);
		return "String msg sent successfully";
	}
	
	@PutMapping("/publish")
	public String publishMessageBook(@RequestBody Book book) {
		kafkaTemplate2.send(TOPIC,book);
		return "Book msg sent successfully";
	}
}
