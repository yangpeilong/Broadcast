package com.example.mylibrary;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyeah on 2019/8/20
 * <p>
 * describe:
 */
public class ReceiverManager {

    private List<ReceiverCallBack> list=new ArrayList<>();

    private ReceiverManager() {}

    public static ReceiverManager getInstance(){
        return Singleton.instance;
    }



    private static class  Singleton{
         static  ReceiverManager instance= new ReceiverManager();
    }


    public void addListener(ReceiverCallBack callBack) {
        if (!list.contains(callBack)) {
            list.add(callBack);
            Log.i("ReceiverManager", "addListener size=="+list.size());
        }
    }

    public void notifyListener(String message) {
        Log.i("ReceiverManager","notifyListener size=="+list.size());
        for (ReceiverCallBack entity : list) {
            entity.onCallBack(message);
        }
    }



    public interface ReceiverCallBack{
        void onCallBack(String content);
    }

}
