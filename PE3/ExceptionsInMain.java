public class ExceptionsInMain {
    public static void main(String []args)
    {
        int i=10;
        int j=20;
        try
        {
            int k=i/j;
            if(k==0)
                throw new Exception("k should not be zero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("inside the finally clause");
        }
    }
}
