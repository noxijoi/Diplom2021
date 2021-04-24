package utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;



public class JavaMailUtil {

    public static void sendMail(String recepient,String title,String text) throws Exception {
        System.out.println("Starting...");
        Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");

        String myAccountEmail = "diplomaTestMail@gmail.com";
        String password = "diplomaMail";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail,password);
            }
        });

        Message message = prepareMessage(session,myAccountEmail,recepient,title,text);
        Transport.send(message);
        System.out.println("Success");


    }

    private static Message prepareMessage(Session session,String myAccountEmail,String recepient,String title,String text) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
            message.setSubject(title);
            message.setText(text);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
