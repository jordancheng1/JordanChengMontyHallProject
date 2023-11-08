public class Game {
    private int door1;
    private int door2;
    private int door3;
    private int userChoice;
    private String switchChoice;

    public Game(int userChoice, int winDoor) {
    }

    public int revealDoor(int userChoice, int winDoor) {
        if (winDoor == 1 && userChoice == 1) {
            return 2;
        }
        if (winDoor == 1 && userChoice == 2) {
            return 3;
        }
        else if (winDoor == 1 && userChoice == 3) {
            return 2;
        }
        else if (winDoor == 2 && userChoice == 2) {
            return 1;
        }
        else if (winDoor == 2 && userChoice == 1) {
            return 3;
        }
        else if (winDoor == 2 && userChoice == 3) {
            return 1;
        }
        else if (winDoor == 3 && userChoice == 3) {
            return 1;
        }
        else if (winDoor == 3 && userChoice == 1) {
            return 2;
        }
        else {
            return 1;
        }
    }

    public int switchDoor(int userChoice, int winDoor) {
        if (winDoor == 1 && userChoice == 1) {
            return 3;
        }
        if (winDoor == 1 && userChoice == 2) {
            return 1;
        }
        else if (winDoor == 1 && userChoice == 3) {
            return 1;
        }
        else if (winDoor == 2 && userChoice == 2) {
            return 3;
        }
        else if (winDoor == 2 && userChoice == 1) {
            return 2;
        }
        else if (winDoor == 2 && userChoice == 3) {
            return 2;
        }
        else if (winDoor == 3 && userChoice == 3) {
            return 2;
        }
        else if (winDoor == 3 && userChoice == 1) {
            return 3;
        }
        else {
            return 3;
        }
    }

    public boolean result(int userChoice, int winDoor) {
        return userChoice == winDoor;
    }

}
