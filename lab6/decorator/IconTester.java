package lab6;

import javax.swing.*;

public class IconTester
{
   public static void main(String[] args)
   {
      JOptionPane.showMessageDialog(
            null, 
            "Hello, Boxed Mars!",
            "Message",
            JOptionPane.INFORMATION_MESSAGE,
            new BoxedIcon(new MarsIcon(50)));
      System.exit(0);
   }
}
//public class IconTester
//{
//   public static void main(String[] args)
//   {
//      CompositeIcon compositeIcon = new CompositeIcon();
//      compositeIcon.addIcon(new MarsIcon(50));
//      compositeIcon.addIcon(new ImageIcon("globe.gif"));
//      JOptionPane.showMessageDialog(
//            null, 
//            "Hello, Composite!",
//            "Message",
//            JOptionPane.INFORMATION_MESSAGE,
//            compositeIcon);
//      System.exit(0);
//   }
//}