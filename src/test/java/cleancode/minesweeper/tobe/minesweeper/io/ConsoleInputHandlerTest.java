package cleancode.minesweeper.tobe.minesweeper.io;

import cleancode.minesweeper.tobe.minesweeper.user.UserAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleInputHandlerTest {

    @DisplayName("사용자가 1번을 선택하면 셀을 연다.")
    @Test
    void selectInputOne() {
        //given
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //when
        ConsoleInputHandler consoleInputHandler = new ConsoleInputHandler();
        UserAction action = consoleInputHandler.getUserActionFromUser();

        //then
        assertThat(action).isEqualTo(UserAction.OPEN);
    }

    @DisplayName("사용자가 보기에 없는 값을 입력하면 오류가 발생한다.")
    @Test
    void selectInputOther() {
        //given
        String input = "999\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //when
        ConsoleInputHandler consoleInputHandler = new ConsoleInputHandler();
        UserAction action = consoleInputHandler.getUserActionFromUser();

        //then
        assertThat(action).isEqualTo(UserAction.UNKNOWN);
    }
}
