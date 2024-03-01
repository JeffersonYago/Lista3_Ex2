package controller;

public class VezesapareceController {

	public VezesapareceController() {
		super();
	}
	public int Aparece (int num,int numa , int cont) {
	if(num <= 0) {
//quando num é menor ou igual a zero, é feita a interrupção da chamada para evitar uma divisão por zero
		return cont;
	}else {
		if(num % 10 == numa) {
			cont++;
		}
		return Aparece(num / 10, numa, cont);
//se o resto de num dividido por 10 for igual ao segundo numero(numa), é adicionado mais 1 ao contador(cont) e num é dividido por 10 para a próxima chamada
	}
}
}
