package LowLevelDesignPattern.CompositeDesignPattern.Solution1WithCompositeDesign;

import LowLevelDesignPattern.CompositeDesignPattern.ProblemStatement.Directory;
import LowLevelDesignPattern.CompositeDesignPattern.ProblemStatement.File;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("movie");
        File movie1 = new File("Avengers End game");
        directory.add(movie1);

        Directory movieDirectory = new Directory("comedyMovie");
        File movie2 = new File("Avengers End game");
        movieDirectory.add(movie1);

        directory.add(movieDirectory);

        directory.ls();
    }
}
