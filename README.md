# RPR-Tutorial1
Tutorial 1 on course "Development of software solutions" 

University of Sarajevo Faculty of Electrical Engineering Sarajevo Subject: Development of software solutions 2022/2023

Tutorial 1

Task 1 Without using the IntelliJ IDEA environment, create a Java program that allows entering two integers and printing them on the screen. Run from the command line.

Task 2 Using IntelliJ IDEA, create a project named "rpr-t1-z2". Create a program that prints on the screen all numbers between 1 and n that are divisible by the sum of their digits, where n is entered from the keyboard. The program must include the function sumDigits. Upon completion, the task should be uploaded to GitHub using only the functionality of the IntelliJ IDEA environment! After that, you need to convert that project to a Maven project and run it from the Command Prompt.

Task 3 Transfer the following code example from the subject of Programming Techniques (a program in the C++ programming language) to the Java programming language (project "rpr-t1-z3"). In doing so, adhere to the code organization and naming rules for Java that were covered in the lectures. After completion, the task should be uploaded to GitHub.

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
