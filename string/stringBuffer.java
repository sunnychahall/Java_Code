public class stringBuffer {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
        // capacity intial = 16 if more capacity required than 16 + length of string if we 
        // pass it in new StringBuffer()
        sb.append("Hello_World Java :)");
        //capacity = (old * 2) + 2 if intial cpacity is not enough
        //if new capcity is also not enough then cpacity == stringlength
        System.out.println(sb.capacity()); 

        
    }
}
