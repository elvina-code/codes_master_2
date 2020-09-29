package com.school.javacore.oop;

import org.hamcrest.core.StringContains;
import org.junit.Test;

import java.util.ArrayList;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class RestaurantDemoAppTest {

    RestaurantDemoApp restaurantDemoApp = new RestaurantDemoApp();
    @Test
    public void constructorInitializesUsersList(){

        boolean loginCheck = restaurantDemoApp.login("randomUser", "qwerty");
        boolean loginCheck1 = restaurantDemoApp.login("user1", "s3cr3t");

        assertThat(loginCheck, is(false));
        assertThat(loginCheck1, is(equalTo(true)));

        assertFalse(loginCheck);
        assertTrue(loginCheck1);
        assertEquals(false, loginCheck);
        assertEquals(true, loginCheck1);
    }

    @Test
    public void testLogin2ReturnsUser(){
        User user = restaurantDemoApp.login2("adaddddadffsd", "asdasdda");
        assertThat(user, is(nullValue()));

        User user1 = restaurantDemoApp.login2("user1", "s3cr3t");
        assertThat(user1, is(notNullValue()));
        assertThat(user1.getUsername(), is(equalTo("user1")));
        assertThat(user1.getPassword(), is(equalTo("s3cr3t")));
    }

    @Test
    public void testGetMeMenu(){
        ArrayList<Food> listOfFoods;

        listOfFoods = restaurantDemoApp.getMeMenu("all");
        assertThat(listOfFoods, is(notNullValue()));
        assertThat(listOfFoods.size(), is(equalTo(9)));

        listOfFoods = restaurantDemoApp.getMeMenu("APPETIZER");
        assertThat(listOfFoods, is(notNullValue()));
        assertThat(listOfFoods.size(), is(equalTo(3)));

        for (Food f: listOfFoods) {
            assertThat(f.getName(), is(containsString("appetizer")));
        }

        listOfFoods = restaurantDemoApp.getMeMenu("DRINK");
        assertThat(listOfFoods, is(notNullValue()));
        assertThat(listOfFoods.size(), is(equalTo(3)));

        for (Food f: listOfFoods) {
            assertThat(f.getName(), is(containsString("rink")));
        }

        listOfFoods = restaurantDemoApp.getMeMenu("MDISH");
        assertThat(listOfFoods, is(notNullValue()));
        assertThat(listOfFoods.size(), is(equalTo(3)));

        for (Food f: listOfFoods) {
            assertThat(f.getName().toLowerCase(), is(containsString("dish")));
        }


    }
}
