#Projeto: Brute-force 
#By: Renan V. Lameu

import random
import pyautogui

caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789*@-+%$#!/?"
lista_senha = list(caracteres)

senha = pyautogui.password("Digite uma senha: ")

palpites = ""


while(palpites != senha):
    palpites = random.choices(lista_senha, k = len(senha))

    print("=-=-=-=-=-=-=-=-=-=" + str(palpites) + "=-=-=-=-=-=-=-=-=-=")

    if(palpites == list(senha)):
        print("A senha é: " + "" .join(palpites))
        break
