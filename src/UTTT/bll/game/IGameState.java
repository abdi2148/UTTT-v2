package UTTT.bll.game;

import UTTT.bll.field.IField;

/**
 *
 * @author PC
 */
public interface IGameState {

    IField getField();

    int getMoveNumber();
    void setMoveNumber(int moveNumber);

    int getRoundNumber();
    void setRoundNumber(int roundNumber);

    int getTimePerMove();
    void setTimePerMove(int milliSeconds);
}
