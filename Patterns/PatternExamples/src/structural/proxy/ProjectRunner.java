package structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
//        Project project = new RealProject("https://github.com/ex/projex1");
        Project project = new ProxyProject("https://github.com/ex/projex1");

        project.run();
    }
}
