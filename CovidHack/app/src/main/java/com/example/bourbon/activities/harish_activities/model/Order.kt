package com.example.bourbon.activities.harish_activities.model

import java.io.Serializable

data class Order(val custName:String, val custId:String, val orderId:String, val DOP:String, val purchasedItems:ArrayList<String>?):Serializable