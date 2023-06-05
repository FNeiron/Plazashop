const signInForm = document.querySelector(".wrapper");
const insertForm = document.querySelector("#ins");
const updateForm = document.querySelector("#upd");
const deleteForm = document.querySelector("#del");
signInForm.classList.add("active");
document.querySelectorAll("#cf").onclick = () => {
  
  signInForm.classList.remove("active");
};
document.querySelector("#insert").onclick = () => {
  e.preventDefault();
  insertForm.classList.add("active");
};


document.querySelector("#cf1").onclick = () => {
  insertForm.classList.remove("active");
};


/* ========== SignIn Form =========== */



document.getElementById('shop').onclick = function() {
  window.location.href = 'shop.html';
};


const numInForm = document.querySelector("header .wrapper");
document.querySelector(".zakaz").onclick = () => {
  e.preventDefault();
  numInForm.classList.add("active");
};

document.querySelector(".close-form").onclick = () => {
  numInForm.classList.remove("active");
};






document.querySelector("#update").onclick = () => {
  e.preventDefault();
  updateForm.classList.add("active");
};

document.querySelector("#cf2").onclick = () => {
  updateForm.classList.remove("active");
};



document.querySelector("#delete").onclick = () => {
  e.preventDefault();
  deleteForm.classList.add("active");
};

document.querySelector("#cf3").onclick = () => {
  deleteForm.classList.remove("active");
};