# Como encontrar nomes de redes sem-fios usando o python

import subprocess

# Retorna informação de todas as redes disponíveis com comando cmd: "netsh wlan show network"
nw = subprocess.check_output(["netsh", "wlan", "show", "network"])  # netsh (network shell) é uma linha de comando que permite mostrar/editar a configuração de uma rede num computador ligado
                                                                    # wlan especificar o tipo de red (wlan)
                                                                    # show mostrar 
                                                                    # network rede, estão em formato binário
decoded_nw = nw.decode("ascii")                                     # descodificar a informação em ascii para ser legível 
print(decoded_nw)   

# Exemplo de rede: 
'''SSID 9 : Vodafone-D32F02

    Network type            : Infrastructure

    Authentication          : WPA2-Personal

    Encryption              : CCMP'''
# Onde:
# Network type é infraestrutura

# Authentication é o tipo de rede (privada ou pública)

# Encryption:
# CCMP = Counter Mode Cipher Block Chaining Message Authentication Code Protocol
# TKIP = Temporal Key Integrity Protocol (oferece por mixing de chaves por packet uma integridade de mensagem e mecanismo re-keying)