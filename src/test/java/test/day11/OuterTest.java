package test.day11;

import com.day11.Outer;

public class OuterTest {
    public static void main(String[] args) {
        /*
        Outer ou = new Outer();
        Outer.Inner in = ou.new Inner();
        in.print();
        */
        
        Outer.Inner in = new Outer().new Inner();
        in.print();
        
        // new Outer().new Inner().print();
        //------------------------------------------
        
        Outer.SInner sin = new Outer.SInner();
        sin.print();
        
    }
}
