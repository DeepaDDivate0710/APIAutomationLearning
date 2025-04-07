package org.apiautomation.ddd.ex01_RestAssured_Basic;

public class APITesting002 {

    // No Design Patterns
    // We use the ref and call it one by one.
    public static void main (String[] args)
    {
        APITesting002 np = new APITesting002();

        np.step1();
        np.step2();
        np.step3();


    }

    public void step1()
    {
        System.out.println("Step1");
    }

    public void step2()
    {
        System.out.println("Step2");
    }

    public void step3()
    {
        System.out.println("Step3");
    }


}
