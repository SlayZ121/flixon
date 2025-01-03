package dev.dorkboy.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface MovieRepository extends MongoRepository<Movie,ObjectId>{

    Optional<Movie> findMovieByImdbId(String imdbId);

}
