package com.challengeApply.retriveArticlesApi.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingTimingsMS {
    public Request _request;
    public AfterFetch afterFetch;
    public Fetch fetch;
    public int total;
}
