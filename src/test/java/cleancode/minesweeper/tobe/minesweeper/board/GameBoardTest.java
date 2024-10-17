package cleancode.minesweeper.tobe.minesweeper.board;

import cleancode.minesweeper.tobe.minesweeper.board.position.CellPosition;
import cleancode.minesweeper.tobe.minesweeper.gamelevel.Beginner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameBoardTest {

    @DisplayName("게임이 시작하면 게임 상태가 진행 중이 된다.")
    @Test
    void isInProgessStatus() {
        //given
        GameBoard gameBoard = new GameBoard(new Beginner());

        //when
        boolean isInProgress = gameBoard.isInProgress();

        //then
        assertThat(isInProgress).isTrue();
    }

    @DisplayName("유효하지 않은 셀을 선택한다.")
    @Test
    void isInvalidCellPosition() {
        //given
        GameBoard gameBoard = new GameBoard(new Beginner());
        CellPosition cellPosition = CellPosition.of(9, 10);
        
        //when
        boolean isInvalid = gameBoard.isInvalidCellPosition(cellPosition);

        //then
        assertThat(isInvalid).isTrue();
    }
}
