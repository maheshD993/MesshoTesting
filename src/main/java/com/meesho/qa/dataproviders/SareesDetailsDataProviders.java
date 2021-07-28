package com.meesho.qa.dataproviders;

import org.testng.annotations.DataProvider;

public class SareesDetailsDataProviders {

    @DataProvider
    public Object[][] getSareesInfo(){
        Object[][] data=new Object[3][3];
        //pageLink..class Name...PageTitle
        //data-1
        data[0][0]="Chitrarekha Sensational Sarees";
        data[0][1]="ChitrarekhaPage.class";
        data[0][2]="Chitrarekha Sensational Sarees";
        //data-2
        data[1][0]="Myra Petite Sarees";
        data[1][1]="MyraPetitePage.class";
        data[1][2]="Myra Petite Sarees";

        //data-3
        data[2][0]="Alisha Petite Sarees";
        data[2][1]="AlishPetitePage.class";
        data[2][2]="Alisha Petite Sarees";

        return data;
    }
}
