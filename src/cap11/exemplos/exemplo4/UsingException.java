package cap11.exemplos.exemplo4;

public class UsingException {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.printf("%-45s%-30s%-10s%-10s%n", "Class", "File", "Line", "Method");

            for (StackTraceElement element : traceElements){
                System.out.printf("%-45s", element.getClassName());
                System.out.printf("%-30s", element.getFileName());
                System.out.printf("%-10s", element.getLineNumber());
                System.out.printf("%-10s%n", element.getMethodName());
            }
        }
    }

    public static void method1() throws Exception{
        method2();
    }

    public static void method2() throws Exception{
        method3();
    }

    public static void method3() throws Exception{
        throw new Exception();
    }
}
