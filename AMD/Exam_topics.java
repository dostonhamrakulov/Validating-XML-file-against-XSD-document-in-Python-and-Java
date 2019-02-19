import java.util.*;

public class Exam_topics {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Three-Level Architecture, Data Independence");
        list.add("Conceptual Data Modeling (EER-Model using UML)");
        list.add("Practical Exercise: Creation of an ER model for a given task");
        list.add("Concepts of the relational model");
        list.add("relation, attribute, domain, primary key, foreign key, integrity constraints, views, null");
                list.add("Practical Exercise: Deriving relations for a given ER model");
        list.add("Relational Algebra: Operations selection, projection, cartesian product, Join");
        list.add("SQL: Realize (and understand) simple queries involving one or more tables");

        list.add("What led to the introduction of PL/SQL, and SQL/PSM?");
        list.add("What are cursors, exceptions, stored procedures (no syntactic details)?");
        list.add("How is a procedure different from a function?");
        list.add("What are triggers?");

        list.add("Discuss the general characteristics of advanced database applications");
        list.add("Discuss why the weaknesses of the relational data model and relational DBMSs may make them unsuitable for advanced database applications ");
        list.add("What is the Non First Normal Form?");
        list.add("What are Nest, Unnest, and intersection join operations?");
        list.add("Discuss some extensions of ORDBMS to overcome limitations of RDBMS, Name Advantages & Disadvantages of ORDBMS");

        list.add("What is a distributed Database?");
        list.add("What are the main reasons for and potential advantages of distributed databases?");
        list.add("What additional functions does a DDBMS have over a centralized DBMS?");
        list.add("Which types of Distributed DBS exist?");
        list.add("Discuss concepts of Distributed DB (Availability, Reliability, Scalability, Partition Tolerance, Autonomy, Replication, Allocation, Transparency)");
        list.add("Discuss the architecture of a DDBMS. Within the context of a centralized DBMS, briefly explain new components introduced by the distribution of data.");

        list.add("What is a fragment of a relation? What are the main types of fragments? Why is fragmentation a useful concept in distributed database design?");
        list.add("Why is data replication useful in DDBMSs? What typical units of data are replicated?");
        list.add("What is meant by data allocation in distributed database design? What typical units of data are distributed over sites?");
        list.add("How is a horizontal partitioning of a relation specified? How can a relation be put back together from a complete horizontal partitioning?");
        list.add("How is a vertical partitioning of a relation specified? How can a relation be put back together from a complete vertical partitioning?");

        list.add("Discuss application of traditional relational systems and NOSQL systems");
                list.add("CAP Theorem, Eventual consistency, Sharding, Schemaless data, Semistructured Data(motivation, representation)");
                        list.add("Categories of NOSQL Systems");
        list.add("some essential properties / concepts of these systems (by example) What is consistent Hashing ? ");


                Random rand = new Random();
        int listSize = list.size();
        for (int i = 0; i < 15; i++) {

            int randomNumber = rand.nextInt(listSize - 1) + 1;
            String str = list.get(randomNumber);
            System.out.println((i + 1) + ". " + str + "\n");
        }
    }

}	
