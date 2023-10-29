class a_047_nested_inner_class {
    int x=10;
    a_047_nested_inner_class_1 gobj=new a_047_nested_inner_class_1();
    void hello()
    {
        System.out.println("Hello from outer class method");
    }
    
    public static void main(String[] args) {
        /*
        nested inner class is a class that is declared inside another class
        nested inner class can access the outer class methods and outer class variables

        we can access the nested-inner class methods and variables using objects

        
         */
        // you cannot create instance of inner class in main function
        new a_047_nested_inner_class().calc();
        
        
    }
    void calc()
    {
        a_047_nested_inner_class_1 obj= new a_047_nested_inner_class_1();
        obj.calc();
     }
    class a_047_nested_inner_class_1
    {
        void calc()
        {
            System.out.println("Inside inner class");
            System.out.println(x);
            hello();
            System.out.println("Inner class ended");
        }
    }
}
