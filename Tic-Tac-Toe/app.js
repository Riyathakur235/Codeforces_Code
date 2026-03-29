let boxes=document.querySelectorAll(".box");
let resetBtn=document.querySelector("#reset-btn");
let new_btn =document.querySelector("#new-btn");
let msgContainer=document.querySelector(".msg-container");
let msg=document.querySelector("#msg");

let turn=true; //playerlX player2O

const winPatterns=[
    [0,1,2] ,
    [0,3,6],
    [0,4,8],
    [1,4,7],
    [2,5,8],
    [2,4,6],
    [3,4,5],
    [6,7,8],
];

const resetGames =()=>{
  turn=true;
  enableleBoxes();
  msgContainer.classList.add("hide");
}


boxes.forEach((box) =>{
    box.addEventListener("click",()=>{
       // console.log("box was clicked");
        if(turn){
            box.innerText="O";
            turn=false;
        }else{
            box.innerText="X";
            trun=true;
           }
         box.ariaDisabled=true;

         checkWinner();
    });
})

const disableBoxes=()=>{
   for(let box of boxes){
    box.disabled =true;
   }
}

const enableleBoxes=()=>{
   for(let box of boxes){
    box.disabled =false;
    box.innerText="";
   }
}

const showWinner =(Winner)=>{
    msg.innerText=`Congrtulations, Winner is ${Winner} `;
    msgContainer.classList.remove("hide");
    disableBoxes();
}


const checkWinner=()=>{
    for(let pattern of winPatterns){
       console.log(pattern[0],pattern[1],pattern[2]);
       console.log(
        boxes[pattern[0]].innerText,
        boxes[pattern[1]].innerText,
        boxes[pattern[2]].innerText
       );
      let pos1Val=boxes[pattern[0]].innerText;
      let pos2Val=boxes[pattern[1]].innerText;
      let pos3Val=boxes[pattern[2]].innerText;

      if(pos1Val !="" && pos2Val !="" && pos3Val !=""){
        if(pos1Val === pos2Val && pos2Val===pos3Val){
         //   console.log("Winner",pos1Val);
            showWinner(pos1Val);
        }
      }
    }
};

new_btn.addEventListener("click",resetGames);
resetBtn.addEventListener("click",resetGames);