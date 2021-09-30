import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import org.junit.jupiter.api.Test;
import testhelper.RandomStub;

import static org.junit.Assert.assertEquals;

public class BubbleTeaRouletteServiceTest {

    @Test
    public void shouldGenerateARandomBubbleTeaTypeWhenGetRandomBubbleTeaTypeIsCalledJasmine() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.JasmineMilkTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.JasmineMilkTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldGenerateARandomBubbleTeaTypeWhenGetRandomBubbleTeaTypeIsCalledPeach() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.PeachIceTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.PeachIceTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }

}
