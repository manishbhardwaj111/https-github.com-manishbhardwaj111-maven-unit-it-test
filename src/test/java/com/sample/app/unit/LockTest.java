package com.sample.app.unit;

import com.sample.app.Lock;
import org.junit.Assert;
import org.junit.Test;

public class LockTest {
    @Test
    public void testLock(){
        Lock lock=new Lock(10);

        Assert.assertEquals(true,lock.isLocked());

        Assert.assertEquals(true,lock.unlock(10));
        Assert.assertEquals(false,lock.isLocked());

        lock.lock();
        Assert.assertEquals(true,lock.isLocked());

        Assert.assertEquals(false,lock.unlock(1));
        Assert.assertEquals(true,lock.isLocked());
    }
}
