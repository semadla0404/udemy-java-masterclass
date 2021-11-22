package com.company;

import java.io.Serializable;

public interface ITelephone {

//    INTERFACE
//    An interface is basically a template for how you
//    are designing your class. It ensures your class
//    follows a well-defined structure.
//
//    Consider using interfaces if :
//            1. You expect that unrelated classes would
//               implement your interface. For example, many unrelated objects can implement Serializable interface.
//            2. You want to specify the behavior of a
//               particular data type, but not concerned about who implements its behavior.
//            3. You want to take advantage of multiple
//               inheritance of type.
//
//    ARTICLES TO CLARIFY
//    When do you use either Inheritance, Interfaces or Abstract Classes
//    * https://www.smashingmagazine.com/2019/11/guide-oop-inheritance-interfaces-abstract-classes/
//    * https://levelup.gitconnected.com/object-oriented-design-principles-bb6daf98b185
//    * https://medium.com/javarevisited/oop-good-practices-coding-to-the-interface-baea84fd60d3

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}