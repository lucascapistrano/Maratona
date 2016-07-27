import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        long i;
        boolean error;
        String st;
        Pattern p = Pattern.compile("[a-zA-Z]");  
        Matcher m;
        while((st=input.readLine())!=null)
        {
            error=false;
            st=st.replace(",","");
            st=st.replaceAll("\\s","");
            m = p.matcher(st);
            if(st.length()>10)
                error=true;
            if(m.find())  
                error=true;
            if(st.trim().isEmpty())
                error=true;
            if(!error)
            {
                st=st.replace("l","1");
                st=st.replace("o","0");
                st=st.replace("O","0");
                i=Long.parseLong(st);
                if(i<0||i>2147483647)
                    System.out.println("error");
                else
                    System.out.println(i);
            }
            else
            {
                System.out.println("error");
            }
        }
    }
}