
package Clases;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Correo {
    public void SendMail(String mensaje, String To, String Subject) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("lopezeduardo220@gmail.com", "proyectoexpo");
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("lopezeduardo220@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(To));
            message.setSubject(Subject);
            message.setText(mensaje);

            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Compruebe su conexion a internet");
            throw new RuntimeException(e);
        }
    }
}
