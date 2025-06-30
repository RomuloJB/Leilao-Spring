public class EmailService {
    @Autowired
    private JavaMailSender javaMail;

    public void enviarEmailSimples(String para, String assunto, String mensagem) {
        SimpleMailMessage simplesMail = new SimpleMailMessage();
        simpleMail.setTo(para);
        simplesMail.setSubject(assunto);
        simplesMail.setText(mensagem);
        javaMail.send(simpleMail);
    }
}
