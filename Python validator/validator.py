#Doston Hamrakulov

from lxml import etree

def validate(xmlparser_xsd, xml_data):
    try:
        etree.fromstring(xml_data, xmlparser_xsd)
        return True
    except etree.XMLSchemaError:
        return False

# defining path of xsd file
xml_schema_file = "xsd_1.xsd"
with open(xml_schema_file, 'r') as xml_schema_file:
    schema_root = etree.XML(xml_schema_file.read())

schema = etree.XMLSchema(schema_root)
xmlparser = etree.XMLParser(schema=schema)

#defining path of xml file
xml_file = "xml_1.xml"
with open(xml_file, 'r') as xml_file:
    xml_data = xml_file.read()
    if validate(xmlparser, xml_data):
        print "XML file is valid against XSD Document"
    else:
        print "Invalid. Please, find error description below\n"
