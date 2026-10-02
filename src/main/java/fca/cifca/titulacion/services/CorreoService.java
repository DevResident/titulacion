package fca.cifca.titulacion.services;

import fca.cifca.titulacion.models.dtos.CorreoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

    @Autowired
    private JavaMailSender mailer;

    public void mandarCorreo(CorreoRequest correoRequest){

        SimpleMailMessage correo = new SimpleMailMessage();
        correo.setTo(correoRequest.getDestinatario());
        correo.setSubject(correoRequest.getAsunto());
        correo.setText(correoRequest.getMensaje());
        mailer.send(correo);

    }

}
