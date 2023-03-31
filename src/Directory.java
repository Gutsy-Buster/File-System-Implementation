import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> files;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public void addFiles(FileSystem file) {
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Inside Directory : " + name);
        for(FileSystem file : files) {
            file.ls();
        }
    }
}
