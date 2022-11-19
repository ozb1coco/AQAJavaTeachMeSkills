package TeachMeSkills.com.Lesson7.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MathOperationResultHistoryCollections implements MathOperationHistory {
    //Сделать еще 1 реализацию истории операций калькулятора в мапе должно быть
    // 4 записи, ключ каждой содержит 1 из операций +-*/. Если операция была
    //сложение, то добавить результат к списку с ключем +, т.е. мап будет выглядить
    //как HashMap<String,List<Double>>
    HashMap<String, List<Double>> historyCollectionList = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void createHistoryCollection() {
        historyCollectionList.put("+", new ArrayList<>());
        historyCollectionList.put("-", new ArrayList<>());
        historyCollectionList.put("*", new ArrayList<>());
        historyCollectionList.put("/", new ArrayList<>());
    }

    @Override
    public String toString() {
        return "MathOperationResultHistoryCollections{" +
                "historyCollectionList=" + historyCollectionList +
                '}';
    }

    @Override
    public void addToHistory(double value) {

    }

    @Override
    public void addToHistory(String operation, double value) {
        historyCollectionList.get(operation).add(value);
    }

    @Override
    public void printMathOperationHistory() {
        System.out.println(historyCollectionList.toString());
    }
}
