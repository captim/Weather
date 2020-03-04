package com.netcracker.weather.model.service.convertor;

import com.netcracker.weather.model.Weather;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
@Service(value = "weatherToDoc")
public class WeatherToDoc {
    private final static Logger logger = Logger.getLogger(WeatherToDoc.class);
    public byte[] writeWeatherToDocByTemplate(File template, Weather weather) {
        logger.debug("Weather is converting to doc");
        XWPFDocument document = null;
        try {
            document = new XWPFDocument(OPCPackage.open(template));
        } catch (IOException | InvalidFormatException e) {
            logger.warn(e.getMessage());
            return null;
        }
        for (XWPFParagraph paragraph : document.getParagraphs()) {
            for (XWPFRun run : paragraph.getRuns()) {
                String text = run.getText(0);
                text = text.replace("API", weather.getApiId());
                text = text.replace("TEMPERATURE", Double.valueOf(weather.getTemperature()).toString());
                text = text.replace("WEATHERDESCRIPTION", weather.getWeatherDescription());
                text = text.replace("WINDSPEED", Double.valueOf(weather.getWindSpeed()).toString());
                text = text.replace("WINDDIGREE", Double.valueOf(weather.getWindDegree()).toString());
                text = text.replace("CLOUDCOVER", Double.valueOf(weather.getCloudCover()).toString());
                run.setText(text,0);
            }
        }
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            document.write(stream);
        } catch (IOException e) {
            logger.warn(e.getMessage());
            return null;
        }
        return stream.toByteArray();
    }
}
