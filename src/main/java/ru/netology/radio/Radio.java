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

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
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


