package sample.JavaFXUI;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.application.Platform;
import sample.DemoTest.Input;
import sample.SortCompare.SortCompare;
import sample.inputTree.Defaultui;
import sample.inputTree.Inputbtree;
import sample.inputTree.Searchtree;
import sample.MenuItemEvent.SJGJS.Gnjs;

import javafx.scene.control.MenuItem;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainUI implements Initializable {
    @FXML
    private ChoiceBox choicetree,choicegraph,choicesort,choiceg;
    @FXML
    private MenuItem gnjs, sdbsf, ecs, hfms, bs, hhs;
    @FXML
    private MenuItem array, stack, queue, linklist, graph, heap, slb;
    @FXML
    private MenuItem select, bubble, quick, insert, shell, jspx, heapsort, merge;
    @FXML
    private MenuItem maze, dxbx, deepsearch, boardsearch;
    @FXML
    private MenuItem about, setting;
    public static int index;
    public static int graphindex;
    public static int sortindex;
    public static int gindex;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String sdgnhtml = new File("src/sample/MenuItemEvent/SJGJS/sdgn.html").getAbsolutePath().replace('\\','/');;
        //响应 MenuItem
        try {
            gnjs.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "树的概念", "file:///"+sdgnhtml); });
            sdbsf.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "树的表示法", "https://www.baidu.com/s?wd=树的表示法"); });
            ecs.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "二叉树", "https://www.baidu.com/s?wd=二叉树"); });
            hfms.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "哈夫曼树", "https://www.baidu.com/s?wd=哈夫曼树"); });
            bs.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "B-/B+树", "https://www.baidu.com/s?wd=B-/B+树"); });
            hhs.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "红黑树", "https://www.baidu.com/s?wd=红黑树"); });
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            array.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "数组", "https://www.baidu.com/s?wd=数组"); });
            stack.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "栈", "https://www.baidu.com/s?wd=栈"); });
            queue.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "队列", "https://www.baidu.com/s?wd=队列"); });
            linklist.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "链表", "https://www.baidu.com/s?wd=链表"); });
            graph.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "图", "https://www.baidu.com/s?wd=图"); });
            heap.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "堆", "https://www.baidu.com/s?wd=堆"); });
            slb.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "散列表", "https://www.baidu.com/s?wd=散列表"); });
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            select.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "选择排序", "https://www.baidu.com/s?wd=选择排序"); });
            bubble.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "冒泡排序", "https://www.baidu.com/s?wd=冒泡排序"); });
            quick.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "快速排序", "https://www.baidu.com/s?wd=快速排序"); });
            insert.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "直接插入排序", "https://www.baidu.com/s?wd=直接插入排序"); });
            shell.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "希尔排序", "https://www.baidu.com/s?wd=希尔排序"); });
            jspx.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "基数排序", "https://www.baidu.com/s?wd=基数排序"); });
            heapsort.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "堆排序", "https://www.baidu.com/s?wd=堆排序"); });
            merge.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "归并排序", "https://www.baidu.com/s?wd=归并排序"); });
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            maze.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "迷宫寻路", "https://www.baidu.com/s?wd=迷宫寻路算法"); });
            dxbx.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "电线布线", "https://www.baidu.com/s?wd=电线布线算法"); });
            deepsearch.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "深度优先搜索", "https://www.baidu.com/s?wd=深度优先搜索"); });
            boardsearch.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "广度优先搜索", "https://www.baidu.com/s?wd=广度优先搜索"); });
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            about.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "关于本软件", "https://www.baidu.com/s?wd=about"); });
            setting.setOnAction(e -> { Gnjs.getInstance().start(new Stage(), "设置", "https://www.baidu.com/s?wd=setting"); });
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //响应ChoiceBox：choicetree的选择
        choicetree.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov,
                 Number old_val,Number new_val) -> {
                    System.out.println("choicetree index:"+new_val);
                    index = new_val.intValue();
                    if(new_val.intValue() != 0) {
                        if (new_val.intValue() != 3) {
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        Inputbtree.getInstance().start(new Stage());
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                            });
                        } else {
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        Searchtree.getInstance().start(new Stage());
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                            });
                        }
                    }
                }
        );
        //响应ChoiceBox：choicegraph的选择
        choicegraph.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov,
                 Number old_val,Number new_val) -> {
                    System.out.println("choicegraph index:"+new_val);
                    graphindex = new_val.intValue();
                    Defaultui dui = new Defaultui();
                    try{
                        dui.start(new Stage());
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
        );
        //响应ChoiceBox：choicesort的选择
        choicesort.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov,
                 Number old_val,Number new_val) -> {
                    System.out.println("choicesort index:"+new_val);
                    sortindex = new_val.intValue();
                    //八大排序
                    if(sortindex != 0 && sortindex != 9) {
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Input i = new Input();
                                    i.start(new Stage());
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        });
                    }
                    //转入比较排序的界面
                    else if(sortindex == 9){
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    SortCompare sc = new SortCompare();
                                    sc.start(new Stage());
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        });
                    }
                }
        );
        //响应ChoiceBox：choiceg的选择
        choiceg.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov,
                 Number old_val,Number new_val) -> {
                    System.out.println("choiceg index:"+new_val);
                    gindex = new_val.intValue();
                    Defaultui dui = new Defaultui();
                    try{
                        dui.start(new Stage());
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
        );
    }

}
