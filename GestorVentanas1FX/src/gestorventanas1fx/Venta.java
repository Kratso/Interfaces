/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorventanas1fx;

import javafx.scene.control.Toggle;

/**
 *
 * @author alumno
 */
public class Venta {
	private String localizacion;
	private Toggle procesador;
	private Toggle ram;
	private Toggle monitor;
	private Toggle almacenamiento;
	private boolean otro1;
	private boolean otro2;
	private boolean otro3;
	private boolean otro4;

	

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Venta(String localizacion, Toggle procesador, Toggle ram, Toggle monitor, Toggle almacenamiento, boolean otro1, boolean otro2, boolean otro3, boolean otro4) {
		this.localizacion = localizacion;
		this.procesador = procesador;
		this.ram = ram;
		this.monitor = monitor;
		this.almacenamiento = almacenamiento;
		this.otro1 = otro1;
		this.otro2 = otro2;
		this.otro3 = otro3;
		this.otro4 = otro4;
	}

	public Toggle getProcesador() {
		return procesador;
	}

	public void setProcesador(Toggle procesador) {
		this.procesador = procesador;
	}

	public Toggle getRam() {
		return ram;
	}

	public void setRam(Toggle ram) {
		this.ram = ram;
	}

	public Toggle getMonitor() {
		return monitor;
	}

	public void setMonitor(Toggle monitor) {
		this.monitor = monitor;
	}

	public Toggle getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Toggle almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	

	public boolean isOtro1() {
		return otro1;
	}

	public void setOtro1(boolean otro1) {
		this.otro1 = otro1;
	}

	public boolean isOtro2() {
		return otro2;
	}

	public void setOtro2(boolean otro2) {
		this.otro2 = otro2;
	}

	public boolean isOtro3() {
		return otro3;
	}

	public void setOtro3(boolean otro3) {
		this.otro3 = otro3;
	}

	public boolean isOtro4() {
		return otro4;
	}

	public void setOtro4(boolean otro4) {
		this.otro4 = otro4;
	}
	
}
