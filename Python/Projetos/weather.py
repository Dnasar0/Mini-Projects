# Programa que calcula a temperatura e o clima de uma específica localização

import requests

API_KEY = "737530f93f2baa5df7127ae7e8d7678e"
BASE_URL = "http://api.openweathermap.org/data/2.5/weather"

city = input("Enter a city name: ")
request_url = f"{BASE_URL}?appid={API_KEY}&q={city}&units=metric"   # informação da cidade + celcio
response1 = requests.get(request_url)

if response1.status_code == 200:                                    # 200 é "sucedido"
    data = response1.json()                                         # recolhe a informação e guarda-a num dicionário
    weather = data["weather"][0]["description"]
    temperature = data["main"]["temp"]
    print(f"Weather: {weather}.\nTemperature: {temperature} celcius.")
else:
    print("An error occured.")
