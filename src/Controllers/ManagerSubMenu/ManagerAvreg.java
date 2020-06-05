package Controllers.ManagerSubMenu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerAvreg implements Initializable {

    @FXML
    private StackedBarChart<String, Number> CHART;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();

        series1.setName("ماکسیمم پرداختی");
        series1.getData().add(new XYChart.Data<>("فروردین", 200000000));
        series1.getData().add(new XYChart.Data<>("اردیبهشت", 180000000));
        series1.getData().add(new XYChart.Data<>("خرداد", 220000000));
        series1.getData().add(new XYChart.Data<>("تیر",190000000 ));
        series1.getData().add(new XYChart.Data<>("مرداد", 240000000));
        series1.getData().add(new XYChart.Data<>("شهریور", 210000000));
        series1.getData().add(new XYChart.Data<>("مهر", 170000000));
        series1.getData().add(new XYChart.Data<>("آبان", 190000000));
        series1.getData().add(new XYChart.Data<>("آذر", 180000000));
        series1.getData().add(new XYChart.Data<>("دی", 220000000));
        series1.getData().add(new XYChart.Data<>("بهمن", 190000000));
        series1.getData().add(new XYChart.Data<>("اسفند", 240000000));

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("مینیمم پرداختی");
        series2.getData().add(new XYChart.Data<>("فروردین", 20000000));
        series2.getData().add(new XYChart.Data<>("اردیبهشت", 35000000));
        series2.getData().add(new XYChart.Data<>("خرداد", 40000000));
        series2.getData().add(new XYChart.Data<>("تیر", 50000000));
        series2.getData().add(new XYChart.Data<>("مرداد", 60000000));
        series2.getData().add(new XYChart.Data<>("شهریور", 50000000));
        series2.getData().add(new XYChart.Data<>("مهر", 30000000));
        series2.getData().add(new XYChart.Data<>("آبان", 40000000));
        series2.getData().add(new XYChart.Data<>("آذر", 50000000));
        series2.getData().add(new XYChart.Data<>("دی", 40000000));
        series2.getData().add(new XYChart.Data<>("بهمن", 50000000));
        series2.getData().add(new XYChart.Data<>("اسفند", 60000000));

        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("میانگین پرداختی");
        series3.getData().add(new XYChart.Data<>("فروردین", 110000000));
        series3.getData().add(new XYChart.Data<>("اردیبهشت", 10750000));
        series3.getData().add(new XYChart.Data<>("خرداد", 130000000));
        series3.getData().add(new XYChart.Data<>("تیر", 130000000));
        series3.getData().add(new XYChart.Data<>("مرداد", 120000000));
        series3.getData().add(new XYChart.Data<>("شهریور", 150000000));
        series3.getData().add(new XYChart.Data<>("مهر", 130000000));
        series3.getData().add(new XYChart.Data<>("آبان", 10000000));
        series3.getData().add(new XYChart.Data<>("آذر", 115000000));
        series3.getData().add(new XYChart.Data<>("دی", 130000000));
        series3.getData().add(new XYChart.Data<>("بهمن", 120000000));
        series3.getData().add(new XYChart.Data<>("اسفند", 150000000));

        CHART.getData().addAll(series1, series2, series3);
    }
}
