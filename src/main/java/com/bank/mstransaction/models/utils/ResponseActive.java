package com.bank.mstransaction.models.utils;

import com.bank.mstransaction.models.documents.Active;
import lombok.Data;

@Data
public class ResponseActive
{
    private Active data;

    private String message;

    private String status;

}
