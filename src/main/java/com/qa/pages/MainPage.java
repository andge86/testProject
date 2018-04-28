package com.qa.pages;

public class MainPage {

    String helloText;

    public MainPage(String helloText){

        this.helloText = helloText;
        System.out.println("Main page object is created");

    }


    public ContactsPage goToContactsPage(){

        System.out.println(helloText);

        return new ContactsPage("I am on Contacts page!");
    }

}
