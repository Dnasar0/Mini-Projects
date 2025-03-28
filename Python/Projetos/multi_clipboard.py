# Programa que grava várias notas

import sys                                          # utilizado para ver os argumentos na terminal
import clipboard
import json

SAVED_DATA = "clipboard.json"

def save_data(filepath, data):
    with open(filepath, "w") as f:
        json.dump(data, f)
    
def load_data(filepath):
    try:
        with open(filepath, "r") as f:
            data = json.load(f)
            return data
    except:
        return {}


if len(sys.argv) == 2:
    command1 = sys.argv[1]
    data = load_data(SAVED_DATA)

    if command1 == "save":
        key = input("Enter a key: ")
        data[key] = clipboard.paste()
        save_data(SAVED_DATA, data)
        print("Data saved!")
    elif command1 == "load":
        key = input("Enter a key: ")
        if key in data:
            clipboard.copy(data[key])
            print("Data copied to clipboard.")
        else:
            print("Key does not exist.") 
    elif command1 == "list":
        print(data)
    elif command1 == "delete":
        key = input("Enter the key you wish to delete: ")
        if key in data:
            del data[key]
            save_data(SAVED_DATA, data)
            print("Data cleared!")
        else:
            print("Key does not exist.")
    else:
        print("Unknown command")
else:
    print("Please pass exactly one command.")