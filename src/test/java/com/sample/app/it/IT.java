package com.sample.app.it;

import com.sample.app.Lock;
import com.sample.app.MyClass;
import org.junit.Assert;
import org.junit.Test;

public class IT {

    @Test
    public void integrationTest(){
        MyClass myClass=new MyClass();
        myClass.setName("Key");
        myClass.setId(2);
        myClass.setSecret(5);

        Lock lock=new Lock(10);
        Assert.assertEquals(true,lock.unlock(myClass.calculateKey()));
        Assert.assertEquals(false,lock.isLocked());

        lock.lock();
        myClass.setSecret(6);

        Assert.assertEquals(false,lock.unlock(myClass.calculateKey()));
        Assert.assertEquals(true,lock.isLocked());
    }
}
