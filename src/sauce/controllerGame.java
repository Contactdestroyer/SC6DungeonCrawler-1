import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class controllerGame {

    @FXML
    private Rectangle fred;
    @FXML
    private Button startBtn;
    @FXML
    private Rectangle gameScreen;
    private appDungGame app;

    private Image sprite = new Image("playerTestSprite.png");
    private Image dungImg = new Image("Dungoen Background.png");


    public void setApp(appDungGame app){
        this.app = app;
    }

    public void initialize(){
        fred.setFill(new ImagePattern(sprite));
        gameScreen.setFill(new ImagePattern(dungImg));

    }

//--------------------Move Button Methods
    public void moveUp(ActionEvent actionEvent) {
//        fred.setTranslateY(fred.getTranslateY()-fred.getWidth());
        fred.setTranslateY(fred.getTranslateY()-123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }
    public void moveDown(ActionEvent actionEvent) {
//        fred.setTranslateY(fred.getTranslateY()-fred.getWidth());
        fred.setTranslateY(fred.getTranslateY()+123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }
    public void moveLeft(ActionEvent actionEvent) {
//        fred.setTranslateY(fred.getTranslateY()-fred.getWidth());
        fred.setTranslateX(fred.getTranslateX()-123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }
    public void moveRight(ActionEvent actionEvent) {
//        fred.setTranslateY(fred.getTranslateY()-fred.getWidth());
        fred.setTranslateX(fred.getTranslateX()+123);
        System.out.println(fred.getTranslateX() + ","+fred.getTranslateY());//Test code. -----Delete before publish-----
    }


}
