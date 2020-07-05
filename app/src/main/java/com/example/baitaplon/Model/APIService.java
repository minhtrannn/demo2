package com.example.baitaplon.Model;

import com.example.baitaplon.Notification.MyResponse;
import com.example.baitaplon.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAUtMkWoA:APA91bEwhx3skqeerqpfXBw3W65Q4rGjj5ocfDEn4ackoIwEATEdINsOqanafbk-_b6xPpf9F2qZnoEJ167YsNQ9zpBnjcpaFsWO5j4-c-mcvfcjoJA79ViFQ8dEwTvB9PJXn2TQJEYJ"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotifcation(@Body Sender body);
}
