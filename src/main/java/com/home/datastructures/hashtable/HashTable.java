package com.home.datastructures.hashtable;

public class HashTable {

    String[] hashArray;
    int arraySize;
    int size = 0; //counter for number of elements in the hash table

    public HashTable(int noOfSlots) {
        if (isPrime(noOfSlots)) {
            hashArray = new String[noOfSlots];
            arraySize = noOfSlots;
        } else {
            int primaCount = getNextPrime(noOfSlots);
            hashArray = new String[primaCount];
            arraySize = primaCount;

            System.out.println("Hash table size given" + noOfSlots + "is not prime");
            System.out.println("Hash table size change to " + primaCount);
        }

    }

    private int getNextPrime(int noOfSlots) {
        for (int i = noOfSlots; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    private boolean isPrime(int noOfSlots) {
        for (int i = 2; i * i <= noOfSlots; i++) {
            if (noOfSlots % i == 0) {
                return false;
            }
        }
        return true;
    }

    // return step size
    private int hashFunc1(String word) {
        int hashVall = word.hashCode();
        hashVall %= arraySize;

        if (hashVall < 0) {
            hashVall += arraySize;
        }

        return hashVall; // ideal index position we'd like to insert or search in
    }

    // return step size
    private int hashFunc2(String word) {
        int hashVall = word.hashCode();
        hashVall %= arraySize;

        if (hashVall < 0) {
            hashVall += arraySize;
        }

        return 3 - hashVall % 3; // ideal index position we'd like to insert or search in
    }

    public void insert(String word) {
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null) {
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }

        hashArray[hashVal] = word;
        System.out.println("inserted word: " + word);
        size++;
    }

    public String find(String word) {
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].equals(word)) {
                return hashArray[hashVal];
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }

        return hashArray[hashVal];
    }

    public void display() {
        System.out.println("Table: ");
        for(int i = 0; i < arraySize; i++){
            if(hashArray[i] != null){
                System.out.println(hashArray[i] + " ");
            } else {
                System.out.println("** ");
            }
        }
    }
}
