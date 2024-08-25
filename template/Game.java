package behavioral.template;

/**
 * @Author Md. Aslam Hossain
 * @Date Aug 25, 2024
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
