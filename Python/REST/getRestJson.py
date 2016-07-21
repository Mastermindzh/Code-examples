# Python read JSON example :)
# execute: clear && python3 readCPU.py
# make sure "example.json" resides in the same directory as this file

import json
from pprint import pprint
import requests

# get json data from rest api
url = 'http://localhost:5000/cpu'
response = requests.get(url)

# put data into a variable
data = response.json()

print("json object array: ")
pprint(data)
print() # empty line for easier visual output
