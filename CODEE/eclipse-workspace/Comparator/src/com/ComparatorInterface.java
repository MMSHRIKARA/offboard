/*
 * <<Comparator>> --------------- 1. Comparator is a pre-defined interface
 * present in java.util package & introduced from jdk 1.2 2. Comparator has an
 * abstract method called as compare().
 * 
 * syntax : public int compare(Object o1, Object o2) { return -> +1 if it is
 * greater than -> -1 if it is lesser than -> +1 if it is same objects }
 * 
 * Rules to make the objects in order to work with <<Comparator>>
 * ---------------------------------------------------------------- 1. Class has
 * to implements <<Comparator>> & we have to import comparator interface. 2.
 * Specify the generics type of which object we are going to compare 3. Override
 * the abstract method, compare() by specifying the business logic of comparing
 * & sorting. 4. Pass the object of the class which has the sorting logic to the
 * constructor of TreeSet.
 */