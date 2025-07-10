package LowLevelDesignPattern.CompositeDesignPattern.Solution1WithCompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemsList;
    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemsList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemsList.add(fileSystemObj);
    }
    @Override
    public void ls() {
        System.out.println("DirectorName : " + directoryName);
        for(FileSystem fs : fileSystemsList){
            fs.ls();
        }
    }
}
