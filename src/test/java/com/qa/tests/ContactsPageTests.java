package com.qa.tests;

import com.qa.pages.MainPage;
import org.testng.annotations.Test;


public class ContactsPageTests extends BaseTest {

    MainPage mainPage;



    @Test
    public void openContactsPage(){

        System.out.println("Starting test1!");
        
        mainPage = new MainPage("I am on Main page!!!");
        mainPage.goToContactsPage();
    }

    @Test
    public void openSearchPage(){

        System.out.println("Starting test2!");

        mainPage = new MainPage("I am on Main page!!!");
        mainPage.goToContactsPage().goToSearchPage();
    }

    @Test
    public void openSettingsPage(){

        System.out.println("Starting test3!");

        mainPage = new MainPage("I am on Main page!!!");
        mainPage.goToSettingsPage();
    }

}
