package ru.don1x.advancedchatutility.ai;

import java.util.HashSet;

public abstract class AbstractAIModel {
   public HashSet<String> badWords = new HashSet<>();
   public final ModelFile modelFile;

   public AbstractAIModel(ModelFile modelFile)
   {
      this.modelFile = modelFile;
   }

   public abstract void loadModel();
}
