package com.thecodeinnovator.sudokuserver.service.mapping;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize1;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize2;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize3;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize4;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSize5;
import com.thecodeinnovator.sudokuserver.enums.SudokuElementSizeN;
import com.thecodeinnovator.sudokuserver.model.access.PuzzleElement1;
import com.thecodeinnovator.sudokuserver.model.access.PuzzleElement2;
import com.thecodeinnovator.sudokuserver.model.access.PuzzleElement3;
import com.thecodeinnovator.sudokuserver.model.access.PuzzleElement4;
import com.thecodeinnovator.sudokuserver.model.access.PuzzleElement5;
import com.thecodeinnovator.sudokuserver.model.access.PuzzleElementN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuzzleElementUtilityService {

    @Autowired
    PuzzleElementMapperService puzzleElementMapperService;

    public int getIntegerRepresentationForSudokuElementsSize5(SudokuElementSize5 element) {
        switch (element) {
            case ELEMENT_0:
                return 0;
            case ELEMENT_1:
                return 1;
            case ELEMENT_2:
                return 2;
            case ELEMENT_3:
                return 3;
            case ELEMENT_4:
                return 4;
            case ELEMENT_5:
                return 5;
            case ELEMENT_6:
                return 6;
            case ELEMENT_7:
                return 7;
            case ELEMENT_8:
                return 8;
            case ELEMENT_9:
                return 9;
            case ELEMENT_10:
                return 10;
            case ELEMENT_11:
                return 11;
            case ELEMENT_12:
                return 12;
            case ELEMENT_13:
                return 13;
            case ELEMENT_14:
                return 14;
            case ELEMENT_15:
                return 15;
            case ELEMENT_16:
                return 16;
            case ELEMENT_17:
                return 17;
            case ELEMENT_18:
                return 18;
            case ELEMENT_19:
                return 19;
            case ELEMENT_20:
                return 20;
            case ELEMENT_21:
                return 21;
            case ELEMENT_22:
                return 22;
            case ELEMENT_23:
                return 23;
            case ELEMENT_24:
                return 24;
            case ELEMENT_25:
                return 25;
            default:
                return 0;
        }
    }

    public List<PuzzleElement5> getPuzzleElement5List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement5> puzzleSegmentation5 = new ArrayList<PuzzleElement5>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize5 ithPuzzleElement5Enum = puzzleElementMapperService.getSudokuElementSize5ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement5 ithPuzzleElement5 = new PuzzleElement5();
            ithPuzzleElement5.setRow_index(rowIndex);
            ithPuzzleElement5.setColumn_index(columnIndex);
            ithPuzzleElement5.setIjPuzzleElement(ithPuzzleElement5Enum);
            puzzleSegmentation5.add(ithPuzzleElement5);
        }
        return puzzleSegmentation5;
    }

    public byte[] generatePuzzleHashFromPuzzleElement5List(List<PuzzleElement5> puzzleElement5List) {
        return null;
    }

    public byte[] generatePositionHashFromPuzzleElement5List(List<PuzzleElement5> puzzleElement5List) {
        return null;
    }

    public byte[] generateHoleHashFromPuzzleElement5List(List<PuzzleElement5> puzzleElement5List) {
        return null;
    }

    public byte[] generatePuzzleDataFromPuzzleElement5List(List<PuzzleElement5> puzzleElement5List) {
        return null;
    }

    public int getIntegerRepresentationForSudokuElementsSize4(SudokuElementSize4 element) {
        switch (element) {
            case ELEMENT_0:
                return 0;
            case ELEMENT_1:
                return 1;
            case ELEMENT_2:
                return 2;
            case ELEMENT_3:
                return 3;
            case ELEMENT_4:
                return 4;
            case ELEMENT_5:
                return 5;
            case ELEMENT_6:
                return 6;
            case ELEMENT_7:
                return 7;
            case ELEMENT_8:
                return 8;
            case ELEMENT_9:
                return 9;
            case ELEMENT_10:
                return 10;
            case ELEMENT_11:
                return 11;
            case ELEMENT_12:
                return 12;
            case ELEMENT_13:
                return 13;
            case ELEMENT_14:
                return 14;
            case ELEMENT_15:
                return 15;
            case ELEMENT_16:
                return 16;
            default:
                return 0;
        }
    }

    public List<PuzzleElement4> getPuzzleElement4List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement4> puzzleSegmentation4 = new ArrayList<PuzzleElement4>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize4 ithPuzzleElement4Enum = puzzleElementMapperService.getSudokuElementSize4ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement4 ithPuzzleElement4 = new PuzzleElement4();
            ithPuzzleElement4.setRow_index(rowIndex);
            ithPuzzleElement4.setColumn_index(columnIndex);
            ithPuzzleElement4.setIjPuzzleElement(ithPuzzleElement4Enum);
            puzzleSegmentation4.add(ithPuzzleElement4);
        }
        return puzzleSegmentation4;
    }

    public byte[] generatePuzzleHashFromPuzzleElement4List(List<PuzzleElement4> puzzleElement4List) {
        return null;
    }

    public byte[] generatePositionHashFromPuzzleElement4List(List<PuzzleElement4> puzzleElement4List) {
        return null;
    }

    public byte[] generateHoleHashFromPuzzleElement4List(List<PuzzleElement4> puzzleElement4List) {
        return null;
    }

    public byte[] generatePuzzleDataFromPuzzleElement4List(List<PuzzleElement4> puzzleElement4List) {
        return null;
    }

    private int getIntegerRepresentationForSudokuElementsSize3(SudokuElementSize3 element) {
        switch (element) {
            case ELEMENT_0:
                return 0;
            case ELEMENT_1:
                return 1;
            case ELEMENT_2:
                return 2;
            case ELEMENT_3:
                return 3;
            case ELEMENT_4:
                return 4;
            case ELEMENT_5:
                return 5;
            case ELEMENT_6:
                return 6;
            case ELEMENT_7:
                return 7;
            case ELEMENT_8:
                return 8;
            case ELEMENT_9:
                return 9;
            default:
                return 0;
        }
    }

    public List<PuzzleElement3> getPuzzleElement3List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement3> puzzleSegmentation3 = new ArrayList<PuzzleElement3>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize3 ithPuzzleElement3Enum = puzzleElementMapperService.getSudokuElementSize3ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement3 ithPuzzleElement3 = new PuzzleElement3();
            ithPuzzleElement3.setRow_index(rowIndex);
            ithPuzzleElement3.setColumn_index(columnIndex);
            ithPuzzleElement3.setIjPuzzleElement(ithPuzzleElement3Enum);
            puzzleSegmentation3.add(ithPuzzleElement3);
        }
        return puzzleSegmentation3;
    }

    public byte[] generatePuzzleHashFromPuzzleElement3List(List<PuzzleElement3> puzzleElement3List) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        
        byte[][] puzzleByteArrayMap = new byte[puzzleElement3List.size()][];
        int i = 0;
        for (PuzzleElement3 ithPuzzleElement3: puzzleElement3List) {
            byte[] ithElementByteArray = new byte[3];
            
            int rowIndex = ithPuzzleElement3.getRow_index();
            int columnIndex = ithPuzzleElement3.getColumn_index();
            int ithElement = this.getIntegerRepresentationForSudokuElementsSize3(ithPuzzleElement3.getIjPuzzleElement());

            ithElementByteArray[0] = (byte) rowIndex;
            ithElementByteArray[1] = (byte) columnIndex;
            ithElementByteArray[2] = (byte) ithElement;

            puzzleByteArrayMap[i] = md.digest(ithElementByteArray);
            i++;
        }

        int digestCount = puzzleByteArrayMap[0].length;
        byte[] condensedArray = new byte[puzzleElement3List.size() * digestCount];
        for (i = 0; i < puzzleElement3List.size(); i++) {
            for (int j = 0; j < digestCount; j++) {
                condensedArray[(i * digestCount) + j] = puzzleByteArrayMap[i][j];
            }
        }
        
        byte[] hashCondensedArray = md.digest(condensedArray);
        return hashCondensedArray;
    }

    public byte[] generatePositionHashFromPuzzleElement3List(List<PuzzleElement3> puzzleElement3List) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        
        byte[][] puzzleByteArrayMap = new byte[puzzleElement3List.size()][];
        int i = 0;
        for (PuzzleElement3 ithPuzzleElement3: puzzleElement3List) {
            byte[] ithElementByteArray = new byte[3];
            
            int rowIndex = ithPuzzleElement3.getRow_index();
            int columnIndex = ithPuzzleElement3.getColumn_index();
            int ithElement = this.getIntegerRepresentationForSudokuElementsSize3(ithPuzzleElement3.getIjPuzzleElement());

            if (ithElement != 0) {
                ithElementByteArray[0] = (byte) rowIndex;
                ithElementByteArray[1] = (byte) columnIndex;
                ithElementByteArray[2] = (byte) ithElement;
                puzzleByteArrayMap[i] = md.digest(ithElementByteArray);
                i++;
            }
        }

        int limitCount = i;

        int digestCount = puzzleByteArrayMap[0].length;
        byte[] condensedArray = new byte[limitCount * digestCount];
        for (i = 0; i < limitCount; i++) {
            for (int j = 0; j < digestCount; j++) {
                condensedArray[(i * digestCount) + j] = puzzleByteArrayMap[i][j];
            }
        }
        
        byte[] hashCondensedArray = md.digest(condensedArray);
        return hashCondensedArray;
    }

    public byte[] generateHoleHashFromPuzzleElement3List(List<PuzzleElement3> puzzleElement3List) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        
        byte[][] puzzleByteArrayMap = new byte[puzzleElement3List.size()][];
        int i = 0;
        for (PuzzleElement3 ithPuzzleElement3: puzzleElement3List) {
            byte[] ithElementByteArray = new byte[3];
            
            int rowIndex = ithPuzzleElement3.getRow_index();
            int columnIndex = ithPuzzleElement3.getColumn_index();
            int ithElement = this.getIntegerRepresentationForSudokuElementsSize3(ithPuzzleElement3.getIjPuzzleElement());

            if (ithElement == 0) {
                ithElementByteArray[0] = (byte) rowIndex;
                ithElementByteArray[1] = (byte) columnIndex;
                ithElementByteArray[2] = (byte) ithElement;
                puzzleByteArrayMap[i] = md.digest(ithElementByteArray);
                i++;
            }
        }

        int limitCount = i;

        int digestCount = puzzleByteArrayMap[0].length;
        byte[] condensedArray = new byte[limitCount * digestCount];
        for (i = 0; i < limitCount; i++) {
            for (int j = 0; j < digestCount; j++) {
                condensedArray[(i * digestCount) + j] = puzzleByteArrayMap[i][j];
            }
        }
        
        byte[] hashCondensedArray = md.digest(condensedArray);
        return hashCondensedArray;
    }

    public byte[] generatePuzzleDataFromPuzzleElement3List(List<PuzzleElement3> puzzleElement3List) {
        int i = 0;
        byte[] puzzleDataArray = new byte[puzzleElement3List.size() * 3];
        for (PuzzleElement3 ithPuzzleElement3: puzzleElement3List) {
            // byte[] ithElementByteArray = new byte[3];
            
            int rowIndex = ithPuzzleElement3.getRow_index();
            int columnIndex = ithPuzzleElement3.getColumn_index();
            int ithElement = this.getIntegerRepresentationForSudokuElementsSize3(ithPuzzleElement3.getIjPuzzleElement());

            puzzleDataArray[(i * 3) + 0] = (byte) rowIndex;
            puzzleDataArray[(i * 3) + 1] = (byte) columnIndex;
            puzzleDataArray[(i * 3) + 2] = (byte) ithElement;
            
            i++;
        }
        return puzzleDataArray;
    }

    public int getIntegerRepresentationForSudokuElementsSize2(SudokuElementSize2 element) {
        switch (element) {
            case ELEMENT_0:
                return 0;
            case ELEMENT_1:
                return 1;
            case ELEMENT_2:
                return 2;
            case ELEMENT_3:
                return 3;
            case ELEMENT_4:
                return 4;
            default:
                return 0;
        }
    }
    
    public List<PuzzleElement2> getPuzzleElement2List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement2> puzzleSegmentation2 = new ArrayList<PuzzleElement2>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize2 ithPuzzleElement2Enum = puzzleElementMapperService.getSudokuElementSize2ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement2 ithPuzzleElement2 = new PuzzleElement2();
            ithPuzzleElement2.setRow_index(rowIndex);
            ithPuzzleElement2.setColumn_index(columnIndex);
            ithPuzzleElement2.setIjPuzzleElement(ithPuzzleElement2Enum);
            puzzleSegmentation2.add(ithPuzzleElement2);
        }
        return puzzleSegmentation2;
    }

    public byte[] generatePuzzleHashFromPuzzleElement2List(List<PuzzleElement2> puzzleElement2List) {
        return null;
    }

    public byte[] generatePositionHashFromPuzzleElement2List(List<PuzzleElement2> puzzleElement2List) {
        return null;
    }

    public byte[] generateHoleHashFromPuzzleElement2List(List<PuzzleElement2> puzzleElement2List) {
        return null;
    }

    public byte[] generatePuzzleDataFromPuzzleElement2List(List<PuzzleElement2> puzzleElement2List) {
        return null;
    }

    public int getIntegerRepresentationForSudokuElementsSize1(SudokuElementSize1 element) {
        switch (element) {
            case ELEMENT_0:
                return 0;
            case ELEMENT_1:
                return 1;
            default:
                return 0;
        }
    }

    public List<PuzzleElement1> getPuzzleElement1List(List<PuzzleElementN> puzzleSegmentationN) {
        List<PuzzleElement1> puzzleSegmentation1 = new ArrayList<PuzzleElement1>();
        for (PuzzleElementN ithPuzzleElementN: puzzleSegmentationN) {
            int rowIndex = ithPuzzleElementN.getRow_index();
            int columnIndex = ithPuzzleElementN.getColumn_index();
            SudokuElementSizeN ithPuzzleElementNEnum = ithPuzzleElementN.getIjPuzzleElement();
            SudokuElementSize1 ithPuzzleElement1Enum = puzzleElementMapperService.getSudokuElementSize1ForSudokuElementSizeN(ithPuzzleElementNEnum);
            PuzzleElement1 ithPuzzleElement1 = new PuzzleElement1();
            ithPuzzleElement1.setRow_index(rowIndex);
            ithPuzzleElement1.setColumn_index(columnIndex);
            ithPuzzleElement1.setIjPuzzleElement(ithPuzzleElement1Enum);
            puzzleSegmentation1.add(ithPuzzleElement1);
        }
        return puzzleSegmentation1;
    }
    
    public byte[] generatePuzzleHashFromPuzzleElement1List(List<PuzzleElement1> puzzleElement1List) {
        return null;
    }

    public byte[] generatePositionHashFromPuzzleElement1List(List<PuzzleElement1> puzzleElement1List) {
        return null;
    }

    public byte[] generateHoleHashFromPuzzleElement1List(List<PuzzleElement1> puzzleElement1List) {
        return null;
    }

    public byte[] generatePuzzleDataFromPuzzleElement1List(List<PuzzleElement1> puzzleElement1List) {
        return null;
    }
}
