/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brugerautorisation.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
/**
 * Sender en mail. Kræver JavaMail
 * @author j
 */
public class SendMail {

  public static void sendMail(String emne, String tekst, String modtagere) throws Exception {
    // Husk først at sænke sikkerheden på https://www.google.com/settings/security/lesssecureapps
    final String afsender = "android.ihk@gmail.com";
    System.out.println("sendMail " + emne + " " + modtagere + " " + tekst.replace('\n', ' '));
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");

    // FØLGENDE KRÆVER JavaMail-BIBLIOTEKET (det er med som standard i Netbeans)
    // fjern evt koden, da du ikke skal sende mail fra din PC (det gør serveren jo)

  }

}
