import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException
    {
        IdsAndPasswords idsandpass=new IdsAndPasswords();

        LoginForm1 login=new LoginForm1(idsandpass.getLoginInfo());
    }
}