package cleancode.minesweeper.tobe.minesweeper.board.position;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CellPositionTest {

    @DisplayName("셀의 행, 열 인덱스에 음수가 올 수 없다.")
    @Test
    void negativeIndexCellPosition() {
        //given
        //when
        //then
        assertThatThrownBy(() -> CellPosition.of(-1, -1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("올바르지 않은 좌표입니다.");
    }
}
