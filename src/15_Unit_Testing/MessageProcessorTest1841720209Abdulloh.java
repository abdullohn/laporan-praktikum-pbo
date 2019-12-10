/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest1841720209Abdulloh;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import unittest1841720209Abdulloh.MessageProcessor1841720209Abdulloh;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Abror
 */
public class MessageProcessorTest1841720209Abdulloh {

    MessageProcessor1841720209Abdulloh mProcessor;

    public MessageProcessorTest1841720209Abdulloh() {
        mProcessor = new MessageProcessor1841720209Abdulloh();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("What's up, bruh?");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void textShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo." + "\nThe message as follows : What's up, bruh?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormat());
    }
}
