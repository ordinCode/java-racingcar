import domain.Car;
import domain.GameManager;
import view.InputView;

public class RacingCarApplication {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        String inputNames = InputView.inputCarName();
        int inputRound = InputView.inputRoundNumber();
        gameManager.start(inputNames,inputRound);
        for (Car car:gameManager.getCars()){
            System.out.println(car);
        }
    }
}
