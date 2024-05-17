//save as B.java
package mypack;

import pack.*; //Importing the package named pack which contains class A.

class B {
    public static void main(String args[]) {
        A obj = new A();
        obj.msg();
    }
}