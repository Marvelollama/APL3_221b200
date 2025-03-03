package com.jiet;
import com.juet.Pack1;

public class Pack2 extends Pack1 { // Extend Pack1 to access protected method
    public static void main(String[] args) {
        Pack2 obj = new Pack2(); // Creating object of child class
        obj.display(); // Accessing protected method from parent class
    }
}
