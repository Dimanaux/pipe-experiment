public class Service {
    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.run());
    }

    public int run() {
        Process process = Runtime.getRuntime().exec("./tester-java");
        process.waitFor();
        return process.exitValue();
    }
}
