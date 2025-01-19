# Programa para retornar as passwords (já guardadas) de redes atuais e passadas reconhecidas pelo utilizador.

import subprocess

# Comando do cmd que mostra cada perfil de rede wireless guardado pelo utilizador: "netsh wlan show profiles"
data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode('utf-8').split('\n')

# Guardar cada perfil numa variável
profiles = [i.split(":")[1][1:-1] for i in data if "All User Profile" in i]

# Percorrer cada perfil
for i in profiles:

    # Comando para ver a password: "netsh wlan show profiles i key=clear"
    results = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles', i, 'key=clear']).decode('utf-8').split('\n')

    results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b]

    try:
        # Quando é uma rede privada (tem password)
        print("{:<30}|  {:<}".format(i, results[0]))
    except IndexError:
        # Quando é uma rede pública (não tem password)
        print("{:<30}|  {:<}".format(i, ""))
input("")
