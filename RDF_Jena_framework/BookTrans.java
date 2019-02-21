package bibliothek;
import java.io.*;

import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;
import org.apache.jena.util.FileManager;

import bibliothek.Litera;

public class BookTrans extends Object {
    
    public static void main (String args[]) {
   
       Model bookModel = FileManager.get().loadModel("https://vsr.cs.tu-chemnitz.de/edu/2014/xw/public_resources/test_bibliothek/books.rdf");
       Model authorModel = FileManager.get().loadModel("https://vsr.cs.tu-chemnitz.de/edu/2014/xw/public_resources/test_bibliothek/authors.rdf");
       Model translatorModel = FileManager.get().loadModel("https://vsr.cs.tu-chemnitz.de/edu/2014/xw/public_resources/test_bibliothek/translators.rdf");
   
       Model all = bookModel.union(authorModel);
       all = all.union(translatorModel);
   
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
               printTranslators(all, book);
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

     private static void printTranslators(Model all, Resource book) {
        StmtIterator translatorIterator = all.listStatements(null, Litera.hasTranslated, book);
        if (translatorIterator.hasNext()) {
           while (translatorIterator.hasNext()) {
              Resource translator =  (Resource) translatorIterator.nextStatement().getSubject();
              System.out.println( "                translated by: " + 
                     translator.getProperty(Litera.authorName).getString());
           }
        }
        else {
           System.out.println("                     no translations");
        }
    }
        
}

