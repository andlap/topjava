package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

<<<<<<< Updated upstream
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
=======
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
>>>>>>> Stashed changes

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
//        .toLocalDate();
//        .toLocalTime();
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
<<<<<<< Updated upstream
        List<UserMeal> listUM = mealList.stream().filter((user) -> TimeUtil.isBetween(user.getDateTime().toLocalTime(), startTime, endTime)).collect(Collectors.toList());
        Map<LocalDate, Integer> exceededMap = new HashMap<>();
        for (UserMeal user : mealList){
            LocalDate date = user.getDateTime().toLocalDate();
            if(exceededMap.containsKey(date))
                exceededMap.put(date, exceededMap.get(date) +  user.getCalories());
            else
                exceededMap.put(date, user.getCalories());
        }

        List<UserMealWithExceed> listUMWE = new ArrayList<>();
        for(UserMeal user : listUM){
            listUMWE.add(new UserMealWithExceed(user, exceededMap.get(user.getDateTime().toLocalDate()) <= caloriesPerDay));
        }
        return listUMWE;
=======
        System.out.println("TODO return filtered list with correctly exceeded field");
        return null;
>>>>>>> Stashed changes
    }
}
