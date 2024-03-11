package com.example.demo;


import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerJson {

    Movie[] movies = {
                
        new Movie(0 , "Avengers: Age of Ultron", "There is only one path to peace... your extinction.", "Ultron"),
        new Movie(1, "Barbie", "Teste.", "Barbie"),
        new Movie(2,  "hacker", "Teste.", "hacker"),
        new Movie(3, "Avengers: Infinity War", "You Will Never Be A God.", "Loki"),
        new Movie(4, "Thor Ragnarok", "Your Savior Is Here!", "Loki"),
        new Movie(5, "The Avengers", "I'm always angry.", "Bruce Banner"),
        new Movie(6, "Spider " , "I'm sorry, you're saying there's a multiverse?", "Peter Parker"),
        new Movie(7, "Man Homecoming", "I'm sorry, you're saying there's a multiverse?", "Peter Parker"),
        new Movie(8, "Black Panther", "Wakanda Forever!", "T'Challa"),
        new Movie(9, "Doctor Strange", "Dormammu, I've come to bargain!", "Stephen Strange"),
        new Movie(10, "Guardians of the Galaxy", "I am Groot.", "Groot"),
        new Movie(11, "Guardians of the Galaxy Vol. 2", "I am Groot.", "Groot"),
        new Movie(12, "Captain Marvel", "I'm not gonna fight your war. I'm gonna end it.", "Carol Danvers"),
  
    };

    @GetMapping("/quotes")
public Movie quote_movie(@RequestParam(value = "show", defaultValue = "0") int showId) {
    
    return movies[new Random().nextInt(movies.length)];
}


    @GetMapping("/shows")
	public Movie[] shows() {
		return movies;
	}

    @GetMapping("/quote")
	public Movie quote() {
		return movies[new Random().nextInt(movies.length)];
	}
}