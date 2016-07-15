# Python read JSON example :)
# execute: clear && python3 readCPU.py
# make sure "example.json" resides in the same directory as this file

import json
from pprint import pprint

#lees json file in (of voer script uit die het maakt)
with open('example.json') as inputFile:
    data = json.load(inputFile)

print("json object array: ")
pprint(data)
print() # empty line for easier visual output

print("First  core: {}".format(data["0"]))
print("Second core: {}".format(data["1"]))
print("Third  core: {}".format(data["2"]))
print("Fourth core: {}".format(data["3"]))

print() # empty line for easier visual output

print("Number of items in array: {}".format(len(data)))
for x in range(0,len(data)):
    print("core {} temp: {}".format(x,data[str(x)]))

