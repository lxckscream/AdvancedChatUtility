package ru.don1x.advancedchatutility.ai;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public final class ModelFile {
   public final File FILE;
   public FileConfiguration CONFIG;

   public ModelFile(File FILE)
   {
      this.FILE = FILE;
      this.CONFIG =YamlConfiguration.loadConfiguration(this.FILE);
   }

   public void save()
   {
      try {
         this.CONFIG.save(this.FILE);
      } catch(IOException e) {
         throw new RuntimeException(e);
      }
   }
}
