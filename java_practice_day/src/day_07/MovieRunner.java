package day_07;

public class MovieRunner extends Movie{

    public static void main(String[] args) {
        //Creating MovieRunner object
        MovieRunner starWars=new MovieRunner();
        //Assigning name
        starWars.setName("Star Wars");
        //Assigning duration
        starWars.duration=120;
        //Assigning is good or not
        starWars.isGood=true;
        //Calling movieInfo method to pring movie information faster
        starWars.movieInfo();
        //Print if movie short or long
        starWars.shortOrLong();
        
    }
}
