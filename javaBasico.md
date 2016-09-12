jdk
	java develoment kit
jre
	maquina virutal para java
ide
	eclipse

sintis dejava es bastante rigurosa
como mejorar el rendiminto
	garbage colector

compilado 
	bycode
	genera un archivo
interpretado
	linea por linea
.class
	es como se empaquetan 

hola mundo en java
	basado en 
		c y c++
menos codigo
	poo reutilizacion
mejor codigo
	buenas practicas de codificacion
mayor rapidez
	c++
Java
	simple
	orinetado a objetos
	distribuido
	multihilo
	arquitectura neutral
	portable
	alto desempeño
	seguro
la maquina virtual de java no ne
un leguje interpretado necesita el codigo como tal

Write Once
	Run Anywere

Java ee
	java entreprese edition
Java Standard Edition

jdk
	java development kit
jre
	java runtime enviroment
		java api class
		java virtual machine
	operatin system
		windows linux etc
javac
nombre de la clase teien que ser el mismo que el del archivo	
public class HolaMundo{ 
	public static void main(String[] args){
		System.out.println("Hola MUndo :)");

}

Java Soruces->java compiler (javac) -> byte code -> jvm java

Fases de programacin
Editar
	Escribir codigo fuente
Compilacion
	Compilar
	cargar
	verificar
Interpretar
	ejecucion

Main 
	palabra reservada 
	metod que es el punto de entrada de una palaicacion java
	analogia como el cerebro de nuestro curso

STATIC
	acepta 0 o mas string

Eclipse
	IDE(Entrono de desarrollo integrado)
	viene como pilador, depurador
show view
	para poder ver las pantallas q deseemos
debugger es ocn el bicho
	
como nombrar un package
	es con el nombre alreves
		com.hanmiltonberrezueta
	ctrl+barraespc (para mostrar la ayuda)
tipos de datos de java
	espaicio de memira que se almacena un contenido
	tipo primitivo
		enteros	
			byte -128-127
			int
			short
			long
	/**
		para java docs
	*/

metodo podria devolver un valor
funcino debe devolver un valor

final para que una varible se  constante

-------variables
float
double

tipo texto
	char no va con doble comilla
	 comilla simple
	boolean
		true
		false

Nombres en Java
	es sensible al so de mayusculas y minusculas
	debe comnezar siempre ocn un letra
	$ _ parte del nombre de la variable

Clases
	Upper Camel Case
Constantes 
	se escriben en mayusculas	
	cuadno tine mas de dos palabras teine un _ en le medio

Cast
	es una operacin en java
	da como resultado una variable oc un tipo de datos diferente
	Puede usarse entre tipos de datos primitivos, instancias de un clase y tipos de objetos primitivos

cast valor mas grande a pequeño
	int i = (int) d;

arrays
	los arreglos se pueden definir ocmo objetos en los que podemo guardar mas de una variable
	mas de un dato en una variable
	en pluras

	tipo_dato[] nombre_variable;
	tipo_dedato nombre_variable[];

	ejemplo
		int[] conjuntoEnteros;
	definir tamaños
		con new se crean objetos

	conjutnoEnteros = new int[3]

	//en una sola linea
		double[] conjuntoDecimal = new double [3];

Operadores aritmeticos
	+ agregar o concatenar 2 cadenas
		Unioin de elemenots

Operadores de asignacion
	= igualdad
	+= añadir cuadno se intere
	-= se resta cuando se intera
	/= se divide cuando se intere
	*= se multiplica cunado se interne
prefijo 
es x+1 = X
posfiijo
	x = x+1;

foreach
	for( int j : conjuntoEnteros){
		//va de elemento en elmento y lo asiga a la variable q recorre en este caso j

Fijar escenario del problema
	trata de simularlo con objetos

Indentificar objetos
	fisicos o conceptuales
	objetos tienen atributos
	cuenta de un cliente (conceptual)

	Los nombres de los objetos por lo general son sustantivvos
		cuenta 
		cliente
	Los ametodos 

		verbos
}

coleccines pueden correr dinamicamente

http://www.codexion.com/tutorialesjava/java/
	leer documentacion para java

ArrayList<>
	no es un arreglo 
	es una coleccion
	crecen cantidad de elmentos dinamicamente
	no permite guardar elementos primtivos
	solamente colecciones de objetos

buffer reader vs scanner
	todas varian en la fomra q queres recibir los datos
	flujo de byte almacenado en un buffer
String
	objetos 
		funcionan como si fueran apuntadores
	preguntanto si el objeto esta aputnando a lal misma localidad de memoria por losobjetos son aputandores 
equals
	permite comparar el contenido de un objeto

memoria ram

garbage colector
	se refiere mas en la memoria
	observa que objetos estan apuntando a una localidad de memoria
	objeto a punto a uan localidad y despeus y ano apunta

uml
	universal model lenguaje
	pudas modela run objeto transportarlo a un clase

comparacin entre un int y un integer

declaracion de metodos
	mod.acceso
	valor de regreso
	nombre 
	argumentos
metodo constructor
	tinene l emismo nombre d ela misma clases que lo nicializa
	metodo nos ayuda a construir el bojeto
	instacia objetos
	usa cero o mas argumetnos
	no regresa valor
Getters y Setters
	un conjunto de metodos se crean por lo general en una clase para lleer/escribir especifcamente los valores de las varaibles miembro
	Getters para obtener los valores
	Setters cambiar los valaores de las variables
modificador de acceso
	public 
		all access
	protected
		Accesible en subclases, en  clases que residen en el mismo paqeute y n el a clase en donde esta definido
	private
		Accesible solo en la clases en donde esta definido
	default
		Accesible por clases que residen en el mismo paquete y en la clase que en donde esta definido
Lista es un tipo de dato 
	no deriva de un clase
	deriva de una interface
	puede elemntos duplicados
	lista son dinamicos
	arrayList y Vector
	almacena elementos por medio de un indice
	extiende de la interface collectino
	get,set,add