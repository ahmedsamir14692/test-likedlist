
package test.linked;

import static java.lang.System.console;


public class TestLinked {

    
    public static void main(String[] args) {
       System.gc(); // run garbage collection
node node1 = new node();
node1.y=23;
node1.link= null;
node node2 = new node ();
node2.y=56;
node2.link= null;
node node3 = new node ();
node3.y=34;
node3.link= null;
node1.link=node2; // likedlist
node2.link=node3;
System.out.println(node2.link.y);
node3.link=node1;
// add new node after node 1
 node node_1 = new node ();
 node1.link= node_1;
 node_1.link= node2;
System.out.println(node1.link.link.y);
// remove it
// one step
node1.link= node2; // one step
node1.link= node1.link.link;// one step
node_1.link=null;
System.out.println(node_1.link.link.y);
        
    }
    
}
