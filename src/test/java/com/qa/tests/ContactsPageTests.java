package com.qa.tests;

import com.qa.pages.MainPage;
import org.testng.annotations.Test;


public class ContactsPageTests extends BaseTest {

    MainPage mainPage;



    @Test
    public void openContactsPage(){

        mainPage = new MainPage("I am on Main page!!!");
        mainPage.goToContactsPage();
    }


}
