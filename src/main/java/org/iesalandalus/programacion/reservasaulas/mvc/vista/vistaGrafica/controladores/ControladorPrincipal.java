package org.iesalandalus.programacion.reservasaulas.mvc.vista.vistaGrafica.controladores;

import java.io.IOException;

import org.iesalandalus.programacion.reservasaulas.mvc.controlador.IControlador;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.vistaGrafica.resources.Dialogos;
import org.iesalandalus.programacion.reservasaulas.mvc.vista.vistaGrafica.resources.LocalizadorRecursos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControladorPrincipal {

	
	
	@FXML private Button BTSalirPrincipal,BTInsertarAula,BTEliminarAula,BTListarAula,BTConsultarDisponibilidad;
	@FXML private Button BTInsertarProfesor,BTEliminarProfesor,BTListarProfesor; 
	@FXML private Button BTRealizarReserva,BTAnularReserva,BTListarReserva,BTListarReservaAula,BTListarReservaProfesor;
	@FXML private MenuItem MICerrar, MISorpresa;
	
	private Stage insertarAulaStage, eliminarAulaStage, listarAulaStage, consultarDisponibilidadStage;
	private Stage insertarProfesorStage, eliminarProfesorStage, listarProfesorStage;
	private Stage realizarReservaStage, anularReservaStage, listarReservaStage, 
	listarReservaAulaStage, listarReservaProfesorStage;
	
	private ControladorInsertarAula controllerInsertarAula;
	private ControladorEliminarAula controllerEliminarAula;
	private ControladorListarAula controllerListarAula;
	private ControladorConsultarDisponibilidad controllerConsultarDisponibilidad;
	private ControladorInsertarProfesor controllerInsertarProfesor;
	private ControladorEliminarProfesor controllerEliminarProfesor;
	private ControladorListarProfesor controllerListarProfesor;
	private ControladorRealizarReserva controllerRealizarReserva;
	private ControladorAnularReserva controllerAnularReserva;
	private ControladorListarReserva controllerListarReserva;
	private ControladorListarReservaAula controllerListarReservaAula;
	private ControladorListarReservaProfesor controllerListarReservaProfesor;

	private IControlador controladorPrincipal;
	
	public void setControladorPrincipal(IControlador controlador) {
		this.controladorPrincipal = controlador;
	}
	
	@FXML
	public void abrirInsertarAula() throws IOException {
		crearVentanaInsertarAula();
		insertarAulaStage.showAndWait();
	}
	
	@FXML 
	public void abrirEliminarAula() throws IOException {
		crearVentanaEliminarAula();
		eliminarAulaStage.showAndWait();
	}
	
	@FXML
	public void abrirListarAula() throws IOException {
		crearVentanaListarAula();
		listarAulaStage.showAndWait();
	}
	
	@FXML
	public void abrirConsultarDisponibilidad() throws IOException {
		crearVentanaConsultarDisponibilidad();
		consultarDisponibilidadStage.showAndWait();
	}
	
	@FXML
	public void abrirInsertarProfesor() throws IOException {
		crearVentanaInsertarProfesor();
		insertarProfesorStage.showAndWait();
	}
	
	@FXML
	public void abrirEliminarProfesor() throws IOException {
		crearVentanaEliminarProfesor();
		eliminarProfesorStage.showAndWait();
	}
	
	@FXML
	public void abrirListarProfesor() throws IOException {
		crearVentanaListarProfesor();
		listarProfesorStage.showAndWait();
	}
	
	@FXML
	public void abrirRealizarReserva() throws IOException {
		crearVentanaRealizarReserva();
		realizarReservaStage.showAndWait();
	}
	
	@FXML
	public void abrirAnularReserva() throws IOException {
		crearVentanaAnularReserva();
		anularReservaStage.showAndWait();
	}
	
	@FXML
	public void abrirListarReserva() throws IOException {
		crearVentanaListarReserva();
		listarReservaStage.showAndWait();
	}
	
	@FXML
	public void abrirListarReservaAula() throws IOException {
		crearVentanaListarReservaAula();
		listarReservaAulaStage.showAndWait();
	}
	
	@FXML
	public void abrirListarReservaProfesor() throws IOException {
		crearVentanaListarReservaProfesor();
		listarReservaProfesorStage.showAndWait();
		
	}
	
	
	@FXML
	private void salir(ActionEvent evento) {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Saliendo del programa.");
		alerta.setContentText("Hasta otra");
		alerta.setHeaderText(null);
		alerta.show();
		((Stage) BTSalirPrincipal.getParent().getScene().getWindow()).close();
	}
	
	@FXML
	private void sorpresa(ActionEvent evento) {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle("Sorpresa!!!");
		alerta.setContentText("No hay ninguna sorpresa");
		alerta.setHeaderText(null);
		alerta.show();
	}
	
	private void crearVentanaInsertarAula() throws IOException {
		if (insertarAulaStage == null) {
			insertarAulaStage = new Stage();
			FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/InsertarAula.fxml"));
			AnchorPane raiz = loader.load();
			controllerInsertarAula = loader.getController();
			controllerInsertarAula.setControladorPrincipal(controladorPrincipal);
			
			Scene scene = new Scene(raiz,500,400);
			insertarAulaStage.setTitle("Insertar aulas");
			insertarAulaStage.initModality(Modality.WINDOW_MODAL);
			insertarAulaStage.setScene(scene);
		} else {
		}
	}
	
	private void crearVentanaEliminarAula() throws IOException {
		if (eliminarAulaStage == null) {
			eliminarAulaStage = new Stage();
			FXMLLoader loader2 = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/EliminarAula.fxml"));
			AnchorPane raiz2 = loader2.load();
			controllerEliminarAula = loader2.getController();
			controllerEliminarAula.setControladorPrincipal(controladorPrincipal);
			
			Scene scene2 = new Scene(raiz2,500,400);
			eliminarAulaStage.setTitle("Eliminar aulas");
			eliminarAulaStage.initModality(Modality.WINDOW_MODAL);
			eliminarAulaStage.setScene(scene2);
		}
	}
	
	private void crearVentanaListarAula() throws IOException {
		if (listarAulaStage == null) {
			listarAulaStage = new Stage();
			FXMLLoader loaderListarAula = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/ListarAula.fxml"));
			AnchorPane raizListar = loaderListarAula.load();
			controllerListarAula = loaderListarAula.getController();
			controllerListarAula.setControladorPrincipal(controladorPrincipal);
			
			Scene sceneListarAula = new Scene(raizListar,500,400);
			listarAulaStage.setTitle("Listar aulas");
			listarAulaStage.initModality(Modality.WINDOW_MODAL);
			listarAulaStage.setScene(sceneListarAula);
		}
	}
	
	private void crearVentanaConsultarDisponibilidad() throws IOException {
		if (consultarDisponibilidadStage == null) {
			consultarDisponibilidadStage = new Stage();
			FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/ConsultarDisponibilidad.fxml"));
			AnchorPane raiz = loader.load();
			controllerConsultarDisponibilidad = loader.getController();
			controllerConsultarDisponibilidad.setControladorPrincipal(controladorPrincipal);
			
			Scene scene = new Scene(raiz,500,400);
			consultarDisponibilidadStage.setTitle("Consultar disponibilidad");
			consultarDisponibilidadStage.initModality(Modality.WINDOW_MODAL);
			consultarDisponibilidadStage.setScene(scene);
		}
	}
	
	private void crearVentanaInsertarProfesor() throws IOException {
		if (insertarProfesorStage == null) {
			insertarProfesorStage = new Stage();
			FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/InsertarProfesor.fxml"));
			AnchorPane raiz = loader.load();
			controllerInsertarProfesor = loader.getController();
			controllerInsertarProfesor.setControladorPrincipal(controladorPrincipal);
			
			Scene scene = new Scene(raiz,500,400);
			insertarProfesorStage.setTitle("Insertar profesor");
			insertarProfesorStage.initModality(Modality.WINDOW_MODAL);
			insertarProfesorStage.setScene(scene);
		}
	}
	
	private void crearVentanaEliminarProfesor() throws IOException {
		if (eliminarProfesorStage == null) {
			eliminarProfesorStage = new Stage();
			FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/EliminarProfesor.fxml"));
			AnchorPane raiz = loader.load();
			controllerEliminarProfesor = loader.getController();
			controllerEliminarProfesor.setControladorPrincipal(controladorPrincipal);
			
			Scene scene = new Scene(raiz,500,400);
			eliminarProfesorStage.setTitle("Eliminar profesor");
			eliminarProfesorStage.initModality(Modality.WINDOW_MODAL);
			eliminarProfesorStage.setScene(scene);
		}
	}
		private void crearVentanaListarProfesor() throws IOException {
			if (listarProfesorStage == null) {
				listarProfesorStage = new Stage();
				FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/ListarProfesor.fxml"));
				AnchorPane raiz = loader.load();
				controllerListarProfesor = loader.getController();
				controllerListarProfesor.setControladorPrincipal(controladorPrincipal);
				//controllerListarProfesor.inicializa();
				
				Scene scene = new Scene(raiz,500,400);
				listarProfesorStage.setTitle("Listar profesor");
				listarProfesorStage.initModality(Modality.WINDOW_MODAL);
				listarProfesorStage.setScene(scene);
			} else {
			}
	}
		private void crearVentanaRealizarReserva() throws IOException {
			if (realizarReservaStage == null) {
				realizarReservaStage = new Stage();
				FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/RealizarReserva.fxml"));
				AnchorPane raiz = loader.load();
				controllerRealizarReserva = loader.getController();
				controllerRealizarReserva.setControladorPrincipal(controladorPrincipal);
				
				Scene scene = new Scene(raiz,500,400);
				realizarReservaStage.setTitle("Realizar reserva");
				realizarReservaStage.initModality(Modality.WINDOW_MODAL);
				realizarReservaStage.setScene(scene);
			}
	}
		private void crearVentanaAnularReserva() throws IOException {
			if (anularReservaStage == null) {
				anularReservaStage = new Stage();
				FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/AnularReserva.fxml"));
				AnchorPane raiz = loader.load();
				controllerAnularReserva = loader.getController();
				controllerAnularReserva.setControladorPrincipal(controladorPrincipal);
				
				Scene scene = new Scene(raiz,500,400);
				anularReservaStage.setTitle("Anular reserva");
				anularReservaStage.initModality(Modality.WINDOW_MODAL);
				anularReservaStage.setScene(scene);
			}
	}
		private void crearVentanaListarReserva() throws IOException {
			if (listarReservaStage == null) {
				listarReservaStage = new Stage();
				FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/ListarReserva.fxml"));
				AnchorPane raiz = loader.load();
				controllerListarReserva = loader.getController();
				controllerListarReserva.setControladorPrincipal(controladorPrincipal);
				
				Scene scene = new Scene(raiz,500,400);
				listarReservaStage.setTitle("Listar reservas");
				listarReservaStage.initModality(Modality.WINDOW_MODAL);
				listarReservaStage.setScene(scene);
			}
	}
		private void crearVentanaListarReservaAula() throws IOException {
			if (listarReservaAulaStage == null) {
				listarReservaAulaStage = new Stage();
				FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/ListarReservaAula.fxml"));
				AnchorPane raiz = loader.load();
				controllerListarReservaAula = loader.getController();
				controllerListarReservaAula.setControladorPrincipal(controladorPrincipal);
				
				Scene scene = new Scene(raiz,500,400);
				listarReservaAulaStage.setTitle("Listar reservas por aula");
				listarReservaAulaStage.initModality(Modality.WINDOW_MODAL);
				listarReservaAulaStage.setScene(scene);
			}
	}
		private void crearVentanaListarReservaProfesor() throws IOException {
			if (listarReservaProfesorStage == null) {
				listarReservaProfesorStage = new Stage();
				FXMLLoader loader = new FXMLLoader(LocalizadorRecursos.class.getResource("vistas/ListarReservaProfesor.fxml"));
				AnchorPane raiz = loader.load();
				controllerListarReservaProfesor = loader.getController();
				controllerListarReservaProfesor.setControladorPrincipal(controladorPrincipal);
				
				Scene scene = new Scene(raiz,500,400);
				listarReservaProfesorStage.setTitle("Listar reservas por profesor");
				listarReservaProfesorStage.initModality(Modality.WINDOW_MODAL);
				listarReservaProfesorStage.setScene(scene);
			}
	}
	}