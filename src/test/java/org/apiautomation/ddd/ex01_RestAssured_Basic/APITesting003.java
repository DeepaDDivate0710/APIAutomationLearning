package org.apiautomation.ddd.ex01_RestAssured_Basic;

public class APITesting003 {

    // Code by using builder pattern design
    //  Builder Pattern – Allows method chaining for cleaner and more readable code.
    //  Method Chaining – Each method returns this, allowing consecutive method calls.
    // Object-Oriented Programming – Uses classes and objects effectively.

    public static void main (String[] args)
    {
        APITesting003 np = new APITesting003();

        np.step1().step2().step3();


    }


    public APITesting003 step1()
    {
        System.out.println("Step1");
        return this;
    }



    public APITesting003  step2()
    {
        System.out.println("Step2");
        return this;
    }

    public APITesting003  step3()
    {
        System.out.println("Step3");
        return this;
    }



}
