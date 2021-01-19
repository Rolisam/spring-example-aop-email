package pl.bykowski.homeworkweek6.controler;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.bykowski.homeworkweek6.aop.SendEmail;
import pl.bykowski.homeworkweek6.model.Movie;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieApi {

    List<Movie> movies;

    public MovieApi() {

        movies = new ArrayList<>();
        movies.add(new Movie("Harry Potter i Kamień Filozoficzny","Chris Columbus", "2002"));
        movies.add(new Movie("Harry Potter i Komnata Tajemnic","Chris Columbus", "2003"));
        movies.add(new Movie("Harry Potter i więzień Azkabanu","Alfonso Cuarón", "2004"));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Movie>> getMovies() {

        return ResponseEntity.ok(movies);
    }

    @SendEmail
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        movies.add(movie);
        return ResponseEntity.ok().build();
    }

}
