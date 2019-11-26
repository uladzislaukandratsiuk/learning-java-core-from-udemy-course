package com.challenge.interfaces;

import java.util.List;

public interface Saveable {

   List<String> saveValues();

   void showValues(List<String> savedValues);
}
