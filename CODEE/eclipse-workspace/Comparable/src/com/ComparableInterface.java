/*
 * How can we compare user-defined Object ?
 * 
 * <<Comparable>>
 * ----------------
 * 
 * 1. Comparable is a pre-defined interface present in java.lang package
 * introduced from jdk 1.2 2. <<Comparable>> has an abstract method called as
 * compareTo(). 3. <<Comparable>> is used to compare objects and sort them. 4.
 * Default sorting
 * 
 * syntax : public int compareTo(Object o) { return -> +1 if it is greater than
 * -> -1 if it is lesser than -> +1 if it is same objects
 * 
 * }
 * 
 * Rules to make the objects in order to work with <<Comparable>>
 * ------------------------------------------------------------------
 * 
 * 1. Class has to implement <<Comparable>> 2. Specify the generics type of
 * which object we are going to compare 3. Override the abstract method, compareTo() by
 * specifying the business logic of comparing & sorting.
 */