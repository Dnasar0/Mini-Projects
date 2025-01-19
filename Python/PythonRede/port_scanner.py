# Como analisar portas, vendo se estão abertas, fechadas, etc...

import nmap

# Intervalo de portas a ser analisado
begin = 0
end = 400

target = '10.0.2.15'
scanner = nmap.PortScanner()
for i in range(begin,end+1):
    res = scanner.scan(target, str(i))                 # dicionário que contém diversa informação
    res = res["scan"][target]["tcp"][i]["state"]       # estado da porta
    print(f"Port {i} is {res}")
