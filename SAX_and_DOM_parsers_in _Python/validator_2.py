import sys,xml.dom.minidom

prog,file = sys.argv
if len(sys.argv) != 2:  
  print "Usage: python %s <file>.xml"%sys.argv[0]  
  sys.exit(1)
d = xml.dom.minidom.parse(file)

print "<html><head><title>Deliveries</title></head>"
print "<body>\n<h1>Deliveries</h1><hr>\n"

print '<table border="1">'
print '<tr><th>Number</th><th>Article</th><th>Price</th><th>Supplier</th></tr>'

article_list = d.getElementsByTagName("article")
for article in article_list:  
  name = article.getElementsByTagName("name")[0]  
  c = name.childNodes[0]  
  print "<tr><td>%s</td><td>%s</td>"%(c.data, article.getAttribute("id")),  
  price = article.getElementsByTagName("price")[0]  
  c = price.childNodes[0]  
  print "<td>%s</td>"%c.data,  
  supplier = article.getElementsByTagName("supplier")[0]  
  c = supplier.childNodes[0]  
  print "<td>%s</td></tr>"%c.data
print "</table>\n</body>\n</html>"
