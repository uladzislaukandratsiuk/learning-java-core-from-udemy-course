package com.example.jdbc.with.gui.sample;

import com.example.jdbc.with.gui.sample.model.Artist;
import com.example.jdbc.with.gui.sample.model.MyDataSource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;


public class Controller {

    @FXML
    private TableView<Artist> artistTable;

    public void listArtist() {
        Task<ObservableList<Artist>> task = new GetAllArtistsTask();
        artistTable.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();
    }
}

class GetAllArtistsTask extends Task {

    @Override
    public ObservableList<Artist> call() {
        return FXCollections.observableList(MyDataSource.getInstance().queryArtists(MyDataSource.ORDER_BY_ASC));
    }
}
