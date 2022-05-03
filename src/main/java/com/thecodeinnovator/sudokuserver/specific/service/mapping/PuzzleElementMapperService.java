package com.thecodeinnovator.sudokuserver.specific.service.mapping;

import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize4;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize5;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSizeN;

import org.springframework.stereotype.Service;

@Service
public class PuzzleElementMapperService {
    public SudokuElementSizeN getSudokuElementSizeNForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            default:
                return SudokuElementSizeN.ELEMENT_0;
        }
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
            default:
                return SudokuElementSizeN.ELEMENT_0;
        }
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSizeN.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSizeN.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSizeN.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSizeN.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSizeN.ELEMENT_9;
            default:
                return SudokuElementSizeN.ELEMENT_0;
        }
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize4(SudokuElementSize4 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSizeN.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSizeN.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSizeN.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSizeN.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSizeN.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSizeN.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSizeN.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSizeN.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSizeN.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSizeN.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSizeN.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSizeN.ELEMENT_16;
            default:
                return SudokuElementSizeN.ELEMENT_0;
        }
    }

    public SudokuElementSizeN gSudokuElementSizeNForSudokuElementSize5(SudokuElementSize5 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSizeN.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSizeN.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSizeN.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSizeN.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSizeN.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSizeN.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSizeN.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSizeN.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSizeN.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSizeN.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSizeN.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSizeN.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSizeN.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSizeN.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSizeN.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSizeN.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSizeN.ELEMENT_16;
            case ELEMENT_17:
                return SudokuElementSizeN.ELEMENT_17;
            case ELEMENT_18:
                return SudokuElementSizeN.ELEMENT_18;
            case ELEMENT_19:
                return SudokuElementSizeN.ELEMENT_19;
            case ELEMENT_20:
                return SudokuElementSizeN.ELEMENT_20;
            case ELEMENT_21:
                return SudokuElementSizeN.ELEMENT_21;
            case ELEMENT_22:
                return SudokuElementSizeN.ELEMENT_22;
            case ELEMENT_23:
                return SudokuElementSizeN.ELEMENT_23;
            case ELEMENT_24:
                return SudokuElementSizeN.ELEMENT_24;
            case ELEMENT_25:
                return SudokuElementSizeN.ELEMENT_25;
            default:
                return SudokuElementSizeN.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize5.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize5.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize5.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize5.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize5.ELEMENT_9;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSize4(SudokuElementSize4 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize5.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize5.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize5.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize5.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize5.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSize5.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSize5.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSize5.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSize5.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSize5.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSize5.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSize5.ELEMENT_16;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize5 getSudokuElementSize5ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize5.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize5.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize5.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize5.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize5.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize5.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize5.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize5.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize5.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize5.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSize5.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSize5.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSize5.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSize5.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSize5.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSize5.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSize5.ELEMENT_16;
            case ELEMENT_17:
                return SudokuElementSize5.ELEMENT_17;
            case ELEMENT_18:
                return SudokuElementSize5.ELEMENT_18;
            case ELEMENT_19:
                return SudokuElementSize5.ELEMENT_19;
            case ELEMENT_20:
                return SudokuElementSize5.ELEMENT_20;
            case ELEMENT_21:
                return SudokuElementSize5.ELEMENT_21;
            case ELEMENT_22:
                return SudokuElementSize5.ELEMENT_22;
            case ELEMENT_23:
                return SudokuElementSize5.ELEMENT_23;
            case ELEMENT_24:
                return SudokuElementSize5.ELEMENT_24;
            case ELEMENT_25:
                return SudokuElementSize5.ELEMENT_25;
            default:
                return SudokuElementSize5.ELEMENT_0;
        }
    }

    public SudokuElementSize4 getSudokuElementSize4ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            default:
                return SudokuElementSize4.ELEMENT_0;
        }
    }

    public SudokuElementSize4 gSudokuElementSize4ForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize4.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize4.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize4.ELEMENT_4;
            default:
                return SudokuElementSize4.ELEMENT_0;
        }
    }

    public SudokuElementSize4 gSudokuElementSize4ForSudokuElementSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize4.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize4.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize4.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize4.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize4.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize4.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize4.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize4.ELEMENT_9;
            default:
                return SudokuElementSize4.ELEMENT_0;
        }
    }

    public SudokuElementSize4 getSudokuElementSize4ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize4.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize4.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize4.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize4.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize4.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize4.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize4.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize4.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize4.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize4.ELEMENT_9;
            case ELEMENT_10:
                return SudokuElementSize4.ELEMENT_10;
            case ELEMENT_11:
                return SudokuElementSize4.ELEMENT_11;
            case ELEMENT_12:
                return SudokuElementSize4.ELEMENT_12;
            case ELEMENT_13:
                return SudokuElementSize4.ELEMENT_13;
            case ELEMENT_14:
                return SudokuElementSize4.ELEMENT_14;
            case ELEMENT_15:
                return SudokuElementSize4.ELEMENT_15;
            case ELEMENT_16:
                return SudokuElementSize4.ELEMENT_16;
            default:
                return SudokuElementSize4.ELEMENT_0;  
        }
    }

    public SudokuElementSize3 getSudokuElementSize3ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize3.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize3.ELEMENT_1;
            default:
                return SudokuElementSize3.ELEMENT_0;
        }
    }

    public SudokuElementSize3 gSudokuElementSize3ForSudokuElementSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize3.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize3.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize3.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize3.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize3.ELEMENT_4;
            default:
                return SudokuElementSize3.ELEMENT_0;
        }
    }

    public SudokuElementSize3 getSudokuElementSize3ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize3.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize3.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize3.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize3.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize3.ELEMENT_4;
            case ELEMENT_5:
                return SudokuElementSize3.ELEMENT_5;
            case ELEMENT_6:
                return SudokuElementSize3.ELEMENT_6;
            case ELEMENT_7:
                return SudokuElementSize3.ELEMENT_7;
            case ELEMENT_8:
                return SudokuElementSize3.ELEMENT_8;
            case ELEMENT_9:
                return SudokuElementSize3.ELEMENT_9;
            default:
                return SudokuElementSize3.ELEMENT_0;
        }
    }

    public SudokuElementSize2 getSudokuElementSize2ForSudokuElementSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize2.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize2.ELEMENT_1;
            default:
                return SudokuElementSize2.ELEMENT_0;
        }
    }

    public SudokuElementSize2 getSudokuElementSize2ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize2.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize2.ELEMENT_1;
            case ELEMENT_2:
                return SudokuElementSize2.ELEMENT_2;
            case ELEMENT_3:
                return SudokuElementSize2.ELEMENT_3;
            case ELEMENT_4:
                return SudokuElementSize2.ELEMENT_4;
            default:
                return SudokuElementSize2.ELEMENT_0;
        }
    }

    public SudokuElementSize1 getSudokuElementSize1ForSudokuElementSizeN(SudokuElementSizeN element) {
        switch (element) {
            case ELEMENT_0:
                return SudokuElementSize1.ELEMENT_0;
            case ELEMENT_1:
                return SudokuElementSize1.ELEMENT_1;
            default:
                return SudokuElementSize1.ELEMENT_0;
        }
    }
}
