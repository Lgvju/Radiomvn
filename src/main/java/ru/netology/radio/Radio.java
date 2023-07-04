package ru.netology.radio;

public class Radio {
    //завести два поля -номер текущей радиостанции и громкость звука
    private int currentStation;
    //условие -номер текущей станции от 0 до 9, исп методы next,prev,
    //номер станции также выставляется через прямое указание номера - метод-сеттер( с проверкой на допусимость номера станции)
    private int currentVolume;
    // условие для звука - увеличение и уменьшение громкости - еще  плюс два метода - увеличения и уменьшения звука + метод сеттер для прямой настройки(записи объекта)
    // вопрос - зачем нужны методы геттер - получение значения объекта
    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
       currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}


