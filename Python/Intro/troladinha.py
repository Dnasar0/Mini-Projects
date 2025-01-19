import requests

key = "2d141c34-d889-4b09-a272-d9616aed06dd:eda38ec188bc9a45ee40629cc513a1e6"

url = "https://54285744-illusion-diffusion.gateway.alpha.fal.ai/"

payload = {
    "image_url": "https://cdn.britannica.com/58/129958-050-C3FE2DD2/Adolf-Hitler-1933.jpg",
    "prompt": "(masterpiece:1.4), (best quality), (detailed), sargaço"}
headers = {
    "Authorization": "Key " + key,
    "Content-Type": "application/json"
}

response = requests.post(url, json=payload, headers=headers)

print(response.json())