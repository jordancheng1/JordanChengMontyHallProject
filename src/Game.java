public class Game {
    private int door1 = 1;
    private int door2 = 2;
    private int door3 = 3;
    private int winDoor;
    private int userChoice;
    private String switchChoice;

    public int winningDoor() {
        return winDoor = (int) (Math.random() * 3) + 1;
    }

    public int  revealDoor(int userChoice) {
        if (winDoor == 1 && userChoice == 2) {
            return door3;
        }
        else if (winDoor == 1 && userChoice == 3) {
            return door2;
        }
        else if (winDoor == 2 && userChoice == 1) {
            return door3;
        }
        else if (winDoor == 2 && userChoice == 3) {
            return door1;
        }
        else if (winDoor == 3 && userChoice == 1) {
            return door2;
        }
        else {
            return door1;
        }
    }

    public boolean switchDoor(String switchChoice) {
        if (switchChoice == "Yes") {
            return
        }
    }
    public boolean result(int userChoice) {
        if (userChoice == winDoor) {
            return true;
        }
        else {
            return false;
        }
    }

}
