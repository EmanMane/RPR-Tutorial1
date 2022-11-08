# RPR-Tutorial1
Tutorial 1 - Course name: "Development of software solutions" 


Univerzitet u Sarajevu
Elektrotehnički fakultet Sarajevo
Predmet: Razvoj programskih rješenja 2022/2023

Tutorijal 1

Zadatak 1
Bez korištenja okruženja IntelliJ IDEA, kreirati Java program koji omogućuje unos dva cijela broja i njihov ispis na ekran. Pokrenuti iz komandne linije.

Zadatak 2
Koristeći IntelliJ IDEA napraviti projekat pod nazivom "rpr-t1-z2". Napravite program koji na ekranu ispisuje sve brojeve između 1 i n koji su djeljivi sa sumom svojih cifara, pri čemu se n unosi sa tastature. U programu se obavezno treba nalaziti funkcija sumaCifara. Po završetku zadatak treba postaviti na GitHub koristeći isključivo funkcionalnosti IntelliJ IDEA okruženja!
Nakon toga, potrebno je da uradite konverziju tog projekta u Maven projekat i da pokrenete iz Command Prompt-a. 

Zadatak 3
Sljedeći primjer koda sa predmeta Tehnike programiranja (program u programskom jeziku C++) prebaciti u programski jezik Java (projekat "rpr-t1-z3"). Pri tome se držati pravila organizacije koda i imenovanja za Javu koja su obrađena na predavanjima. Po završetku zadatak treba postaviti na GitHub.

#include \<iostream\>

using namespace std;

class Sat {
	int sati,minute,sekunde;
public:
	Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
	void Postavi(int sati, int minute, int sekunde) { Sat::sati=sati; Sat::minute=minute; Sat::sekunde=sekunde; }
	void Sljedeci() {
		sekunde++;
		if (sekunde==60) { sekunde=0; minute++; }
		if (minute==60) { minute=0; sati++; }
		if (sati==24) sati=0;
		}
	void Prethodni() {
		sekunde--;
		if (sekunde==-1) { sekunde=59; minute--; }
		if (minute==-1) { minute=59; sati--; }
		if (sati==-1) sati=23;
	}
	void PomjeriZa(int pomak) {
		if (pomak>0) for (int i(0); i<pomak; i++) Sljedeci();
		else for (int i(0); i<-pomak; i++) Prethodni();
	}
	int DajSate() const { return sati; }
	int DajMinute() const { return minute; }
	int DajSekunde() const { return sekunde; }
	void Ispisi() const { cout<<sati<<":"<<minute<<":"<<sekunde<<endl; }
	};

int main() {
	Sat s(15,30,45);
	s.Ispisi();
	s.Sljedeci();
	s.Ispisi();
	s.PomjeriZa(-48);
	s.Ispisi();
	s.Postavi(0,0,0);
	s.Ispisi();
	return 0;
	}
