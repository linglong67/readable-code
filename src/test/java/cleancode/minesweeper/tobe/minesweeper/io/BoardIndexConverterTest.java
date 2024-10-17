package cleancode.minesweeper.tobe.minesweeper.io;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoardIndexConverterTest {

    @DisplayName("셀 위치를 입력하면 컬럼에 맞는 알파벳 인덱스를 반환한다.")
    @Test
    void getSelectedColIndex() {
        //given
        BoardIndexConverter boardIndexConverter = new BoardIndexConverter();

        //when
        int colIndex = boardIndexConverter.getSelectedColIndex("a1");

        //then
        assertThat(colIndex).isEqualTo(0);
    }
}
