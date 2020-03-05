/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTTT.gui.util;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory;
import javafx.scene.text.Text;

/**
 *
 * @author PC
 */
public class FontAwesomeHelper {
    public static Text getFontAwesomeIconFromPlayerId(String playerId) throws RuntimeException {
        switch (playerId) {
            case "0":
                return FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.USB);
            case "1":
                return FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.BATTERY_1);
            case "TIE":
                return FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.BLACK_TIE);
            default:
                throw new RuntimeException("PlayerId not valid");
        }
    }
}
