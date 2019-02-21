package bibliothek;
import java.io.*;

import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;
import org.apache.jena.util.FileManager;



import bibliothek.Litera;

public class Merge extends Object {
    
    public static void main (String args[]) {
   
       Model bookModel = FileManager.get().loadModel("https://vsr.cs.tu-chemnitz.de/edu/2014/xw/public_resources/test_bibliothek/books.rdf");
       Model authorModel = FileManager.get().loadModel("https://vsr.cs.tu-chemnitz.de/edu/2014/xw/public_resources/test_bibliothek/authors.rdf");
       Model all = bookModel.union(authorModel);

       ResIterator authorIterator=all.listSubjectsWithProperty(Litera.hasWritten);
       if (authorIterator.hasNext()) {
         while (authorIterator.hasNext()) {
           Resource author = (Resource) authorIterator.nextResource();
           System.out.print(author.getProperty(Litera.authorName).getString());
           System.out.println(" wrote:");
           StmtIterator booklist = author.listProperties(Litera.hasWritten);
           if (booklist.hasNext()) {
             while (booklist.hasNext()) {
               Resource book =  (Resource) booklist.nextStatement().getObject();
               System.out.println( "        " + 
   		     	book.getProperty(Litera.bookName).getString());
             }
           }
           else {
             System.out.println("no books");
           }
         }
       }
       else {
         System.out.println("No Authors");
       }
   
     }
}

