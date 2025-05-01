package ru.don1x.advancedchatutility.ai.models;

import ru.don1x.advancedchatutility.ai.AbstractAIModel;
import ru.don1x.advancedchatutility.ai.BadWordsGroup;
import ru.don1x.advancedchatutility.ai.ModelFile;

import java.util.Arrays;
import java.util.HashSet;

public final class MetaV1 extends AbstractAIModel {
   public MetaV1(ModelFile modelFile) {
      super(modelFile);
   }

   @Override
   public void loadModel() {
      this.badWordsGroups.addAll(
          Arrays.asList(
              new BadWordsGroup("insulting_relatives",
                  new HashSet<>(Arrays.asList(
                      "мамашлюха", "папуебал", "бабкуубей", "ебалмаму", "",
                      ""
                  ))),
              new BadWordsGroup("insulting_relatives",
                  new HashSet<>(Arrays.asList(
                      ""
                  )))
          )
      );
   }
}
