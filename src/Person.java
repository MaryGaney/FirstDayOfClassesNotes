public class Person {
    //String name; -> package level access, all classes in package can access it
    //private -> in class can access
    //public -> outside class can access
    private String name;
    public void print(){
        String name2;
        System.out.println(name.length());
        //System.out.println(name2.length());
    }
}
