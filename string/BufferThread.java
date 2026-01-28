public class BufferThread {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        StringBuilder sb1 = new StringBuilder("helloworld");
        sb.append("world");
        System.out.println(sb1 == sb);
        //  is false because heap contain two diffrent object and == compare with refrence
        //  not content
    }
}
