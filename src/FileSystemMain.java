public class FileSystemMain {
    public static void main(String[] args) throws Exception {
        Directory directory1 = new Directory("Directory 1");
        Directory directory2 = new Directory("Directory 2");

        FileSystem file1 = new File("File 1");
        FileSystem file2 = new File("File 2");
        FileSystem file3 = new File("File 3");

        directory1.addFiles(file1);
        directory1.addFiles(directory2);

        directory2.addFiles(file2);
        directory2.addFiles(file3);

        directory1.ls();
    }
}
