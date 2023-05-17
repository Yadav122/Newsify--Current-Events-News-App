package com.company.newx;

import com.company.newx.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewApiResponse> {
    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message);
}
