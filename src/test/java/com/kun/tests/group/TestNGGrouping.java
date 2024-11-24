package com.kun.tests.group;

import org.testng.annotations.Test;

/**
 * ClassName: TestNGGrouping
 * Package: com.kun.tests.group
 * Description:
 *
 * @Author KunJiang
 * @Create 11/23/24 8:44 PM
 * @Version 1.0
 */

public class TestNGGrouping {
    @Test(groups = {"smoke"})
    public void testLogin(){
        System.out.println("login: smoke");
    }
    @Test(groups = {"smoke","regression"})
    public void testSearch(){
        System.out.println("search: smoke + regression");
    }
    @Test(groups = {"regression"})
    public void testCheckOut(){
        System.out.println("checkout: regression");
    }
    @Test(groups = {"functional","smoke"})
    public void testAdd(){
        System.out.println("add: functional + smoke");
        
    }
    
}
