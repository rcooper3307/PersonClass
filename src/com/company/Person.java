package com.company;

public class Person
{
    /// fields ////////////////
    private String name;
    private String cell;

    /////// constructors ////////////////////
    public Person(String theName, String theCell)
    {
        this.name = theName;
        this.cell = theCell;
    }

    //////////// methods ///////////////////////
    public String getName()
    {
        return this.name;
    }
    public void setName(String theName)
    {
        this.name = theName;
    }

    public String getCell()
    {
        return this.cell;
    }

    public void setCell(String theCell)
    {
        this.cell = theCell;
    }

    public String toString() { return "name: " + this.name +
            ", cell: " + this.cell; }


    //////////// main for testing //////////////
    public static void main(String[] args)
    {
        Person p1 = new Person("Roma", "555 420-6969");
        System.out.println(p1);
        Person p2 = new Person("Crow", "555 888-8888");
        System.out.println(p2);
    }
}
