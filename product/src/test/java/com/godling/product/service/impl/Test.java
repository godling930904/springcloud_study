package com.godling.product.service.impl;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with 凌神.
 * Description:
 * User: 87179
 * Date: 2018-12-06
 * Time: 22:10
 */
public class Test {
    private static final String SPLITTER_1 = "[";
    private static final String SPLITTER_2 = "]";
    private static final String SPLITTER_3 = "},{";
    private static final String SPLITTER_4 = "}\n,{";
    private static final String SPLITTER_5 = "},\n{";
    private static final String SPLITTER_6 = "}\n,\n{";

    private String aa = "{\n" +
            "\"params\": [{\n" +
            "\"id\": \"\",\n" +
            "\"docNo\": \"CNJ-FAN-181100000003343\",\n" +
            "\"customerNo\": \"\",\n" +
            "\"customerName\": \"\",\n" +
            "\"unitNo\": \"KPCS\",\n" +
            "\"unitName\": \"KPCS\",\n" +
            "\"itemNo\": \"SYJ2018\",\n" +
            "\"itemName\": \"原材料\",\n" +
            "\"itemSpec\": \"30*30\",\n" +
            "\"barcode\": \"SYJ2018#181106#0001\",\n" +
            "\"lotNo\": \"SYJ2018181106\",\n" +
            "\"qty\": \"500000\",\n" +
            "\"weight\": \"\",\n" +
            "\"A\": \"SYJ2018\",\n" +
            "\"B\": \"\",\n" +
            "\"C\": \"\",\n" +
            "\"D\": \"\",\n" +
            "\"E\": \"\",\n" +
            "\"F\": \"\",\n" +
            "\"G\": \"\",\n" +
            "\"H\": \"\",\n" +
            "\"I\": \"\",\n" +
            "\"J\": \"\",\n" +
            "\"K\": \"\",\n" +
            "\"L\": \"\",\n" +
            "\"M\": \"\",\n" +
            "\"N\": \"\",\n" +
            "\"O\": \"\",\n" +
            "\"P\": \"\",\n" +
            "\"Q\": \"\",\n" +
            "\"R\": \"\",\n" +
            "\"S\": \"\",\n" +
            "\"T\": \"\",\n" +
            "\"U\": \"\",\n" +
            "\"V\": \"\",\n" +
            "\"W\": \"\",\n" +
            "\"X\": \"\",\n" +
            "\"Y\": \" \",\n" +
            "\"Z\": \"\",\n" +
            "\"templatePath\": \"\",\n" +
            "\"employeeNo\": \"\",\n" +
            "\"employeeName\": \"\",\n" +
            "\"printingTime\": \"\",\n" +
            "\"printQty\": \"\",\n" +
            "\"isPrint\": \"\",\n" +
            "\"computer\": \"\",\n" +
            "\"createDate\": \"20181108\"\n" +
            "}," +
            "{\n" +
            "\"id\": \"\",\n" +
            "\"docNo\": \"CNJ-FAN-1811000000021\",\n" +
            "\"customerNo\": \"\",\n" +
            "\"customerName\": \"\",\n" +
            "\"unitNo\": \"KPCS\",\n" +
            "\"unitName\": \"KPCS\",\n" +
            "\"itemNo\": \"SYJ2018\",\n" +
            "\"itemName\": \"原材料\",\n" +
            "\"itemSpec\": \"30*30\",\n" +
            "\"barcode\": \"SYJ2018#181106#0001\",\n" +
            "\"lotNo\": \"SYJ2018181106\",\n" +
            "\"qty\": \"500000\",\n" +
            "\"weight\": \"\",\n" +
            "\"A\": \"SYJ2018\",\n" +
            "\"B\": \"\",\n" +
            "\"C\": \"\",\n" +
            "\"D\": \"\",\n" +
            "\"E\": \"\",\n" +
            "\"F\": \"\",\n" +
            "\"G\": \"\",\n" +
            "\"H\": \"\",\n" +
            "\"I\": \"\",\n" +
            "\"J\": \"\",\n" +
            "\"K\": \"\",\n" +
            "\"L\": \"\",\n" +
            "\"M\": \"\",\n" +
            "\"N\": \"\",\n" +
            "\"O\": \"\",\n" +
            "\"P\": \"\",\n" +
            "\"Q\": \"\",\n" +
            "\"R\": \"\",\n" +
            "\"S\": \"\",\n" +
            "\"T\": \"\",\n" +
            "\"U\": \"\",\n" +
            "\"V\": \"\",\n" +
            "\"W\": \"\",\n" +
            "\"X\": \"\",\n" +
            "\"Y\": \" \",\n" +
            "\"Z\": \"\",\n" +
            "\"templatePath\": \"\",\n" +
            "\"employeeNo\": \"\",\n" +
            "\"employeeName\": \"\",\n" +
            "\"printingTime\": \"\",\n" +
            "\"printQty\": \"\",\n" +
            "\"isPrint\": \"\",\n" +
            "\"computer\": \"\",\n" +
            "\"createDate\": \"20181108\"\n" +
            "}," +
            "{\n" +
            "\"id\": \"\",\n" +
            "\"docNo\": \"CNJ-FAN-181100000003\",\n" +
            "\"customerNo\": \"\",\n" +
            "\"customerName\": \"\",\n" +
            "\"unitNo\": \"KPCS\",\n" +
            "\"unitName\": \"KPCS\",\n" +
            "\"itemNo\": \"SYJ2018\",\n" +
            "\"itemName\": \"原材料\",\n" +
            "\"itemSpec\": \"30*30\",\n" +
            "\"barcode\": \"SYJ2018#181106#0001\",\n" +
            "\"lotNo\": \"SYJ2018181106\",\n" +
            "\"qty\": \"500000\",\n" +
            "\"weight\": \"\",\n" +
            "\"A\": \"SYJ2018\",\n" +
            "\"B\": \"\",\n" +
            "\"C\": \"\",\n" +
            "\"D\": \"\",\n" +
            "\"E\": \"\",\n" +
            "\"F\": \"\",\n" +
            "\"G\": \"\",\n" +
            "\"H\": \"\",\n" +
            "\"I\": \"\",\n" +
            "\"J\": \"\",\n" +
            "\"K\": \"\",\n" +
            "\"L\": \"\",\n" +
            "\"M\": \"\",\n" +
            "\"N\": \"\",\n" +
            "\"O\": \"\",\n" +
            "\"P\": \"\",\n" +
            "\"Q\": \"\",\n" +
            "\"R\": \"\",\n" +
            "\"S\": \"\",\n" +
            "\"T\": \"\",\n" +
            "\"U\": \"\",\n" +
            "\"V\": \"\",\n" +
            "\"W\": \"\",\n" +
            "\"X\": \"\",\n" +
            "\"Y\": \" \",\n" +
            "\"Z\": \"\",\n" +
            "\"templatePath\": \"\",\n" +
            "\"employeeNo\": \"\",\n" +
            "\"employeeName\": \"\",\n" +
            "\"printingTime\": \"\",\n" +
            "\"printQty\": \"\",\n" +
            "\"isPrint\": \"\",\n" +
            "\"computer\": \"\",\n" +
            "\"createDate\": \"20181108\"\n" +
            "}," +
            "{\n" +
            "\"id\": \"\",\n" +
            "\"docNo\": \"CNJ-FAN-181100000004\",\n" +
            "\"customerNo\": \"\",\n" +
            "\"customerName\": \"\",\n" +
            "\"unitNo\": \"KPCS\",\n" +
            "\"unitName\": \"KPCS\",\n" +
            "\"itemNo\": \"SYJ2018\",\n" +
            "\"itemName\": \"原材料\",\n" +
            "\"itemSpec\": \"30*30\",\n" +
            "\"barcode\": \"SYJ2018#181106#0001\",\n" +
            "\"lotNo\": \"SYJ2018181106\",\n" +
            "\"qty\": \"500000\",\n" +
            "\"weight\": \"\",\n" +
            "\"A\": \"SYJ2018\",\n" +
            "\"B\": \"\",\n" +
            "\"C\": \"\",\n" +
            "\"D\": \"\",\n" +
            "\"E\": \"\",\n" +
            "\"F\": \"\",\n" +
            "\"G\": \"\",\n" +
            "\"H\": \"\",\n" +
            "\"I\": \"\",\n" +
            "\"J\": \"\",\n" +
            "\"K\": \"\",\n" +
            "\"L\": \"\",\n" +
            "\"M\": \"\",\n" +
            "\"N\": \"\",\n" +
            "\"O\": \"\",\n" +
            "\"P\": \"\",\n" +
            "\"Q\": \"\",\n" +
            "\"R\": \"\",\n" +
            "\"S\": \"\",\n" +
            "\"T\": \"\",\n" +
            "\"U\": \"\",\n" +
            "\"V\": \"\",\n" +
            "\"W\": \"\",\n" +
            "\"X\": \"\",\n" +
            "\"Y\": \" \",\n" +
            "\"Z\": \"\",\n" +
            "\"templatePath\": \"\",\n" +
            "\"employeeNo\": \"\",\n" +
            "\"employeeName\": \"\",\n" +
            "\"printingTime\": \"\",\n" +
            "\"printQty\": \"\",\n" +
            "\"isPrint\": \"\",\n" +
            "\"computer\": \"\",\n" +
            "\"createDate\": \"20181108\"\n" +
            "}," +
            "{\n" +
            "\"id\": \"\",\n" +
            "\"docNo\": \"CNJ-FAN-181100000005\",\n" +
            "\"customerNo\": \"\",\n" +
            "\"customerName\": \"\",\n" +
            "\"unitNo\": \"KPCS\",\n" +
            "\"unitName\": \"KPCS\",\n" +
            "\"itemNo\": \"SYJ2018\",\n" +
            "\"itemName\": \"原材料\",\n" +
            "\"itemSpec\": \"30*30\",\n" +
            "\"barcode\": \"SYJ2018#181106#0001\",\n" +
            "\"lotNo\": \"SYJ2018181106\",\n" +
            "\"qty\": \"500000\",\n" +
            "\"weight\": \"\",\n" +
            "\"A\": \"SYJ2018\",\n" +
            "\"B\": \"\",\n" +
            "\"C\": \"\",\n" +
            "\"D\": \"\",\n" +
            "\"E\": \"\",\n" +
            "\"F\": \"\",\n" +
            "\"G\": \"\",\n" +
            "\"H\": \"\",\n" +
            "\"I\": \"\",\n" +
            "\"J\": \"\",\n" +
            "\"K\": \"\",\n" +
            "\"L\": \"\",\n" +
            "\"M\": \"\",\n" +
            "\"N\": \"\",\n" +
            "\"O\": \"\",\n" +
            "\"P\": \"\",\n" +
            "\"Q\": \"\",\n" +
            "\"R\": \"\",\n" +
            "\"S\": \"\",\n" +
            "\"T\": \"\",\n" +
            "\"U\": \"\",\n" +
            "\"V\": \"\",\n" +
            "\"W\": \"\",\n" +
            "\"X\": \"\",\n" +
            "\"Y\": \" \",\n" +
            "\"Z\": \"\",\n" +
            "\"templatePath\": \"\",\n" +
            "\"employeeNo\": \"\",\n" +
            "\"employeeName\": \"\",\n" +
            "\"printingTime\": \"\",\n" +
            "\"printQty\": \"\",\n" +
            "\"isPrint\": \"\",\n" +
            "\"computer\": \"\",\n" +
            "\"createDate\": \"20181108\"\n" +
            "}],\n" +
            "\"printName\": \"Send To OneNote 2016\",\n" +
            "\"template\": \"print_raw\"\n" +
            "}";
    String bb = "{\n" +
            "\"params\": [{\n" +
            "\"id\": \"\",\n" +
            "\"docNo\": \"CNJ-FAN-181100000001\",\n" +
            "\"customerNo\": \"\",\n" +
            "\"customerName\": \"\",\n" +
            "\"unitNo\": \"KPCS\",\n" +
            "\"unitName\": \"KPCS\",\n" +
            "\"itemNo\": \"SYJ2018\",\n" +
            "\"itemName\": \"原材料\",\n" +
            "\"itemSpec\": \"30*30\",\n" +
            "\"barcode\": \"SYJ2018#181106#0001\",\n" +
            "\"lotNo\": \"SYJ2018181106\",\n" +
            "\"qty\": \"500000\",\n" +
            "\"weight\": \"\",\n" +
            "\"A\": \"SYJ2018\",\n" +
            "\"B\": \"\",\n" +
            "\"C\": \"\",\n" +
            "\"D\": \"\",\n" +
            "\"E\": \"\",\n" +
            "\"F\": \"\",\n" +
            "\"G\": \"\",\n" +
            "\"H\": \"\",\n" +
            "\"I\": \"\",\n" +
            "\"J\": \"\",\n" +
            "\"K\": \"\",\n" +
            "\"L\": \"\",\n" +
            "\"M\": \"\",\n" +
            "\"N\": \"\",\n" +
            "\"O\": \"\",\n" +
            "\"P\": \"\",\n" +
            "\"Q\": \"\",\n" +
            "\"R\": \"\",\n" +
            "\"S\": \"\",\n" +
            "\"T\": \"\",\n" +
            "\"U\": \"\",\n" +
            "\"V\": \"\",\n" +
            "\"W\": \"\",\n" +
            "\"X\": \"\",\n" +
            "\"Y\": \" \",\n" +
            "\"Z\": \"\",\n" +
            "\"templatePath\": \"\",\n" +
            "\"employeeNo\": \"\",\n" +
            "\"employeeName\": \"\",\n" +
            "\"printingTime\": \"\",\n" +
            "\"printQty\": \"\",\n" +
            "\"isPrint\": \"\",\n" +
            "\"computer\": \"\",\n" +
            "\"createDate\": \"20181108\"\n" +
            "}],\n" +
            "\"printName\": \"Send To OneNote 2016\",\n" +
            "\"template\": \"print_raw\"\n" +
            "}";

