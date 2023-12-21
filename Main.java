class ObjectCounter {
    // Static variable to count the number of objects
    private static int objectCount = 0;

    // Constructor increments the object count
    public ObjectCounter() {
        objectCount++;
    }

    // Method to get the number of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Creating multiple objects of the class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Getting the number of objects created
        int count = ObjectCounter.getObjectCount();

        // Printing the number of objects
        System.out.println("Number of objects created: " + count);
    }
}