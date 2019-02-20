#Doston Hamrakulov

import sys,xml.sax,xml.sax.handler

class SaxHandler(xml.sax.handler.ContentHandler):  
  def __init__(self):  
    self.print_content = 0  

  def startElement(self,name,attrs):  
    if name == "deliveries":    
      print "<html><head><title>Deliveries</title></head>"    
      print "<body><h1>Deliveries</h1><hr>"    
      print '\n<table border="1"><tr><th>Number</th><th>Article</th><th>Price</th><th>Supplier</th></tr>'  
    elif name == "article":    
      self.id = attrs.getValueByQName("id")    
      print "<tr><td>%s</td>"%attrs.getValueByQName("id"),    
      self.print_content = 0  
    elif name == "name" or name == "price" or name == "supplier":    
      print "<td>",    
      self.print_content = 1  

  def endElement(self,name):  
    if name == "deliveries":    
      print "\n</table>\n</body>\n</html>"
    elif name == "article":    
      print "</tr>"  
    elif name == "name" or name == "price" or name == "supplier":    
      print "</td>",    
      self.print_content = 0  

  def characters(self,content):  
    if self.print_content:    
      print content,

if len(sys.argv) != 2:  
  print "Usage: python %s <file>.xml"%sys.argv[0]  
  sys.exit(1)
p = xml.sax.make_parser()
prog,file = sys.argv
xml.sax.parse(file,SaxHandler())
