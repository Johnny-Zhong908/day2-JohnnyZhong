import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MarsRover {
    private enum Direction {
        N(0, 1),
        E(1, 0),
        S(0, -1),
        W(-1, 0);

        private final int dx;
        private final int dy;

        Direction(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }
    }

    private static final Map<MarsRover.Direction, MarsRover.Direction> LEFT_TURNS = new HashMap<>();
    private static final Map<MarsRover.Direction, MarsRover.Direction> RIGHT_TURNS = new HashMap<>();

    static {

        LEFT_TURNS.put(MarsRover.Direction.N, MarsRover.Direction.W);
        LEFT_TURNS.put(MarsRover.Direction.W, MarsRover.Direction.S);
        LEFT_TURNS.put(MarsRover.Direction.S, MarsRover.Direction.E);
        LEFT_TURNS.put(MarsRover.Direction.E, MarsRover.Direction.N);

        RIGHT_TURNS.put(MarsRover.Direction.N, MarsRover.Direction.E);
        RIGHT_TURNS.put(MarsRover.Direction.E, MarsRover.Direction.S);
        RIGHT_TURNS.put(MarsRover.Direction.S, MarsRover.Direction.W);
        RIGHT_TURNS.put(MarsRover.Direction.W, MarsRover.Direction.N);
    }

    public static void main(String[] args) {
        char Direction='N';
        int [] sites={0,0};
        MarsRover M1=new MarsRover();
        char newDirection=M1.turningRight(Direction);
        int [] newSites=M1.moveForwarding(sites,newDirection);
        String result=M1.marSite(newSites,newDirection);
        System.out.println(result);
    }

    public String marSite(int [] sites,char Orientation){
        return sites[0]+":"+sites[1]+":"+Orientation;
    }
    public int[] moveForwarding(int[] site, char orientation) {
        try {
            MarsRover.Direction direction = MarsRover.Direction.valueOf(String.valueOf(orientation));
            site[0] += direction.dx;
            site[1] += direction.dy;
        } catch (IllegalArgumentException e) {
            System.out.println("False orientation");
        }
        return site;
    }
    public char turningLeft(char orientation) {
        try {
            MarsRover.Direction currentDir = MarsRover.Direction.valueOf(String.valueOf(orientation));
            return LEFT_TURNS.get(currentDir).name().charAt(0);
        } catch (IllegalArgumentException e) {
            System.out.println("False char");
            return orientation;
        }
    }
    public char turningRight(char Orientation){
        switch (Orientation){
            case 'N':
                Orientation='E';
                break;
            case 'E':
                Orientation='S';
                break;
            case 'S':
                Orientation='W';
                break;
            case 'W':
                Orientation='N';
                break;
            default: System.out.println("False char");
                break;
        }
        return Orientation;

    }
}
