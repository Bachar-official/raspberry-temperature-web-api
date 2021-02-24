package ru.bachar.piwebapi.Measure;

class MeasureNotFoundException extends RuntimeException {
    MeasureNotFoundException(Long id) {
        super("Could not find measure number " + id);
    }
}
