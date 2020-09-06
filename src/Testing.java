import javax.swing.JOptionPane;
import java.net.URL;
import javax.swing.ImageIcon;

public class Testing {

    public static void main(String[] args) throws Exception{

        URL imageLocation = new URL( "https://compote.slate.com/images/697b023b-64a5-49a0-8059-27b963453fb1.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
