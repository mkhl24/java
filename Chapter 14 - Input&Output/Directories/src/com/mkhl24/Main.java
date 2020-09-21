package com.mkhl24;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

        // lambda filter
        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
//        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
//        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory)) {
//        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, "*.dat")) {
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.getMessage();
        }


        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try {
            Path tempFile = Files.createTempFile("myapp",".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println("Volume name/Drive letter: " + store);
            System.out.println("file store: " + store.name());
        }

        System.out.println("\n\n*********************");
        Iterable<Path> rootPahs = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootPahs) {
            System.out.println(path);
        }

        System.out.println("\n\n-------------Walking tree for Dir2 -------");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n-------- Copy Dir2 to Dir4/Dir2Copy--------");
        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" +
                File.separator + "Dir2Copy");
        // FileTree/Dir4/Dir2Copy
        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("\n\n------ mapping io nio ---------- ");

        File file = new File("/Examples/file.txt");
        Path convertedPath = file.toPath();
        System.out.println("converted Path = " + convertedPath);

        File parent = new File("/Examples");
        File resolvedFile = new File(parent, "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("/Examples","dir/file.txt");
        System.out.println(resolvedFile.toPath());

        Path parentPath = Paths.get("/Examples");
        Path childRelativePath = Paths.get("dir/file.txt");
        System.out.println(parentPath.resolve("childRelativePath: " + childRelativePath));

        File workingDir = new File("").getAbsoluteFile();
        System.out.println("WD: " + workingDir.getAbsolutePath());

        System.out.println("\n---------print Dir2 content using list()--------");
        File dir2File = new File(workingDir, "/FileTree/Dir2");
        String[] dir2Contents = dir2File.list();
        for(int i=0; i<dir2Contents.length;i++) {
            System.out.println("i= " + i + ": " + dir2Contents[i]);
        }

        System.out.println("\n---------print Dir2 content using listFiles()-----------");
        File[] dir2Files = dir2File.listFiles();
        for(int i=0; i<dir2Files.length;i++) {
            System.out.println("i= " + i + ": " + dir2Contents[i]);
        }

    }
}















