package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class JsonReader {

    @DataProvider(name = "headerData")
    public Object[][] getUserData() throws IOException {
        String filePath = "src/test/java/testData/headerData.json";
        List<HeaderData> headerDataList = readTestDataFromJson(filePath);

        Object[][] data = new Object[headerDataList.size()][1];
        for (int i = 0; i < headerDataList.size(); i++) {
            data[i][0] = headerDataList.get(i);
        }

        return data;
    }

    private List<HeaderData> readTestDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<HeaderData>>() {
            });
        }
    }

    @DataProvider(name = "headerLanguageData")
    public Object[][] getLanguageUserData() throws IOException {
        String filePath = "src/test/java/testData/headerLanguageData.json";
        List<HeaderLanguageData> headerLanguageData = readLanguageTestDataFromJson(filePath);

        Object[][] data = new Object[headerLanguageData.size()][1];
        for (int i = 0; i < headerLanguageData.size(); i++) {
            data[i][0] = headerLanguageData.get(i);
        }

        return data;
    }

    private List<HeaderLanguageData> readLanguageTestDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<HeaderLanguageData>>() {
            });
        }
    }

    @DataProvider(name = "projectsData")
    public Object[][] getProjectsData() throws IOException {
        String filePath = "src/test/java/testData/projectsData.json";
        List<ProjectsData> projectsData = readProjectDataFromJson(filePath);

        Object[][] data = new Object[projectsData.size()][1];
        for (int i = 0; i < projectsData.size(); i++) {
            data[i][0] = projectsData.get(i);
        }

        return data;
    }

    private List<ProjectsData> readProjectDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<ProjectsData>>() {
            });
        }
    }

    @DataProvider(name = "footerData")
    public Object[][] getFooterData() throws IOException {
        String filePath = "src/test/java/testData/footerData.json";
        List<FooterData> footerData = readFooterDataFromJson(filePath);

        Object[][] data = new Object[footerData.size()][1];
        for (int i = 0; i < footerData.size(); i++) {
            data[i][0] = footerData.get(i);
        }

        return data;
    }

    private List<FooterData> readFooterDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<FooterData>>() {
            });
        }
    }

    @DataProvider(name = "webApplicationsData")
    public Object[][] WebApplicationsData() throws IOException {
        String filePath = "src/test/java/testData/webApplicationsData.json";
        List<WebApplicationsData> webApplicationsData = readWebApplicationsDataFromJson(filePath);

        Object[][] data = new Object[webApplicationsData.size()][1];
        for (int i = 0; i < webApplicationsData.size(); i++) {
            data[i][0] = webApplicationsData.get(i);
        }

        return data;
    }

    private List<WebApplicationsData> readWebApplicationsDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<WebApplicationsData>>() {
            });
        }
    }

    @DataProvider(name = "uxApplicationsData")
    public Object[][] UXApplicationsData() throws IOException {
        String filePath = "src/test/java/testData/uxApplicationsData.json";
        List<UXApplicationsData> uxApplicationsData = readUXApplicationsDataFromJson(filePath);

        Object[][] data = new Object[uxApplicationsData.size()][1];
        for (int i = 0; i < uxApplicationsData.size(); i++) {
            data[i][0] = uxApplicationsData.get(i);
        }

        return data;
    }

    private List<UXApplicationsData> readUXApplicationsDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<UXApplicationsData>>() {
            });
        }
    }

    @DataProvider(name = "footerTestimonialsData")
    public Object[][] getFooterTestimonialsData() throws IOException {
        String filePath = "src/test/java/testData/footerTestimonialsData.json";
        List<FooterTestimonialsData> footerTestimonialsData = readFooterTestimonialsDataFromJson(filePath);

        Object[][] data = new Object[footerTestimonialsData.size()][1];
        for (int i = 0; i < footerTestimonialsData.size(); i++) {
            data[i][0] = footerTestimonialsData.get(i);
        }

        return data;
    }

    private List<FooterTestimonialsData> readFooterTestimonialsDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<FooterTestimonialsData>>() {
            });
        }
    }

    @DataProvider(name = "enContentData")
    public Object[][] getEnContentData() throws IOException {
        String filePath = "src/test/java/testData/enContent.json";
        List<ContentData> ContentData = readContentDataFromJson(filePath);

        Object[][] data = new Object[ContentData.size()][1];
        for (int i = 0; i < ContentData.size(); i++) {
            data[i][0] = ContentData.get(i);
        }

        return data;
    }

    @DataProvider(name = "ruContentData")
    public Object[][] getRuContentData() throws IOException {
        String filePath = "src/test/java/testData/ruContent.json";
        List<ContentData> ContentData = readContentDataFromJson(filePath);

        Object[][] data = new Object[ContentData.size()][1];
        for (int i = 0; i < ContentData.size(); i++) {
            data[i][0] = ContentData.get(i);
        }

        return data;
    }

    @DataProvider(name = "arContentData")
    public Object[][] getArContentData() throws IOException {
        String filePath = "src/test/java/testData/arContent.json";
        List<ContentData> ContentData = readContentDataFromJson(filePath);

        Object[][] data = new Object[ContentData.size()][1];
        for (int i = 0; i < ContentData.size(); i++) {
            data[i][0] = ContentData.get(i);
        }

        return data;
    }

    @DataProvider(name = "plContentData")
    public Object[][] getPlContentData() throws IOException {
        String filePath = "src/test/java/testData/plContent.json";
        List<ContentData> ContentData = readContentDataFromJson(filePath);

        Object[][] data = new Object[ContentData.size()][1];
        for (int i = 0; i < ContentData.size(); i++) {
            data[i][0] = ContentData.get(i);
        }

        return data;
    }

    @DataProvider(name = "deContentData")
    public Object[][] getDeContentData() throws IOException {
        String filePath = "src/test/java/testData/deContent.json";
        List<ContentData> ContentData = readContentDataFromJson(filePath);

        Object[][] data = new Object[ContentData.size()][1];
        for (int i = 0; i < ContentData.size(); i++) {
            data[i][0] = ContentData.get(i);
        }

        return data;
    }


    private List<ContentData> readContentDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<ContentData> enContentDataList = objectMapper.readValue(new File(filePath), objectMapper.getTypeFactory().constructCollectionType(List.class, ContentData.class));
        return enContentDataList;
    }

    @DataProvider(name = "geInTouchData")
    public Object[][] getGetInTouchData() throws IOException {
        String filePath = "src/test/java/testData/getInTouchData.json";
        List<GetInTouchData> getInTouchData = readGetInTouchDataFromJson(filePath);

        Object[][] data = new Object[getInTouchData.size()][1];
        for (int i = 0; i < getInTouchData.size(); i++) {
            data[i][0] = getInTouchData.get(i);
        }

        return data;
    }

    private List<GetInTouchData> readGetInTouchDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<GetInTouchData>>() {
            });
        }
    }

    @DataProvider(name = "geInTouchErrorData")
    public Object[][] getGetInTouchErrorData() throws IOException {
        String filePath = "src/test/java/testData/getInTouchErrorData.json";
        List<GetInTouchErrorData> getInTouchErrorData = readGetInTouchErrorDataFromJson(filePath);

        Object[][] data = new Object[getInTouchErrorData.size()][1];
        for (int i = 0; i < getInTouchErrorData.size(); i++) {
            data[i][0] = getInTouchErrorData.get(i);
        }

        return data;
    }

    private List<GetInTouchErrorData> readGetInTouchErrorDataFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            return objectMapper.readValue(fis, new TypeReference<List<GetInTouchErrorData>>() {
            });
        }
    }



}
