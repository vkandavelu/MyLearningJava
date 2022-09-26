//package json_xml_comparison;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.lang.reflect.Field;
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Enumeration;
//import java.util.List;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipFile;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.databind.MappingIterator;
//import com.fasterxml.jackson.dataformat.csv.CsvMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvSchema;
//
//public class ReadCsvFiles {
//
//    public static <T> T convertCSV2JSON(String migrationFileName, Class<?> className) throws IOException {
//        List<?> listValues = new ArrayList<>();
//        String path = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "extractFiles" + File.separator;
//        File directory = new File(path);
//        File[] fList = directory.listFiles();
//        assert fList != null;
//        for (File file : fList) {
//            if (file.toString().endsWith(".zip")) {
//                try (ZipFile zipFile = new ZipFile(file)) {
//                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
//
//                    while (entries.hasMoreElements()) {
//                        ZipEntry zipEntry = entries.nextElement();
//                        if (zipEntry.toString().endsWith(migrationFileName + ".csv")) {
//                            InputStream inputStream = zipFile.getInputStream(zipEntry);
//                            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//                            CsvSchema csvSchema = CsvSchema.emptySchema().withHeader();
//                            CsvMapper csvMapper = new CsvMapper();
//                            MappingIterator<?> mappingIterator = csvMapper.reader().forType(className).with(csvSchema).readValues(inputStreamReader);
//                            listValues = mappingIterator.readAll();
//                            inputStreamReader.close();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        List<String> serviceMarkers = getJsonPropertyField(className);
//        serviceMarkers.add(0, "Record Found");
//      //  migration.getScenarioContext().getHeaderMap().put(migrationFileName, serviceMarkers);
//        return (T) listValues;
//    }
//
//    public static List<String> getJsonPropertyField( Class<?>  object) {
//        if (object == null) {
//            return Collections.emptyList();
//        }
//        List<String> jsonPropertyValue = new ArrayList<>();
//      //  Field[] fields = FieldUtils.getAllFields(object);
//        for (Field field : fields) {
//            jsonPropertyValue.add(field.getDeclaredAnnotation(JsonProperty.class).value());
//        }
//        return jsonPropertyValue;
//    }
//
//}