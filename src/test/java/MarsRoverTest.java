import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    void should_return_site_when_fowarding_given_site_twoNumber_0_0_oriention_String_oriention_N(){
        int [] site=new int[]{0,0};
        char orientation='N';
        MarsRover c1=new MarsRover();
        int [] newsite=new int[]{0,1};
        assertArrayEquals(c1.moveForwarding(site,orientation),newsite);

    }
    @Test
    void should_return_site_when_fowarding_given_site_twoNumber_0_0_oriention_String_oriention_E(){
        int [] site=new int[]{0,0};
        char orientation='E';
        MarsRover c1=new MarsRover();
        int [] newsite=new int[]{1,0};
        assertArrayEquals(c1.moveForwarding(site,orientation),newsite);

    }
    @Test
    void should_return_site_when_fowarding_given_site_twoNumber_0_0_oriention_String_oriention_S(){
        int [] site=new int[]{0,0};
        char orientation='S';
        MarsRover c1=new MarsRover();
        int [] newsite=new int[]{0,-1};
        assertArrayEquals(c1.moveForwarding(site,orientation),newsite);

    }
    @Test
    void should_return_site_when_fowarding_given_site_twoNumber_0_0_oriention_String_oriention_W(){
        int [] site=new int[]{0,0};
        char orientation='W';
        MarsRover c1=new MarsRover();
        int [] newsite=new int[]{-1,0};
        assertArrayEquals(c1.moveForwarding(site,orientation),newsite);

    }
    @Test
    void should_return_oriention_when_turningLeft_given_oriention_N(){
        char orientation='N';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation),'W');
}
    @Test
    void should_return_oriention_when_turningLeft_given_oriention_W() {
        char orientation = 'W';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation), 'S');
    }
    @Test
    void should_return_oriention_when_turningLeft_given_oriention_S() {
        char orientation = 'S';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation), 'E');
    }
    @Test
    void should_return_oriention_when_turningLeft_given_oriention_E() {
        char orientation = 'E';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation), 'N');
    }
    @Test
    void should_return_oriention_when_turningRight_given_oriention_N() {
        char orientation = 'N';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation), 'W');
    }
    @Test
    void should_return_oriention_when_turningRight_given_oriention_E() {
        char orientation = 'W';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation), 'S');
    }
    @Test
    void should_return_oriention_when_turningRight_given_oriention_S() {
        char orientation = 'S';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation), 'E');
    }
    @Test
    void should_return_oriention_when_turningRight_given_oriention_W() {
        char orientation = 'E';
        MarsRover c1=new MarsRover();
        assertEquals(c1.turningLeft(orientation), 'N');
    }
    @Test
    void should_return_marsite_when_sites_given_0_0_Orientation_given_E() {
        char orientation = 'E';
        int [] sites={0,0};
        MarsRover c1=new MarsRover();
        assertEquals(c1.marSite(sites,orientation),"0:0:E");
    }

    }

