package com.frg0.caviar.toolkits.upload.controler;


import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api/file")
public class FileUploadController {

    @Autowired
    private Environment environment;

    //TODO A changer lors du déploiement
    private String dbURL = "127.0.0.1";
    private Integer dbPort = 27017;
    private String dbName = "caviar";
    private String collection = "caviar";

    public FileUploadController() {
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String fileUpload(@RequestPart("file") MultipartFile multipartFile, @RequestParam("filename") String filename){
//        try {
//            MongoClient mongoClient = new MongoClient(dbURL, dbPort);
//            mongoClient.getDatabase(dbName).getCollection(collection);
//
//            String newFileName = filename;
//            MultipartFile file = multipartFile;
////        } catch (UnknownHostException e) {
////            e.printStackTrace();
//        } catch (MongoException e){
//            e.printStackTrace(); }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        return "";
//    }

//    @RequestMapping(value = "/upload/{file}",method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public ObjectId uploadFile(@RequestPart("file") File file, @RequestParam("filename") String filename){
//        try{
//            MongoClient mongoClient = new MongoClient(dbURL, dbPort);
//            MongoDatabase database = mongoClient.getDatabase(dbName);
//            MongoCollection mongoCollection = database.getCollection(collection);
//            GridFSBucket gridFSBucket = GridFSBuckets.create(database);
//            InputStream inputStream = new FileInputStream(new File(filename));
//        } catch (MongoException e){
//            e.printStackTrace(); }
//        return null;
//    }
}