    @org.junit.Test
    public void getSource_id_roid_name() {
        Gson gson = new Gson();
        StringBuilder keys = new StringBuilder();
        StringBuilder values = new StringBuilder();
        ArrayList<String> strings = splitJsonStr(SPLITTER_1, aa);
        ArrayList<String> strings2 = splitJsonStr(SPLITTER_2, strings.get(1));
        String jsonData = strings2.get(0);
        // TODO 此处的分隔符不确定,目前采用以下四种方案进行解析
        //分隔符一  -- },{
        ArrayList<String> strings1 = splitJsonStr(SPLITTER_3, jsonData);
        if (strings1.size() == 1) {
            //分隔符二  -- }\n,{
            strings1 = splitJsonStr(SPLITTER_4, jsonData);
        }
        if (strings1.size() == 1) {
            //分隔符三  -- },\n{
            strings1 = splitJsonStr(SPLITTER_5, jsonData);
        }
        if (strings1.size() == 1) {
            //分隔符四  -- }\n,\n{
            strings1 = splitJsonStr(SPLITTER_6, jsonData);
        }
        if (strings1.size() > 1) {
            //代表多少笔数据
            for (int i = 0; i < strings1.size(); i++) {
                String data = strings1.get(i);
                if (i == 0) {
                    data += "}";
                } else {
                    if (i != strings1.size() - 1) {
                        data = "{" + data + "}";
                    } else {
                        data = "{" + data;
                    }
                }
                LinkedHashMap<String, String> jsonMap = gson.fromJson(data
                        , new TypeToken<LinkedHashMap<String, String>>() {
                        }.getType());
                if (i == 0) {
                    combinationKey(keys, jsonMap);
                }
                combinationValue(values, jsonMap);
                if (i == strings1.size() - 1) {
                    //最后一笔数据添加最后的字符
                    values.deleteCharAt(values.length() - 1).append("\n");
                } else {
                    //前面的数据添加最后的字符
                    values.deleteCharAt(values.length() - 1).append(",").append("\n");
                }
            }
            //单笔时
        } else {
            LinkedHashMap<String, String> jsonMap = gson.fromJson(jsonData
                    , new TypeToken<LinkedHashMap<String, String>>() {
                    }.getType());
            combinationKey(keys, jsonMap);
            combinationValue(values, jsonMap);
            values.deleteCharAt(values.length() - 1);
        }
        keys.deleteCharAt(keys.length() - 1);
        System.out.println(keys.toString() + "\n" + values.toString());
    }

    private void combinationKey(StringBuilder keys, LinkedHashMap<String, String> jsonMap) {
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            keys.append(entry.getKey() + ";");
        }
    }

    private void combinationValue(StringBuilder values, LinkedHashMap<String, String> jsonMap) {
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            values.append(entry.getValue() + ";");
        }
    }

    private ArrayList<String> splitJsonStr(String splitStr, String jsonData) {
        return Lists.newArrayList(Splitter.on(splitStr)
                .trimResults()
                .omitEmptyStrings()
                .split(jsonData));
    }

}
