package cleancode.minesweeper.tobe.minesweeper.gamelevel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeginnerTest {

    @DisplayName("비기너 레벨을 선택하면 8 X 10 사이즈의 보드가 만들어진다.")
    @Test
    void checkBeginnerLevelBoard() {
        //given
        GameLevel gameLevel = new Beginner();

        //when
        int rowSize = gameLevel.getRowSize();
        int colSize = gameLevel.getColSize();

        //then
        assertThat(rowSize).isEqualTo(8);
        assertThat(colSize).isEqualTo(10);
    }
}
