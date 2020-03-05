package UTTT.bll.bot;

import UTTT.bll.game.IGameState;
import UTTT.bll.move.IMove;

import java.util.List;
import java.util.Random;

/**
 *
 * @author PC
 */
public class PornsiteVirus implements IBot {

    private static final String BOTNAME = "Pornsite Virus";
    private Random rand = new Random();

    /**
     * Makes a turn. Edit this method to make your bot smarter.
     * Currently does only random moves.
     *
     * @return The selected move we want to make.
     */
    @Override
    public IMove doMove(IGameState state) {
        List<IMove> moves = state.getField().getAvailableMoves();

        if (moves.size() > 0) {
            return moves.get(rand.nextInt(moves.size())); // random moves from available tiles
        }

        return null;
    }
    @Override
    public String getBotName() {
        return BOTNAME;
    }
}
