public class TestClass {

    public static void main(String[] args) {
        String path = System.getProperty("java.class.path");
        String bootPath = System.getProperty("sun.boot.class.path");
        String[] paths = path.split(":");
        for (String s : paths) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");
        String[] bootPaths = bootPath.split(":");
        for (String s : bootPaths) {
            System.out.println(s);
        }
//        System.out.println(System.getProperty("java.class.path"));

    }
}
