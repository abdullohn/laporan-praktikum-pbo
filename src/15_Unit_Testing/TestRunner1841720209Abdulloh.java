/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database1841720209Abdulloh;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest1841720209Abdulloh.MessageProcessorTest1841720209Abdulloh;

/**
 *
 * @author Abror
 */
public class TestRunner1841720209Abdulloh {

    public static void main(String[] args) {
//        Result mResult = new JUnitCore().runClasses(MessageProcessorTest.class);
//        showMessageResult(mResult, MessageProcessorTest.class.getSimpleName());
//        
//        mResult = new JUnitCore().runClasses(KategoriTest.class);
//        showMessageResult(mResult, KategoriTest.class.getSimpleName());

        Result mResult = new JUnitCore().runClasses(AnggotaTest1841720209Abdulloh.class);
        showMessageResult(mResult, AnggotaTest1841720209Abdulloh.class.getSimpleName());
    }

    private static void showMessageResult(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
