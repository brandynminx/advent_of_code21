#include <iostream>
#include <fstream>
#include <string>
#include <stack>
using namespace std;
int main() 
{
    std::string seaMes;
    int origin = 0; //Variable to hold string to int
    int final = 0; //Variable to hold comparable int
    int count = 0; //variable to hold the count
    std::ifstream myfile ("day1.txt");

    if(myfile.is_open()){ //Checking if file is open
        while( myfile ){//Reads until the end of the file
            myfile >> seaMes; //piping file contents into string
            origin = std::stoi(seaMes); //Converts string to int

            if(final != 0 && origin > final){ //If final is not equal to 0 and origin is greater than final
                count = count + 1;
            } else if (final != 0 && origin < final){ //Not increasing
                count = count;
            } else { //First run
                count = count;
            }

            final = origin;
            //std:: cout << seaMes + "\n"; //piping steam into stand. output
        } //end of while
    } //end of first if
    std:: cout << count; //Part 1

    int origin2 = 0;
    std::string seaMes2;
    stack<int> mystack;
    std::ifstream myfile2 ("day1.txt");
    if(myfile2.is_open()){ //Checking if file is open
        while( myfile2 ){//Reads until the end of the file
            int i = 0;
            myfile >> seaMes2; //piping file contents into string
            origin2 = std::stoi(seaMes2); //Converts string to int
            mystack.push(origin2);
            ++i;
        } //end of while
    } //end of first if

    while (!mystack.empty()) {
        cout << ' ' << mystack.top();
        mystack.pop();
    }
}