import needed.SortingRequirementsBUBBLE;
import needed.SortingRequirementsINSERTION;
import needed.SortingRequirementsSELECTION;

import java.util.List;

public class Sort_Poole implements SortingRequirementsBUBBLE {
    public <T extends Comparable<T>> T[] bubbleSort(T[] array) {
        for (int numSorted = 0; numSorted < array.length; numSorted++){
            int current = array.length - 1 - numSorted;

            while(current>numSorted) {
                if ((array[current].compareTo(array[current-1])<0)) {
                    T temp = array[current];
                    array[current] = array[current-1];
                    array[current-1] = temp;
                }
                current--;

            }


        }

        return array;
        }


    public <T extends Comparable<T>> List<T> bubbleSort(List<T> list) {
        for (int numSorted = 0; numSorted < list.size; numSorted++){
            int current = list.size()-1-numSorted;

            while(current > numSorted) {
                if ((list.get(current).compareTo(list.get(current-1))<0)) {
                    T temp = list.get(current);
                    list.set(current, list.get(current-1));
                    list.set(current-1, temp);
                }
                current--;

            }


        }

        return list;
    }


    public <T extends Comparable<T>> T[] bubbleSort(T[] array, int numIterations) {
        for (int numSorted = 0; numSorted < numIterations; numSorted++){
            int current = array.length - 1 - numSorted;

            while(current>numSorted) {
                if ((array[current].compareTo(array[current-1])<0)) {
                    T temp = array[current];
                    array[current] = array[current-1];
                    array[current-1] = temp;
                }
                current--;

            }


        }

        return array;
    }


    public <T extends Comparable<T>> List<T> bubbleSort(List<T> list, int numIterations) {
        for (int numSorted = 0; numSorted < numIterations; numSorted++){
            int current = list.size()-1-numSorted;

            while(current > numSorted) {
                if ((list.get(current).compareTo(list.get(current-1))<0)) {
                    T temp = list.get(current);
                    list.set(current, list.get(current-1));
                    list.set(current-1, temp);
                }
                current--;

            }


        }

        return list;
    }



    public <T extends Comparable<T>> T[] selectionSort(T[] array) {
        for (int numSorted = 1; numSorted < numIterations; numSorted++){
            int current = numSorted;
            int previous = current - 1;

            while(current>0) {
                if (list.get(current).compareTo(list.get(previous))<0){
                    T temp = list.get(current);
                    list.set(current, list.get(previous));
                    list.set(previous, temp);
                    current--;
                    previous--;
                }
                else{
                    break;
                }
            }


        }

        return list;
    }



    public <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        for (int numSorted = 1; numSorted < numIterations; numSorted++){
            int current = numSorted;
            int previous = current - 1;

            while(current>0) {
                if (list.get(current).compareTo(list.get(previous))<0){
                    T temp = list.get(current);
                    list.set(current, list.get(previous));
                    list.set(previous, temp);
                    current--;
                    previous--;
                }
                else{
                    break;
                }
            }


        }

        return list;
    }



    public <T extends Comparable<T>> T[] selectionSort(T[] array, int numIterations) {
        for (int numSorted = 1; numSorted < numIterations; numSorted++){
            int current = numSorted;
            int previous = current - 1;

            while(current>0) {
                if (list.get(current).compareTo(list.get(previous))<0){
                    T temp = list.get(current);
                    list.set(current, list.get(previous));
                    list.set(previous, temp);
                    current--;
                    previous--;
                }
                else{
                    break;
                }
            }


        }

        return list;
    }




    public <T extends Comparable<T>> T[] insertionSort(T[] array) {
        for ( int numSorted = 1; numSorted < array.length; i++){
            int current = numSorted;
            int previous = current - 1;

            while(current>0) {
                if (array[current].compareTo(array[previous])>0){
                    T temp = array[current];
                    array[current] = array[previous];
                    array[previous] = temp;
                    current--;
                    previous--;

                }
                else {
                    break;
                }
            }

        }
      return array;
    }
//insertion sort on a list
    public <T extends Comparable<T>> List<T> insertionSort(List<T> list) {
        for (int numSorted = 1; numSorted < list.size(); numSorted++){
            int current = numSorted;
            int previous = current - 1;

            while(current>0) {
                if (list.get(current).compareTo(list.get(previous))<0){
                    T temp = list.get(current);
                   list.set(current, list.get(previous));
                   list.set(previous, temp);
                   current--;
                   previous--;
                }
                else{
                    break;
                }
            }


        }
        return list;
    }
//insertion sort on an array with finite iterations
    public <T extends Comparable<T>> T[] insertionSort(T[] array, int numIterations) {
        for ( int numSorted = 1; numSorted < numIterations; i++){
            int current = numSorted;
            int previous = current - 1;

            while(current>0) {
                if (array[current].compareTo(array[previous])>0){
                    T temp = array[current];
                    array[current] = array[previous];
                    array[previous] = temp;
                    current--;
                    previous--;

                }
                else {
                    break;
                }
            }

        }
        return array;
    }
//insertion sort on a list with finite iterations
    public <T extends Comparable<T>> List<T> insertionSort(List<T> list, int numIterations) {
        for (int numSorted = 1; numSorted < numIterations; numSorted++){
            int current = numSorted;
            int previous = current - 1;

            while(current>0) {
                if (list.get(current).compareTo(list.get(previous))<0){
                    T temp = list.get(current);
                    list.set(current, list.get(previous));
                    list.set(previous, temp);
                    current--;
                    previous--;
                }
                else{
                    break;
                }
            }


        }
        return list;
    }

    public <T extends Comparable<T>> List<T> selectionSort(List<T> list, int numIterations) {
        for (int numSorted = 1; numSorted < numIterations; numSorted++) {
            int current = numSorted;
            int previous = current - 1;

            while (current > 0) {
                if (list.get(current).compareTo(list.get(previous)) < 0) {
                    T temp = list.get(current);
                    list.set(current, list.get(previous));
                    list.set(previous, temp);
                    current--;
                    previous--;
                } else {
                    break;
                }
            }


        }

        return list;
    }



