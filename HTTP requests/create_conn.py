
import http.client

connection = http.client.HTTPConnection('www.idoston.org', 80, timeout=10)
print(connection)
