package com.habuma.spitter.service;

import java.util.List;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;
import org.springframework.stereotype.Service;

@Service
public interface SpitterService {
  List<Spittle> getRecentSpittles(int count);
}
