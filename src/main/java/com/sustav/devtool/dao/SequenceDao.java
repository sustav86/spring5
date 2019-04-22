package com.sustav.devtool.dao;

import com.sustav.devtool.entity.Sequence;

public interface SequenceDao {

    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
}
