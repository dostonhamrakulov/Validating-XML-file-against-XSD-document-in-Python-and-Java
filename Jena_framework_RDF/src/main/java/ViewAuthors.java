package bibliothek;
import java.io.*;

import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;
import org.apache.jena.util.FileManager;



import bibliothek.Litera;

public class ViewAuthors extends Object {

    public static void main (String args[]) {
        Model authorModel = FileManager.get().loadModel("https://vsr.cs.tu-chemnitz.de/edu/2014/xw/public_resources/test_bibliothek/authors.rdf");
        authorModel.write(System.out);
    }
}