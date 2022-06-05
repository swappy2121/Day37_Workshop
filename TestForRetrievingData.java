package com.Bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestForRetrievingData {
    @Test
    public void CheckForRetrievedDataWeGetIsCorrectOrNot(){
        RetrieveAllTheDataFromDB check = new RetrieveAllTheDataFromDB();
        String query1 = "select * from addressbookforfriends";
        String ExpectedQuery = check.Query(query1);
        String actual = query1;
        Assert.assertEquals(actual, ExpectedQuery);

    }
    @Test
    public void checkUpdatedQueryWeGetValidCityNameOrNot() throws SQLException {
        UpdatingDataOfAddressbookByJDBC test = new UpdatingDataOfAddressbookByJDBC();
        String query = "pune";
        String ExpectedCity = test.retrieveData(query);
        String actual = query;
        Assert.assertEquals(actual, ExpectedCity);
    }

    @Test
    public void checkRetreivedContactIsValidOrNot() throws SQLException {
        RetrievingContactsOfPersons test = new RetrievingContactsOfPersons();
        String contact = "9867546344";
        String ExpectedContact = test.retrieveContact(contact);
        String actual = contact;
        Assert.assertEquals(actual, ExpectedContact);
    }

    @Test
    public void checkUpdatedQueryWeGetValidPhoneNumberOrNot() throws SQLException {
        RetrivingContactCountOfAddressbook test = new RetrivingContactCountOfAddressbook();
        String phoneNum = "8600127352";
        String ExpectedCity = test.getContactDetails(phoneNum);
        String actual = phoneNum;
        Assert.assertEquals(actual, ExpectedCity);
    }
}
