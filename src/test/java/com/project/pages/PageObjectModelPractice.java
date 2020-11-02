package com.project.pages;

import org.testng.annotations.Test;

public class PageObjectModelPractice {
        LoginPage loginPage;
        //    LandingPage landingPage;
        @Test
        public void login_to_smartbear(){
            LoginPage loginPage = new LoginPage();
            //get url --> smartbear
            loginPage.usernameInput.sendKeys("anyusername");
        }

    }
