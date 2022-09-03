#include <iostream>
using namespace std;

class souraArray{
   int total_size;
   int used_size;
   int *ptr;

   public:
      souraArray(int Tsize, int Usize){
         total_size = Tsize;
         used_size = Usize;
         ptr = new int[Tsize]; 
      }

      void setVal(){
         for(int i = 0; i < used_size; i++){
            cout << "Enter value for " << i + 1 << " element" << endl;
            cin >> ptr[i];
         }
      }

      void showVal(){
         for(int i = 0; i < used_size; i++){
            cout << "The value of " << i+1 << " a ZZAelement is " << ptr[i] << endl; 
         }
      }
};

int main(){
   souraArray Marks(20, 4);
   Marks.setVal();
   Marks.showVal();
}