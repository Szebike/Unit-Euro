package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForintTest {
    @Test
    void bruttotest01(){
        Forint f = new Forint(20);
        assertEquals(25.4,f.brutto());
    }
    @Test
    void bruttotest02(){
        Forint f = new Forint(-1);
        assertEquals(0,(int)f.brutto());
    }
    @Test
    void bruttotest03(){
        Forint f = new Forint(12);
        assertEquals(15,(int)f.brutto());
    }
    @Test
    void afatest01(){
        Forint a = new Forint(154);
        assertEquals(41,(int)a.afa());
    }
    @Test
    void afatest02(){
        Forint a = new Forint(12);
        assertEquals(3.24,a.afa());
    }
    @Test
    void afatest03(){
        Forint a = new Forint(0);
        assertEquals(0,a.afa());
    }
    @Test
    void eurotest01(){
        Forint e = new Forint(231);
        assertEquals(0.63 ,e.euroba());
    }
    @Test
    void eurotest02(){
        Forint e = new Forint(367);
        assertEquals(1,(int)e.euroba());
    }
    @Test
    void eurotest03(){
        Forint e = new Forint(-110);
        assertEquals(0,e.euroba());
    }
    @Test
    void yentest01(){
        Forint y = new Forint(2.72);
        assertEquals(1 ,(int)y.Yen());
    }
    @Test
    void yentest02(){
        Forint y = new Forint(1045);
        assertEquals(384,(int)y.Yen());
    }
    @Test
    void yentest03(){
        Forint y = new Forint(-110);
        assertEquals(0,y.Yen());
    }


}