#raise Exception("Bad")                      # apontar uma exceção

try:                                         # preparar para receber um exceção
    x = 7 / 0                                # exceção: division by zero
except Exception as e:
    print(e)                                 # emite a exceção
    print("You aren't allowed to do this.")  # mensagem adicional
finally:
    print("End of program.")                 # finalmente, depois da exceção, envia mensagem a dizer que acabou o programa