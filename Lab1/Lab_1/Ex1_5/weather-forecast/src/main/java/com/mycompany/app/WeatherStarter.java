package com.mycompany.app;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.HashMap;
import java.util.Map;

public class WeatherStarter {

    private static final String BASE_URL = "http://api.ipma.pt/open-data/";

    public static void main(String[] args) {
        // Crie um mapa com códigos de cidade e nomes de cidade
        Map<Integer, String> cities = new HashMap<>();
        cities.put(1010500, "Aveiro");
        cities.put(1020500, "Beja");
        cities.put(1030300, "Braga");
        // Adicione mais cidades conforme necessário

        // Crie uma instância Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Crie um serviço para a API
        IpmaService service = retrofit.create(IpmaService.class);

        // Itere sobre as cidades e faça a consulta para cada uma delas
        for (Map.Entry<Integer, String> entry : cities.entrySet()) {
            int cityId = entry.getKey();
            String cityName = entry.getValue();

            // Prepare a chamada para o endpoint remoto
            Call<IpmaCityForecast> callSync = service.getForecastForACity(cityId);

            try {
                Response<IpmaCityForecast> apiResponse = callSync.execute();
                IpmaCityForecast forecast = apiResponse.body();

                // Verifique se a resposta não é nula e se há dados de previsão disponíveis
                if (forecast != null && !forecast.getData().isEmpty()) {
                    System.out.println("Cidade: " + cityName);

                    for (CityForecast cityForecast : forecast.getData()) {
                        System.out.println("-------------------------");
                        System.out.println("Data: " + cityForecast.getForecastDate());
                        System.out.println("Temperatura Máxima: " + cityForecast.getTMax() + "°C");
                        System.out.println("Temperatura Mínima: " + cityForecast.getTMin() + "°C");
                        System.out.println("Descrição do Tempo: " + cityForecast.getPrecipitaProb() + "% de probabilidade de precipitação");
                        // Adicione mais informações da previsão aqui, conforme necessário
                    }
                } else {
                    System.out.println("Nenhum resultado encontrado para a cidade: " + cityName);
                }

                // Pausa a execução por 1 segundo antes de passar para a próxima cidade
                Thread.sleep(1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
