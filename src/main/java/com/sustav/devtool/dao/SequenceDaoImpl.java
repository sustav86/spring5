package com.sustav.devtool.dao;

import com.sustav.devtool.entity.Sequence;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class SequenceDaoImpl implements SequenceDao {
    private final Map<String, Sequence> sequences = new HashMap<>();
    private final Map<String, AtomicInteger> values = new HashMap<>();

    public SequenceDaoImpl() {
        sequences.put("IT", new Sequence("1", "A", "T"));
        values.put("IT", new AtomicInteger());
    }

    @Override
    public Sequence getSequence(String sequenceId) {
        return sequences.get("IT");
    }

    @Override
    public int getNextValue(String sequenceId) {
        return values.get(sequenceId).getAndIncrement();
    }
}
