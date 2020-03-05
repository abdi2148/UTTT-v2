package UTTT.bll.bot;

import UTTT.bll.game.IGameState;
import UTTT.bll.move.IMove;

/**
 *
 * @author PC
 */
public interface IBot {

    /**
     * Makes a turn. Implement this method to make your dk.easv.bll.bot do something.
     *
     * @param state the current dk.easv.bll.game state
     * @return The column where the turn was made.
     */
    IMove doMove(IGameState state);

    String getBotName();
}
