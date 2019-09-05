package com.matheuswendel.imagens.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;

@RestController
@RequestMapping("/Gdrive")
public class GDriveImagensController {

	private static final String APPLICATION_NAME = "Google Drive API Java Quickstart";

	private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

	// Directory to store user credentials for this application.
	private static final java.io.File CREDENTIALS_FOLDER 
			= new java.io.File(System.getProperty("user.home"), "credentials");

	private static final String CLIENT_SECRET_FILE_NAME = "client_secret.json";

	//
	// Global instance of the scopes required by this quickstart. If modifying these
	// scopes, delete your previously saved credentials/ folder.
	//
	private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE);
	
	@RequestMapping("/")
	private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {

		java.io.File clientSecretFilePath = new java.io.File(CREDENTIALS_FOLDER, CLIENT_SECRET_FILE_NAME);

		if (!clientSecretFilePath.exists()) {
			throw new FileNotFoundException("Please copy " + CLIENT_SECRET_FILE_NAME //
					+ " to folder: " + CREDENTIALS_FOLDER.getAbsolutePath());
		}

		// Load client secrets.
		InputStream in = new FileInputStream(clientSecretFilePath);

		GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

		// Build flow and trigger user authorization request.
		GoogleAuthorizationCodeFlow flowGoogleCredential credential = new GoogleCredential().setAccessToken(accessToken);
		Plus plus = new Plus.builder(new NetHttpTransport(),
                JacksonFactory.getDefaultInstance(),
                credential)
.setApplicationName("Google-PlusSample/1.0")
.build(); = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY,
				clientSecrets, SCOPES).setDataStoreFactory(new FileDataStoreFactory(CREDENTIALS_FOLDER))
						.setAccessType("offline").build();

		return new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
	}

	@RequestMapping("/img")
	public String mostrarImagens() throws IOException, GeneralSecurityException {

		System.out.println("CREDENTIALS_FOLDER: " + CREDENTIALS_FOLDER.getAbsolutePath());


		// 1: Create CREDENTIALS_FOLDER
//		if (!CREDENTIALS_FOLDER.exists()) {
//			CREDENTIALS_FOLDER.mkdirs();
//
//			System.out.println("Created Folder: " + CREDENTIALS_FOLDER.getAbsolutePath());
//			System.out.println("Copy file " + CLIENT_SECRET_FILE_NAME + " into folder above.. and rerun this class!!");
//			return;
//		}

		// 2: Build a new authorized API client service.
		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();

		// 3: Read client_secret.json file & create Credential object.
//		Credential credential = getCredentials(HTTP_TRANSPORT);
		GoogleCredential credential = new GoogleCredential().setAccessToken(accessToken);
		Plus plus = new Plus.builder(new NetHttpTransport(),
		                             JacksonFactory.getDefaultInstance(),
		                             credential)
		    .setApplicationName("Google-PlusSample/1.0")
		    .build();
		// 5: Create Google Drive Service.
		Drive service = new Drive.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential) //
				.setApplicationName(APPLICATION_NAME).build();

		// Print the names and IDs for up to 10 files.
		FileList result = service.files().list().setPageSize(10).setFields("nextPageToken, files(id, name)").execute();
		List<File> files = result.getFiles();
		List<String> idImagensjpg = new ArrayList();
		String teste = "";

		System.out.println(JSON_FACTORY);
		System.out.println(SCOPES);
		if (files == null || files.isEmpty()) {
			System.out.println("No files found.");
		} else {
			System.out.println("Files: ");

			for (File file : files) {
				// imprime no console os nomes e ID's dos arquivos
				// System.out.printf("%s (%s)\n", file.getName(), file.getId());

				// Verifica se os 4 ultimos caracteres do nome da imagem sao iguais a ".jpg",
				// dessa forma garante que o arquivo eh uma imagem
				// TODO metodo que aceita qualquer formato de imagem
				if (file.getName().substring(file.getName().length() - 4).equals(".jpg"))
					// adiciona um link + o id do arquivo a lista idimagensjpg
					// o link que precede o id do arquivo serve para o embedded no HTML
					// ultilidade apenas para testes
					// TODO melhorar forma de retorno

					teste += ("<img alt=\"\" src=\"https://docs.google.com/uc?id=" + file.getId() + "\"/><br>");
				// "<img alt=\"\" src=\"https://drive.google.com/file/d/"+file.getId() +
				// "/preview"\"/><br>"

			}
		}

		return teste;
	}
}
