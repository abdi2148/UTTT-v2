package UTTT.bll.bot;

import UTTT.bll.game.IGameState;
import UTTT.bll.move.IMove;

import java.util.List;
import java.util.Random;

/**
 *
 * @author PC
 */
public class WW3Draft implements IBot{
    private static final String BOTNAME = "WW3 Bot";

    @Override
    public IMove doMove(IGameState state) {
        Random r = new Random();
        List<IMove> validMoves = state.getField().getAvailableMoves();
        return validMoves.get(r.nextInt(validMoves.size()));
    }

    @Override
    public String getBotName() {
        return BOTNAME;
    }
}
