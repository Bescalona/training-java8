package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapApp {
	
	private Map<Integer, String>map;
	
	public void poblar() {
		map=new HashMap<>();
		map.put(1, "Bastian");
		map.put(2, "Alonso");
		map.put(3, "Pablo");
		map.put(4, "Cony");
	}
	
	public void imprimir_java7() {
		for (Entry<Integer,String> e : map.entrySet()) {
			System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
		}
	}
	
	public void imprimir_java8() {
		//map.forEach((k,v)->System.out.println("Llave: " + k + " Valor: " + v));
		map.entrySet().stream().forEach(System.out::println);
	}
	
	public void recolectar() {
		Map<Integer, String> mapaRecolectado = map.entrySet().stream()
				.filter(e->e.getValue().contains("o"))
				.collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
		mapaRecolectado.forEach((k,v)->System.out.println("Llave: " + k + " Valor: " + v));
	}
	
	public void insertarSiAusente() {
		map.putIfAbsent(6, "Terry");
		map.putIfAbsent(1, "No se sobrescribe");
	}
	
	public void operarSiPresente() {
		map.computeIfPresent(1, (k,v)->"key: "+k +" value: "+ v);
		System.out.println(map.get(1));
	}
	
	public void obtenerOrPredeterminado() {
		String valor=map.getOrDefault(5, "valor por defecto");
		System.out.println(valor);
	}
	
	
	public static void main(String[] args) {
		MapApp app = new MapApp();
		
		app.poblar();
		//app.imprimir_java7();
		//app.insertarSiAusente();
		//app.imprimir_java8();
		//app.operarSiPresente();
		//app.obtenerOrPredeterminado();
		app.recolectar();
	}

}
