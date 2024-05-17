//save by C.java  
package mypack;

import pack.A; //Importing class A from packagename pack which gives us access to only A.

class C {
    public static void main(String args[]) {
        A obj = new A();
        obj.msg();
    }
}