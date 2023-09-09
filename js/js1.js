//1	Write a program to test if an array contains a specific value  


let no=parseInt(prompt("enter size of array"));
const arr1=[];
for(let i=0; i<no; i++){
        arr1[i] = parseInt(prompt(i));
    }
    for(let i=0; i<no; i++){
        console.log(arr1[i]);
    }
    let search=parseInt(prompt("enter no for search"));
    let f=0;
    for(let i=0; i<no; i++){
        if(search==arr1[i]){   
            f++;
              console.log("found "+search+" at index "+i);
            break;
        }
    }
    if(f==0){
            console.log("no not found");
    }