import smtplib
from email import encoders
from email.mime.text import MIMEText
from email.mime.base import MIMEBase
from email.mime.multipart import MIMEMultipart

# Programa de python que envia um mail 

server = smtplib.SMTP_SSL('smtp.gmail.com', 465)             # Tipo de mail especificado

server.ehlo()

server.login('sargacoburner@gmail.com', 'Diogo1234')         # Endereço que mandará o mail

# Estrutura do mail:

msg = MIMEMultipart()
msg['From'] = 'Sargaco'
msg['To'] = 'daniel403@gmail.com'
msg['Subject'] = 'Just a text'

with open('message.txt', 'r') as f:                          # Le o corpo do mail presente num outro ficheiro
    message = f.read()

# Anexa no mail uma imagem à escolha 

msg.attach(MIMEText(message, 'plain'))

filename = 'PythonCode.jpg'
attachment = open(filename, 'rb')

p = MIMEBase('application', 'octet-stream')
p.set_payload((attachment.read()))

encoders.encode_base64(p)
p.add_header('Content-Disposition', f'attachment; filename={filename}')
msg.attach(p)

text = msg.as_string()
server.sendmail('sargacoburner@gmail.com', 'daniel403@gmail.com', text)