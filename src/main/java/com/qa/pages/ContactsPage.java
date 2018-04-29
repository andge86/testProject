package com.qa.pages;

public class ContactsPage {

    String helloText;

    public ContactsPage(String helloText){

        this.helloText = helloText;
        System.out.println("Contacts page object is created");

    }


    public SearchPage goToSearchPage(){

        System.out.println("Going to Search page");
        return new SearchPage("I am on Search page!!!");

    }

}
