package lukasz.mojpakiet;

public class MojaKlasaWPakiecie
{
    public static void main(String[] args)
    {

        // Deklaracja data providera - interfejsu
        DataProvider dataProv= new SimpleDataProvider();

        // Deklaracja obiektow ktore korzystaja z interfejsu
        DataPresenter dataPres = new DataPresenter();
        FileDataProvider dataFile = new FileDataProvider();

        dataPres.showData(dataProv);
        dataPres.showData(dataFile);

        DataProvider dataProviders [] = new DataProvider[10];

        dataProviders[0] = new SimpleDataProvider();
        dataProviders[1] = new FileDataProvider();

        System.out.println(dataProviders[0].getData());
        System.out.println(dataProviders[1].getData());




    }




}
