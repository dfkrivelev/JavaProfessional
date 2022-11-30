package homework9;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        final long COUNT = 512_000;

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < COUNT; i++) {
            str += "x";
        }
        System.out.println("String: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < COUNT; i++) {
            buffer.append("x");
        }
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - startTime));
    }
}
