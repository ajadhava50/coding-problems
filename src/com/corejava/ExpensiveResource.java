package com.corejava;


class ExpensiveResource  {

    private static ExpensiveResource instance;
    private static class MyResource{
        private static  final ExpensiveResource resource = new ExpensiveResource();
    }
    private ExpensiveResource() {
        throw new IllegalStateException("Utility class");
    }
    public static  ExpensiveResource getInstance() {
        return MyResource.resource;
    }

    public static ExpensiveResource getInstance2()
    {   // Single Checked
        if (instance == null) {

            synchronized (ExpensiveResource.class)
            {
                // Double checked
                if (instance == null) {
                    instance = new ExpensiveResource();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        ExpensiveResource resource = ExpensiveResource.getInstance2();
        ExpensiveResource resource1 = ExpensiveResource.getInstance();
        System.out.println(resource.hashCode());
        System.out.println(resource1.hashCode());
    }
}


