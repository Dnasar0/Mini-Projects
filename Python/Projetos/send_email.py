from email import encoders
from email.mime.base import MIMEBase
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import smtplib
import ssl
from email.message import EmailMessage

subject = "Email from Python"                               # tópico
body = "This is a test email from python!"                  # corpo do email
sender_email = "sargacoburner@gmail.com"                    # endereço que envia o mail
receiver_email = "daniel403@gmail.com"                      # endereço que recebe o mail
password = input("Enter the password: ")                    # palavra passe do endereço que envia o mail


# Estrutura do email
message = MIMEMultipart()
message["From"] = sender_email
message["To"] = receiver_email
message["Subject"] = subject
message.attach(MIMEText(body, "plain"))
filename = "canecaRoblox.jpg"
attachment = open(filename, "rb")
p = MIMEBase("application", "octed-stream")
p.set_payload(attachment.read())
encoders.encode_base64(p)
p.add_header("Content-Disposition", f"attachment; filename={filename}")
message.attach(p)

context = ssl.create_default_context()

print("Sending email")

with smtplib.SMTP_SSL("smtp.gmail.com", 465, context=context) as server:                # conectar no servidor do mail
    server.login(sender_email, password)
    server.sendmail(sender_email, receiver_email, message.as_string())

print("Sucess")
