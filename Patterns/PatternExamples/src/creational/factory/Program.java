package creational.factory;

public class Program {
    public static void main(String[] args) {
//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeJavaCode();
//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCppCode();

        // Developer I
//        Developer developer = new JavaDev();
//        developer.writeCode();
//        developer = new CppDev();
//        developer.writeCode();

        // DeveloperFactory
//        DeveloperFactory developerFactory = new JavaDeveloperFactory();
//        Developer developer = developerFactory.createDeveloper();
//        developer.writeCode();
//        developerFactory = new CppDeveloperFactory();
//        developer = developerFactory.createDeveloper();
//        developer.writeCode();

        // createDeveloperBySpeciality()
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }

}
