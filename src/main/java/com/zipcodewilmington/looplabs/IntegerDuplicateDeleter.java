package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

//    private Integer[] intArray;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

//    public Stream<Integer> removeDuplicatesExactly (Integer[] intArray, Integer n){
//        return Arrays.stream(intArray)
//                .filter(num -> countDuplicates(intArray) != n);
//    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(num -> countDuplicates(num) < maxNumberOfDuplications).toArray(Integer[]::new);    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array)
                .filter(num -> countDuplicates(num) != exactNumberOfDuplications).toArray(Integer[]::new);
    }

    public Long countDuplicates (Integer num){
        return Arrays.stream(array).filter(n -> n == num).count();
    }

}
