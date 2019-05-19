package edu.depaul.cdm.se450.Qi.Adapter;

public class AdapterDemo {
    public static void main(String args[]) {
        AmericaLaptop lp = new AmericaLaptop();
        CWallOutlet wl = new CWallOutlet();
        ChinaVolt vadp = new Voltadpter(lp);

        System.out.println("The laptop says...");
        lp.volt110v();


        System.out.println("The China wall says...");
        testApt(wl);

        System.out.println("The Volt adapter wall says...");
        testApt(vadp);

    }

    static void testApt(ChinaVolt v){
        v.volt220v();
        }



}