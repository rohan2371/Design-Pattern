package LowLevelDesignPattern.CompositeDesignPattern.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("movie");
        File movie1 = new File("Avengers End game");
        directory.add(movie1);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File jathiRatnalu = new File("Jathi Ratnalu");
        comedyMovieDirectory.add(jathiRatnalu);
        directory.add(comedyMovieDirectory);

        directory.ls();

    }
}
