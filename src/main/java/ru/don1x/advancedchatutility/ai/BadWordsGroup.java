package ru.don1x.advancedchatutility.ai;

import java.util.HashSet;
import java.util.List;

public final class BadWordsGroup {
   private final String groupName;
   private final HashSet<String> words;

   public BadWordsGroup(String name)
   {
      this.groupName = name;
      this.words = new HashSet<>();
   }

   public BadWordsGroup(String name, HashSet<String> words)
   {
      this.groupName = name;
      this.words = words;
   }

   public HashSet<String> getWords() {
      return words;
   }

   public String getGroupName() {
      return groupName;
   }
}
