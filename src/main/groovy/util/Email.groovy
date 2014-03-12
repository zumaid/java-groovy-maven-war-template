package util
import org.apache.commons.mail.HtmlEmail;
class Email {

	static main(args) {
		sendEmail "111", "1502382668", "zuaa@163.com"
	}

	static String saveMessage(String subject, String massage) {
		sendEmail subject, massage, "zuaa@163.com"
	}
	static String sendEmail(String subject, String msg, String to) {
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.163.com");
		email.setCharset("utf-8");
		email.addTo(to, "ºÚ¼§");
		email.setFrom("zuaa-q@163.com", "xuping");
		email.setAuthentication("zuaa-q", "seedcat");
		email.setSubject(subject);
		email.setMsg(msg);
		email.send();
	}
}
