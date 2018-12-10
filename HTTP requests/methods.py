

import http.client
import pprint
import json

print("\r\n \r\n \r\n================= GET Method ================")
connection = http.client.HTTPSConnection("www.google.com")
connection.request("GET", "/")
response = connection.getresponse()
headers = response.getheaders()
pp = pprint.PrettyPrinter(indent=4)
pp.pprint("Headers: {}".format(headers))

print("\r\n \r\n \r\n================= POST Method ===============")


conn = http.client.HTTPSConnection('www.httpbin.org')

headers_1 = {'Content-type': 'application/json'}

foo = {'text': 'Hello HTTP #1 **cool**, and #1!'}
json_data = json.dumps(foo)

conn.request('POST', '/post', json_data, headers_1)

response_1 = conn.getresponse()
print(response_1.read().decode())
