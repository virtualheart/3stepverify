import consents.consent;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author smk
 */
public class eMail {
    
    public static void send(String recmail,String  msg,String sub){  
          //Get properties object 
          consent c = new consent();
          //final String from = "asvperumal@gmail.com";
          //final String password = "Asvp@2300#20";
          final String from = c.email;
          final String password = c.mailpass;
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(recmail));    
           message.setSubject(sub);    
           message.setText(msg);    
           //send message  
           Transport.send(message);
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {
              e.getMessage();
              throw new RuntimeException(e);
          }
    }
}
