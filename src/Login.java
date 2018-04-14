import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.SimpleTimeZone;

public class Login {
    private JTextField txtUsername;
    private JPasswordField pwdPassword;
    private JButton btnLogin;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JPanel loginPanel;


    public Login() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String Uname = "";
                String PWD = "";

                Uname = txtUsername.getText();
                PWD = pwdPassword.toString();

                if (Uname == "FKJAVA" && PWD == "FKME")
                {
                   JOptionPane.showMessageDialog(null, "This Seems to be working!!!");
                }
                else
                {
                   JOptionPane.showMessageDialog(null,"You Done F***ed up boy");
                }


            }
        });
    }

    public static void main(String[] args)  {
        JFrame loginFrame = new JFrame("LoginApp");
        loginFrame.setContentPane(new Login().loginPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        loginFrame.setLocation(dim.width/2-loginFrame.getSize().width/2, dim.height/2-loginFrame.getSize().height/2);
        loginFrame.setVisible(true);
    }

}
