package lukasz.mojpakiet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDataProvider implements DataProvider {

    @Override
    public String getData()
    {
        try {
            return new String(Files.readAllBytes(Paths.get("src/data.txt")));
        } catch (IOException e)
        {
            System.out.println("Blad " + e);
        }
        return "Bledne dane";
    }
}
