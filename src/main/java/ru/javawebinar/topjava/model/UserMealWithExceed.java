package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

/**
 * GKislin
 * 11.01.2015.
 */
public class UserMealWithExceed {
    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    private final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }
<<<<<<< Updated upstream

    public UserMealWithExceed (UserMeal usermeal, boolean exceed){
        this.dateTime = usermeal.getDateTime();
        this.description = usermeal.getDescription();
        this.calories = usermeal.getCalories();
        this.exceed = exceed;
    }
=======
>>>>>>> Stashed changes
}
