import pprint
import requests

url = "https://opentdb.com/api.php?amount=1&difficulty=easy&type=multiple"

response = requests.get(url)

print(response.json()["results"])