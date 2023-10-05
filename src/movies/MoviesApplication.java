package movies;
import util.Input;

import java.util.Arrays;

//import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();

        System.out.println("Would you like to view all movies or by category?");
        System.out.println("1. View All");
        System.out.println("2. View By Category");

   Input userChoice = new Input();
   int choice = userChoice.getInt();

   if (choice == 1) {
       for (Movie movie: movies) {
           System.out.println(movie.getName(movie));
       }
   } else if (choice == 2){
       choice = userChoice.getInt();
       System.out.println("Which category of movies would you like to see?");
       System.out.println("1. drama");
       System.out.println("2. musical");
       System.out.println("3. sci-fi");
       System.out.println("4. animated");
       System.out.println("5. comedy");
       System.out.println("6. horror");
       if (choice == 1) {
           for (int i = 0; i < movies.length; i++) {
                if (Movie.getCategory(movies[i]).endsWith(("drama"))) {
                    System.out.println(movies[i].getName(movies[i]));
                }
               if (Movie.getCategory(movies[i]).endsWith(("musical"))) {
                   System.out.println(movies[i].getName(movies[i]));
               }
               if (Movie.getCategory(movies[i]).endsWith(("sci-fi"))) {
                   System.out.println(movies[i].getName(movies[i]));
               }
               if (Movie.getCategory(movies[i]).endsWith(("animated"))) {
                   System.out.println(movies[i].getName(movies[i]));
               }
               if (Movie.getCategory(movies[i]).endsWith(("comedy"))) {
                   System.out.println(movies[i].getName(movies[i]));
               }
               if (Movie.getCategory(movies[i]).endsWith(("horror"))) {
                   System.out.println(movies[i].getName(movies[i]));
               }
           }
       }
   }


    }




}
